package springdemo;

public class GameRunner {

    private GamingConsole game;

    GameRunner(Packman game){
        this.game=game;
    }

    public void Run(){
        System.out.println(this.game+"Game is running!");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
