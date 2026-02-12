package source.game;

import source.player.Player;

public class Game {
    private Boolean gameOver = false;
    private Player players[];
    private Logger outStream = new Logger();

    public Game(){
        for (int i = 0; i < players.length; i++) {
            // later we may add a way to chose name
            players[i] = new Player("P" + i);
        }
    }

    public void playTurn(){
        // play turn on each player
        //  -> roll dice
        //  -> advance
        //  -> log action
        //  -> check end condition

        // log game state
    }
}
