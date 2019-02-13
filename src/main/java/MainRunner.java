
import java.util.Date;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		//initialize bot with a name
		Bot sandra = new Bot("Sandra");

		Timer timer = new Timer();
		//any specials with a key have separate checking conditions for response
		//to get key/index in list, you can say the statement and then say: /get match
		String[][] keywordsandAswers ={
				{ "how", "is", "weather", sandra.getWeather("Kelowna") },
				{ "how", "is", "weather", "in", "[city/place]"}, //key=1, special
				{ "how", "is", "food", "I'm a robot, I don't eat food!" },
				{ "where", "do", "you", "live", "in your laptop" },
				{ "what", "is", "name", sandra.getName() } };
		// in this 2D array, we are storing the keywords and the answer they match to.
		// Each row contains one answer, and all the corresponding keywords
		sandra.createResponseList(keywordsandAswers);
		
		Scanner in = new Scanner(System.in); // to read user's input
		while (true) {
			String currentInput = in.nextLine(); // read the user's input

			//quit the program if user says "bye"
			if (currentInput.toLowerCase().equals("bye"))
				break;

			//get bot response
			sandra.getResponse(currentInput);
		}
		in.close();
		System.out.println("I'll see you");
	}

	private static class Timer {
		Date date = new Date();
		double startTime;  
		void start() {
			startTime = date.getTime();
		}
	}

}