
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {

		String[][] keywordsandAswers =
				
				{ { "how", "is", "weather", "it's nice!" }, { "how", "is", "food", "I'm a robot, I don't eat food!" },
						{ "where", "do", "you", "live", "in your laptop" } };

		boolean shouldRun = true; // set to false if the program should stop
		Scanner in = new Scanner(System.in); // to read user's input

		while (true) {
			String currentInput = in.nextLine(); // read the user's input
			if (currentInput.equals("bye"))
				break;
			String[] inputArray = currentInput.split(" "); // turn the user's input into an array of strings, each
															// element
															// being a different word of the input
			int[] matchingLevel = new int[keywordsandAswers.length];
			for (int i = 0; i < inputArray.length; i++) {
				for (int j = 0; j < keywordsandAswers.length; j++) {
					for (int k = 0; k < keywordsandAswers[j].length; k++) {
						if (inputArray[i].equals(keywordsandAswers[j][k]))
							matchingLevel[j]++;
					}
				}
			}
			int maxMatching = 0;
			int indexMaxMatching = -1;
			for (int i = 0; i < matchingLevel.length; i++) {
				if (matchingLevel[i] > maxMatching) {
					maxMatching = matchingLevel[i];
					indexMaxMatching = i;
				}

			}
			int indexLast = keywordsandAswers[indexMaxMatching].length - 1;
			System.out.println(keywordsandAswers[indexMaxMatching][indexLast]);
		}
		System.out.println("I'll see you");
	}
	
	public String buildWeatherAnswer(String city) {
		Weather w = new Weather(city);
		return "we have "  ;
	}

}
