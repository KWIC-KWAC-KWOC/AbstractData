// Done by: Gangadevi D/O Balakrishnan

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private ArrayList<String> titles = new ArrayList<String>();
	private ArrayList<String> wordsToIgnore = new ArrayList<String>();
	private Scanner sc = new Scanner(System.in);

	public void readInput() throws IOException {

		titlesFromUser();
		wordsToIgnoreFromUser();
	}

	private void titlesFromUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter number of titles: ");
		int noOfTitles = sc.nextInt();

		System.out.println("Enter titles: ");

		for (int i = 0; i < noOfTitles + 1; i++) {
			titles.add(sc.nextLine());
		}

	}

	private void wordsToIgnoreFromUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter number of words to ignore: ");
		int noOfwordsToIgnore = sc.nextInt();

		System.out.println("Enter words to ignore: ");

		for (int i = 0; i < noOfwordsToIgnore + 1; i++) {
			wordsToIgnore.add(sc.nextLine().toLowerCase());
		}
	}

	public ArrayList<String> getTitles() {
		return titles;
	}

	public ArrayList<String> getwordsToIgnore() {
		return wordsToIgnore;
	}
}
