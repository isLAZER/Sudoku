package com.lazer.logicEngine;

import java.util.*;

/* This program is used to generate a complete randomized grid.
 * It uses random assignment to create the grid. Since the grid is
 * divided in 9 blocks of 9*9 grid, this is used in favour of this
 * program where it loops through all the blocks and assigns numbers
 * on the spot which is occupied by 0, until the grid is fully
 * constructed. It also uses trial and error to get the grid as when
 * the program runs it does generate grid but sometimes there are
 * instances where it is not possible for number to be placed anywhere
 * in this case the program is started again from that number and this
 * process is repeated a few number of times but is still there is no
 * result then after a few tries of this number reset, the program is
 * just started again to get a instance where the grid is generated. 
 */

public class SudokuGrid{

    private final static Random random = new Random();
    
    public static int[] generate(){
        
        int[] sudokuGrid = new int[81];
        int[] temp;
        int x, y, checker = 0, limiter = 0;
        ArrayList<Integer> xOccupied = new ArrayList<>(); // Keeps check on the coordinates
        ArrayList<Integer> yOccupied = new ArrayList<>(); // occupied by particular numbers.
        
        restart: // This block name is used to break the loop and start again from the conflicting number or else completely reset the loop.
        for (int k = 1; k < 10; k++) { // This loop indicates the number that is currently being added.
            temp = Arrays.copyOf(sudokuGrid, 81); // The number is first assigned to a temporary grid which is passed therough Grid assessor and if it returns true then it's copy is assigned to actual grid.
            for (int i = 1; i < 8; i += 3) { // Loops through all the rows of blocks.
                for (int j = 1; j < 8; j += 3) { // Loops throught all the columns of blocks.
                    while (true) { // A trial and error loop sequence which does not terminate until desired result is reached, i.e. number is placed at correct spot in the block.
                        while (true) { 
                            x = random.nextInt(i, i + 3);
                            if (xOccupied.indexOf(x) == -1){ // Checking if the x coordinate in question, is not occupied by the same number in other blocks.
                                break;
                            }
                        }
                        while (true) { 
                            y = random.nextInt(j, j + 3);
                            if (yOccupied.indexOf(y) == -1){ // Checking if the y coordinate in question, is not occupied by the same number in other blocks.
                                break;
                            }
                        }
                        if (temp[x*9-10+y] == 0) { // Checks the chosen spot, to see that it is not occupied by another number.
                            temp[x*9-10+y] = k;
                            xOccupied.add(x);
                            yOccupied.add(y);
                            break;
                        } else {
                            checker++;
                            if (limiter > 9){ // Resetting the whole grid if the number placement is still having errors after all the resets.
                                for (int p = 0; p < 81; p++) {
                                    sudokuGrid[p] = 0;
                                }
                                k = 0;
                                checker = 0;
                                limiter = 0;
                                xOccupied.clear();
                                yOccupied.clear();
                                continue restart;
                            }
                            if (checker > 27) { // Resetting the current number placement in case of confilct.
                                k -= 1;
                                checker = 0;
                                xOccupied.clear();
                                yOccupied.clear();
                                limiter++;
                                continue restart;
                            }
                        }
                    }
                }
            }
            sudokuGrid = Arrays.copyOf(temp, 81);
            xOccupied.clear();
            yOccupied.clear();
        }
        return sudokuGrid;

    }
    
}