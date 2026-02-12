package source.player;

public class Player {
    private Dice dices[] = new Dice[2];   
    private String name;
    private Boolean isBlocked = false;
    private int life = 5;

    public Player(String name){
        this.name = name;
    }

    public int rollDice(){
        int sum = 0;
        for (int i = 0; i < dices.length; i++) {
            sum += dices[i].roll();
        }

        return sum;
    }

    public String getName() {
        return name;
    }
}
