package org.example.case_studies.tictactoe;

public class Cell {
    boolean isEmpty;
    String token;
    Player player;
    Cell(){
        isEmpty = true;
        token = "";
        player=null;
    }
    public void write(String token, Player player){
        isEmpty = false;
        this.token = token;
        this.player = player;
    }
    public String getToken(){
        return this.token;
    }
    public boolean isEmpty(){
        return isEmpty;
    }
}
