package source.game;

import source.player.Player;

public interface IUserInterface {
    void logDiceRoll(int rollVal);
    void logGameState();
    void logGameOver(Player winner);
}
