// Done by: Gangadevi D/O Balakrishnan

import java.io.IOException;
import java.util.ArrayList;


public class AbstractData {

	public static void main(String[] args) throws IOException{
		//Call input to get input from file
		Input input = new Input();
		input.readInput();
		
		//Call circularshifter
		CircularShifter circularShifter = new CircularShifter();
		circularShifter.setTitles(input.getTitles());
		circularShifter.setwordsToIgnore(input.getwordsToIgnore());
		
		AlphabeticShifter alphaShifter = new AlphabeticShifter();
		ArrayList<String> shiftedWords=alphaShifter.sortTitles(circularShifter.executeShifting());
		
		Outputter output = new Outputter();
		output.showOutputToUser(shiftedWords);
	}
}
