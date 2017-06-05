package ui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.Timer;

import model.Game;
import model.Point;

public class UI extends JFrame implements KeyListener {

	private JPanel gamePane;
	private JButton replayButton;
	
	private Game game;
	private Timer renderLoop;
	private int fps = 60;
	
	public UI() {
		game = new Game();
		initComponents();
		initRenderLoop();
		initController();
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initComponents() {
		setLayout(new BorderLayout());
		
		gamePane = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				drawPlayer(g);
			}
		};
		Point worldSize = game.getWorldSize();
		gamePane.setPreferredSize(new Dimension(worldSize.getX(), worldSize.getY()));
		gamePane.setDoubleBuffered(true);
		add(gamePane);
		
		replayButton = new JButton("Replay");
		replayButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				replay();
			}
		});
		replayButton.setEnabled(false);
		add(replayButton, BorderLayout.SOUTH);
	}
	
	private void initRenderLoop() {
		renderLoop = new Timer(1000 / fps, null);
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gamePane.repaint();
				if(game.isOver()) {
					replayButton.setEnabled(true);
				}
			}
		};
		renderLoop.addActionListener(listener);
		renderLoop.start();
	}
	
	private void initController() {
		this.addKeyListener(this);
		gamePane.addKeyListener(this);
		replayButton.addKeyListener(this);
	}

	private void drawPlayer(Graphics g) {
		g.setColor(Color.green);
		int r = game.getPlayerRadius();
		int x = game.getPlayerLocation().getX();
		int y = game.getPlayerLocation().getY();
		g.fillOval(x - r, y - r, r * 2, r * 2);
	}

	public void start() {
		game.startGame();
	}

	public void replay() {
		SwingWorker sw = new SwingWorker() {
		    public Object doInBackground(){
		      game.startReplay();            
		        return null;
		   }
		 }; 
		 sw.execute();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			game.turnPlayerWest();
			break;
		case KeyEvent.VK_RIGHT:
			game.turnPlayerEast();
			break;
		case KeyEvent.VK_UP:
			game.turnPlayerNorth();
			break;
		case KeyEvent.VK_DOWN:
			game.turnPlayerSouth();
			break;
		default:
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) { }

	@Override
	public void keyReleased(KeyEvent e) { }

	public static void main(String[] args) {
		UI ui = new UI();
		ui.setVisible(true);
		ui.start();
	}
	
}
