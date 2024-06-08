# Sudoku

Welcome to the Sudoku project! This application is designed to provide a user-friendly interface for solving and playing Sudoku puzzles. It is built using Java Swing for the graphical user interface and contains a robust back-end logic engine to handle Sudoku grid operations.

## Features

- **Interactive GUI**: A clean and intuitive interface for solving and playing Sudoku.
- **Dynamic Grid**: Automatically adjusts and updates the Sudoku grid as you input numbers.
- **Error Detection**: Highlights errors in the grid to help you correct mistakes.
- **Key Controls**: Easy-to-use key bindings for number input and special commands.
- **Reset Functionality**: Quickly reset the grid to start a new game.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/sudoku-solver-game.git
   cd sudoku-solver-game
   ```

2. **Compile the Source Code**:
   ```bash
   javac src/com/lazer/Main.java src/com/lazer/displayEngine/*.java src/com/lazer/logicEngine/*.java
   ```

3. **Run the Application**:
   ```bash
   java -cp bin com.lazer.Main
   ```

## Packaging into a JAR File

1. **Create the JAR File**:
   ```bash
   jar cvfm SudokuSolverGame.jar META-INF/MANIFEST.MF -C bin com
   ```

2. **Run the JAR File**:
   ```bash
   java -jar SudokuSolverGame.jar
   ```

## Usage

### Key Bindings

- **r**: Reset the input of the grid.
- **x**: Exit the application.
- **n**: Start a new game.
- **m**: Cycle between difficulty levels (easy, normal, hard).
- **1-9**: Change the currently selected number.

### Game Instructions

1. **Start the Application**:
   - Run the code, and a new game will automatically start.
   
2. **Input Numbers**:
   - Select the desired number (1-9) and click on the grid at the desired spot to place the number.
   
3. **Monitor Game Status**:
   - The status bar at the bottom of the grid, it will display the current state of the game:
     - "STATUS: NEW GAME STARTED" when a new game starts.
     - "STATUS: ERROR DETECTED" if there's an error in the grid.
     - "STATUS: ONGOING" during the game.
     - "STATUS: SOLVED" once the puzzle is correctly solved.
   
4. **Control the Game**:
   - Press 'r' to reset the grid at any time.
   - Press 'n' to start a new game.
   - Press 'm' to cycle through difficulty levels.

## Contributing

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Acknowledgements

- [Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/)
- [Sudoku](https://en.wikipedia.org/wiki/Sudoku)