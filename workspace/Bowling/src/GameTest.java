import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	Game game = new Game();
	
	@Before
	public void setUp() {
		game = new Game();
	}
	
	@Test
	public void canScoreGutterGame() {
		roll(20, 0);
		assertThat(game.score(), is(0));
	}
	
	@Test
	public void canScoreGameOfOnes() {
		roll(20, 1);
		assertThat(game.score(), is(20));
	}
	
	@Test
	public void canScoreSpareFollwedByThree() {
		roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(game.score(), is(16));
	}
	
	private void roll(int times, int pinsDown) {
		for(int i = 0; i < times; i++) {
			game.roll(pinsDown);
		}
	}
}
