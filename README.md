# Object-orienteed programming in Java.

**Representing the simple game which fits all the conditions of OOP!**

# Fundamentals of OOP:

-*Encapsulation*: The Game and Level classes encapsulate the data and behavior related to the game and its levels, respectively. The data and behavior of each class are contained within the class and are not directly accessible from outside the class.

-*Abstraction*: The Game class provides an abstract interface for playing the game, and the Level class provides an abstract representation of a level in the game.

-*Inheritance*: The Game and Level classes could potentially be subclassed to create more specific types of games or levels. For example, you could create a MazeGame class that extends the Game class and adds additional behavior for generating and solving mazes.

-*Polymorphism*: The Game and Level classes could potentially be subclassed and the playLevel method could be overridden to provide different gameplay behavior for different types of games or levels.

-*Composition*: The Game class has a Level object as a member variable, and it uses this object to manage the current level of the game. This is an example of composition, where the Game class is composed of a Level object.

# How does it work?

The class called Game has a run method that loops through each level of the game, and a playLevel method that handles the gameplay for a single level. The Level class has a number of methods that are used to update and manage the state of the level, including update, printStatus, isInProgress, isCompleted, and isLost. To play the game, you would need to run the main, which will create a new Game object and start the game loop. The game will continue until the player has completed all levels or lost the game. Enjoy!
