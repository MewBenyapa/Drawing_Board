public class Game {
	
	private int roll = 0;
	private int[] rolls = new int[21];
	
	public void roll(int pinsDown) {
		rolls[roll++] = pinsDown;
	}
	
	public int score() {
		int score = 0;		
		int cursor = 0;
		for(int frame = 0; frame < rolls.length; frame++) {
			if(isSpare(cursor)) {
				score += 10 + rolls[cursor + 2];
				cursor += 2;
			} else {				
				score += rolls[cursor] + rolls[cursor + 1];
				cursor +=2;
			}
		}
		return score;
	}
	
	public boolean isSpare(int cursor) {
		return rolls[cursor] + rolls[cursor + 1] == 10;
	}

}
