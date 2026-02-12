package source.player;

public class Player {
    private Dice dices[] = new Dice[2];   
    private String name;
    private Boolean isBlocked = false;
    private int life = 5;
    private Piece boat = new Piece();

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

    public void move(int dist){
        //logger
        boat.move(dist);
    }

    public String getName() {
        return name;
    }

    public int getPosition(){
        return boat.getPosition();
    }
}
