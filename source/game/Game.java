package source.game;

import source.board.Board;
import source.player.Player;

public class Game {
    private Player players[] = new Player[2];
    private boolean gameOver = false;
    private int turnCount = 0; 
    private IUserInterface journal;
    private Board board;

    public Game(int boardSize, IUserInterface iosteam){
        journal = iosteam;
        board = new Board(boardSize);
        for (int i = 0; i < players.length; i++) {
            // later we may add a way to chose name
            players[i] = new Player("P" + i);
        }
    }

    public void playTurn(){
        for (int i = 0; i < players.length; i++) {
            //  -> roll dice
            int rolledVal = players[i].rollDice();

            //  -> advance
            players[i].move(rolledVal);

            //  special square event (later)

            //  -> check end condition
            if(board.isEndReached(players[i].getPosition())){
                gameOver = true;
                // log end of game
                return;
            }
        }

        // log game state
        journal.logGameState();
    }

    public void playGame(){
        while(!gameOver && turnCount < 100){
            playTurn();
            turnCount++;
        }
    }
}
