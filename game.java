import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Game game = new Game();
    game.run();
  }
}

class Game {
  private static final int NUM_LEVELS = 3;
  private int currentLevel; 
  private boolean gameOver;
  public Game() {
    currentLevel = 1;
    gameOver = false;
  }

  public void run() {
    while (!gameOver) {
      playLevel();
      if (currentLevel > NUM_LEVELS) {
        gameOver = true;
        System.out.println("Congratulations! You have completed all levels.");
      } else {
        currentLevel++;
      }
    }
  }

  private void playLevel() {
    System.out.println("Welcome to level " + currentLevel + "!");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String playerName = scanner.nextLine();
    System.out.println("Your goal is to collect all the coins in this level.");
    System.out.println("Controls: W = Move up, S = Move down, A = Move left, D = Move right");
    Level level = new Level(currentLevel);
    while (level.isInProgress()) {
      level.printStatus();
      System.out.print("Enter your next move: ");
      String move = scanner.nextLine();
      level.update(move);
    }

    if (level.isCompleted()) {
      System.out.println("Congratulations, " + playerName + "! You have completed this level.");
    } else {
      System.out.println("Sorry, " + playerName + ". You have lost this level.");
    }
  }
}

class Level {
  private int levelNumber;  
  private int numCoins;     
  private int playerX;      
  private int playerY;   

  public Level(int levelNumber) {
    this.levelNumber = levelNumber;
    this.numCoins = 5 * levelNumber;
    this.playerX = 0;
    this.playerY = 0;
  }

  public void update(String move) {
    if (move.equals("W")) {
      playerY--;
    } else if (move.equals("S")) {
      playerY++;
    } else if (move.equals("A")) {
        playerX--;
    } else if (move.equals("D")) {
        playerX++;
    }

  public void printStatus() {
    System.out.println("Level: " + levelNumber);
    System.out.println("Coins: " + numCoins);
    System.out.println("Player: (" + playerX + ", " + playerY + ")");
  }

  public boolean isInProgress() {
    return numCoins > 0 && !isLost();
  }

  public boolean isCompleted() {
    return numCoins == 0;
  }

  public boolean isLost() {
    return playerX < 0 || playerX > 9 || playerY < 0 || playerY > 9;
  }
}
