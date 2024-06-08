package com.lazer.logicEngine;

/* This program is used to check the elements in grid to see if they
 * are placed according to the rules of sudoku that is unique elements
 * in all the rows, columns and blocks of the grid.
 * 
 * It uses basic method of checking that is iterating through all the
 * elements in the grid to assess the row and column check.
 * Though in the case of block it is first converted from blocks into
 * rows, that is each block is arranged in form of rows and then only
 * row checking is applied on the new formed grid in the same way.
 */
public class SudokuGridAssessor{

    public boolean GridChecker(int[] array){
        int[][] Grid2D = convertTo2D(array);
        //Row Column Checking
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                for (int k = 0; k < 9; k++){
                    if (Grid2D[i][j] == Grid2D[i][k] && Grid2D[i][j] != 0 && j != k){
                        return false;
                    }
                    if (Grid2D[j][i] == Grid2D[k][i] && Grid2D[j][i] != 0 && j != k){
                        return false;
                    }
                }
            }
        }
        int[][] Block2D = new GridToBlock().blockFormer(Grid2D);
        //Row Checking of blocks.
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                for (int k = 0; k < 9; k++){
                    if (Block2D[i][j] == Block2D[i][k] && Block2D[i][j] != 0 && j != k){
                        return false;
                    }
                }
            }
        }
        
        return true;
        
    }

/* This function is used to convert the preexisting Grid array into
 * a 2 Dimentional array, this is because it gets easier to operate on
 * array when it is passed in Sudoku Grid Assessor though it is initially
 * kept 1 Dimentional as it provides a easier path in adding elements in
 * both houses and in blocks. Where houses are the rows of the grid and
 * blocks are the smallar 9*9 grids. 
 */
    public int[][] convertTo2D(int[] array){

        int[][] converted = new int[9][9];
        int n = 0;

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                converted[i][j] = array[n];
                n++;
            }
        }

        return converted;

    }

}