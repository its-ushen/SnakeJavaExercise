import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame {
    private static final int BOARD_SIZE = 10;
    private static final char EMPTY = '.';
    private static final char SNAKE_BODY = 'O';
    private static final char FOOD = '*';

    private LinkedList<Point> snake;
    private Point food;
    private char[][] board;
    private Direction direction;

    public SnakeGame() {
        snake = new LinkedList<>();
        board = new char[BOARD_SIZE][BOARD_SIZE];
        direction = Direction.RIGHT;

        initializeBoard();
        spawnSnake();
        spawnFood();
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private void spawnSnake() {
        snake.clear();
        int startX = BOARD_SIZE / 2;
        int startY = BOARD_SIZE / 2;

        snake.add(new Point(startX, startY));
        board[startX][startY] = SNAKE_BODY;
    }

    private void spawnFood() {
        // Put one instance of food on the board
    }

    private void printBoard() {
//        Display the board
    }

    private void move() {
        // move to new cell
        // Add to body if food on new position
    }

    private void gameOver() {
        System.out.println("Game Over!");
        System.exit(0);
    }

    private void handleInput() {
        // HINT: Read in input & use a switch statement to select the movement direction
    }

    public void run() {
        while (true) {
            printBoard();
            handleInput();
            move();
        }
    }

    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();
        snakeGame.run();
    }
}




