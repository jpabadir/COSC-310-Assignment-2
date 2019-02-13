
import java.util.Date;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		Timer timer = new Timer();
		String[][] keywordsandAswers =

				{ { "how", "is", "weather", buildWeatherAnswer("Kelowna") },
						{ "how", "is", "food", "I'm a robot, I don't eat food!" },
						{ "where", "do", "you", "live", "in your laptop" }, { "what", "is", "name", "The Benefit Bot" } }; // in this 2D
																										// array, we are
																										// storing the
																										// keywords and
																										// the answer
																										// they match
																										// to. Each row
																										// contains one
																										// answer, and
																										// all the
																										// corresponding
																										// keywords
		
		Scanner in = new Scanner(System.in); // to read user's input
		while (true) {
			if()
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
			System.out.println(keywordsandAswers[indexMaxMatching][indexLast]); // respond with the right answer
			timer.start();
		}
		in.close();
		System.out.println("I'll see you");
	}

	public static String buildWeatherAnswer(String city) {
		Weather w = new Weather(city);
		return "we have " + w.getWeatherDesc() + " in " + city + " and the temperature is " + w.getTemp() + " °C";
	}
	
	
	private static class Timer {
		Date date = new Date();
		double startTime;  
		void start() {
			startTime = date.getTime();
		}
	}

}
