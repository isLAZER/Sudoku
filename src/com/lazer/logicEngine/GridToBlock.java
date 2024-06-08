package com.lazer.logicEngine;

/* This is a basic conversion process to convert from grid to block or vice versa
 * i.e.
 * a a a    b b b    c c c                        a a a    a a a    a a a
 * a a a    b b b    c c c                        b b b    b b b    b b b
 * a a a    b b b    c c c                        c c c    c c c    c c c
 * 
 * d d d    e e e    f f f     < ---------- >     d d d    d d d    d d d
 * d d d    e e e    f f f     < ---------- >     e e e    e e e    e e e
 * d d d    e e e    f f f     < ---------- >     f f f    f f f    f f f
 * 
 * g g g    h h h    i i i                        g g g    g g g    g g g
 * g g g    h h h    i i i                        h h h    h h h    h h h
 * g g g    h h h    i i i                        i i i    i i i    i i i
 */

public class GridToBlock {

    private final int[][] Block = new int[9][9];
    
    public int[][] blockFormer(int[][] array){

        for (int j = 0; j < 7; j += 3){
            // Opreating on Row 1, 2 and 3.
            for (int i = 0; i < 3; i++){
                Block[j][i] = array[j][i];
                Block[j][i+3] = array[j+1][i];
                Block[j][i+6] = array[j+2][i];
            }
            // Opreating on Row 4, 5 and 6.
            for (int i = 3; i < 6; i++){
                Block[j+1][i-3] = array[j][i];
                Block[j+1][i] = array[j+1][i];
                Block[j+1][i+3] = array[j+2][i];
            }
            // Opreating on Row 7, 8 and 9.
            for (int i = 6; i < 9; i++){
                Block[j+2][i-6] = array[j][i];
                Block[j+2][i-3] = array[j+1][i];
                Block[j+2][i] = array[j+2][i];
            }
        }

        return Block;

    }

}