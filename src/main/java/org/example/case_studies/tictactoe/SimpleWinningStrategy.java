package org.example.case_studies.tictactoe;

public class SimpleWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, int row, int col, Player player){

        int size= board.size;
        String currentToken = player.token;

        //check row
        boolean rowDecision=true;
        for(int i=0;i<size;i++){
            if(!board.grid[row][i].token.equals(currentToken)){
                rowDecision=false;break;
            }
        }
        //check col
        boolean colDecision=true;
        for(int i=0;i<size;i++){
            if(!board.grid[i][col].token.equals(currentToken)){
                colDecision=false;break;
            }
        }
        //check diag
        boolean diag1Decision = true;
        if(row==col){
            for(int i=0;i<size;i++){
                if(!board.grid[i][i].token.equals(currentToken)){
                    diag1Decision=false; break;
                }
            }
        }else{
            diag1Decision = false;
        }
        //check diag2
        boolean diag2Decision = true;
        if(row+col==size-1){
            for(int i=0;i<size;i++){
                if(!board.grid[i][size-1-i].token.equals(currentToken)){
                    diag2Decision=false; break;
                }
            }
        }else{
            diag2Decision = false;
        }
        return rowDecision||colDecision||diag1Decision||diag2Decision;
    }
}
