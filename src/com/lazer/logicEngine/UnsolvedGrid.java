package com.lazer.logicEngine;

import java.util.*;

public class UnsolvedGrid {

    private static int[] solved;
    private static int[] unsolved;
    private static final Random random = new Random();

    public static int[] generate(int difficulty){

        // Generating a solved grid.
        solved = SudokuGrid.generate();
        unsolved = Arrays.copyOf(solved, 81);
        int n;

        // Based on difficulty the anomunt of numbers are removed.
        switch (difficulty) {
            case 0 -> {
                n = random.nextInt(40, 46);
                remover(n);
            }
            case 1 -> {
                n = random.nextInt(48, 54);
                remover(n);
            }
            default -> {
                n = random.nextInt(55, 61);
                remover(n);
            }
        }

        return unsolved;

    }

    private static void remover(int n){

        int m;
        // Removing n amount of elements of grid.
        for (int i = 0; i < n; i++){
            while (true) {
                m = random.nextInt(81);
                if (unsolved[m] != 0){
                    unsolved[m] = 0;
                    break;
                }
            }
        }

    }

}
