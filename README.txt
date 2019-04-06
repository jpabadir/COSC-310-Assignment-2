My name: Jean-Philippe Abadir


Class Structure

MainRunner Class:
-Main(): This method intializes the Bot and sets all needed variables for it.It is also responsible for launchign the app, from the SwingApp class. 

SwingApp class:
Contains all the code responsible for the GUI. One of its main funtions is to handle the pressing of the submit button which:
- Checks and corrects spelling mistakes in the input 
- Displays the corrected sentence in the label above
- Gets the robot's response and displays it underneath the question just asked
- Clears the text input field to make room for new text

Bot Class:
-Bot(name): initializing method, sets name of bot
-createResponseList(list): Initializes and sets the keys and responses list
-getWeather(city): this method builds a string for the weather information
    of a given city
-getName(): this method returns the name of the bot
-getResponse(input): this method does the pattern matching and input checking.

Weather Class: Gather weather information of a city
-weather(location): Initialize Weather Class and perform a GET request to open weather API
-getTemp(): return the temperature of the city
-getWeatherMain(): return the main description of the weather
-getWeatherDesc(): this method returns a more thorough description of the city's weather
-setWeatherInfo(): this method processes parse the given JSON and sets the weather information fields
-setTemp(): parse given JSON and gets the weather temperature

SpellCheck class : Perform a spelling check on a sentence
-SpellCheck(): Constructor for class and call setNewSentence method
-setNewSentence(sentence): set new sentence for the class and call process method
-process(): process the given sentence and set fixed sentence member field with the corrected sentence (if any)
-getCorrectedSentence(): returns the corrected sentence
-getRawSentence(): returns the unprocessed sentence, if needed

List of all features programmed for this assignment:
- Basic GUI with a text input field, a submit button, and a label on top to display the recent conversation history (please see picture 1 for conversation snippet demonstration)
    - This feature improves my agent's conversation by providing a nicer environment for the user to use the program without seeing all the code behind it or directly using the IED. 
- Added an extra topic to the agent's conversation: now, the agent can play a fun game of recognizing song parts and completing them (please see picture 2 for conversation snippet demonstration)
    - This features improves my agent's conversation by giving the user more possibilities of topic range to speak with the agent. 
- Added a feature which selects and displays a random answer from 5 different potential answers when the robot does not know what to say (please see picture 3 for conversation snippet demonstration)
    -  This features improves my agent's conversation by making it less predictable and mechanical, giving the user more to discover. 
