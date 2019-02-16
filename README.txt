Class Structure

Main Class:
-Main(): This method intializes the Bot and sets all needed variables for it.
    It also asks the user for input and then passes it to the Bot to pattern match.
-Timer: ?

Bot Class:
-Bot(name): initializing method, sets name of bot
-createResponseList(list): Initializes and sets the keys and responses list
-getSpecial(match,input): this method returns any special cases of responses
    that require additional conditions and variables
-getWeather(city): this method builds a string for the weather information
    of a given city
-getName(): this method returns the name of the bot
-getResponse(input): this method does the pattern matching and input checking.
    If there are any special input matches it calls getSpecial().

Weather Class: