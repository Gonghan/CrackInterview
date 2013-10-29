package com.gonghan.chapter19;

/*
 * The Game of Master Mind is played as follows:
 The computer has four slots containing balls that are red (R), yellow (Y), green (G) or blue (B). For example, the computer might have RGGB (e.g., Slot #1 is red, Slots #2 and #3 are green, Slot #4 is blue).
 You, the user, are trying to guess the solution. You might, for example, guess YRGB.
 When you guess the correct color for the correct slot, you get a “hit”. If you guess a color that exists but is in the wrong slot, you get a “pseudo-hit”. For example, the guess YRGB has 2 hits and one pseudo hit.
 For each guess, you are told the number of hits and pseudo-hits.
 Write a method that, given a guess and a solution, returns the number of hits and pseudo hits.
 */
public class Q5 {
	public Q5() {

	}

	public Result guess(String solution, String guess) {
		char[] solutionChars = solution.toCharArray();
		char[] guessChars = guess.toCharArray();
		int hits = 0;
		int pseudo_hits = 0;
		for (int i = 0; i < 4; i++) {
			if(guessChars[i] == solutionChars[i]){
				hits++;
				guessChars[i] = '!';
				solutionChars[i] = '@';
			}
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					continue;

				} else {
					if (guessChars[i] == solutionChars[j]) {
						pseudo_hits++;
						guessChars[i] = '!';
						solutionChars[j] = '@';
					}
				}

			}

		}
		return new Result(hits, pseudo_hits);
	}

}

class Result {
	private int hits;
	private int pseudo_hits;

	public Result(int hits, int pseudo_hits) {
		this.hits = hits;
		this.pseudo_hits = pseudo_hits;
	}

	public int getHits() {
		return hits;
	}

	public int getPseudo_hits() {
		return pseudo_hits;
	}
}
