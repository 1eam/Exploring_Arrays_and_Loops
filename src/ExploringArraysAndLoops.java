
public class ExploringArraysAndLoops {

	public static void main(String[] args) {
		String[] storedLetter = new String [11];
		storedLetter [0] = " ";
		storedLetter [1] = "A";
		storedLetter [2] = "B";
		storedLetter [3] = "C";
		storedLetter [4] = "D";
		storedLetter [5] = "E";
		storedLetter [6] = "F";
		storedLetter [7] = "G";
		storedLetter [8] = "H";
		storedLetter [9] = "I";
		storedLetter [10] ="J";
		for (int i = 2; i <= 8; i++)
			System.out.print(storedLetter[i]);

		
		char[] storedCharacter = new char [11];
		storedCharacter [1] = 'S';
		storedCharacter [2] = '.';
		storedCharacter [3] = '.';
		storedCharacter [4] = '.';
		storedCharacter [5] = '.';
		storedCharacter [6] = 'E';

		for (int i = 0; i <= 6; i++) {
			System.out.println(storedCharacter[i]);
		storedCharacter [6] = 'O';
		storedCharacter [1] = 'X';
		}

	}
}
