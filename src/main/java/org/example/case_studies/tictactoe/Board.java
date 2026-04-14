package org.example.case_studies.tictactoe;

public class Board {
    Cell[][] grid;
    int size;
    Board(int size){
        this.size = size;
        grid = new Cell[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                grid[i][j] = new Cell();
        }
    }
    public boolean write(int x, int y, String token, Player player){
        if(grid[x][y].isEmpty()) {
            grid[x][y].write(token, player);
            return true;
        }
        else return false;
    }
    public void print(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.println(grid[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

}
