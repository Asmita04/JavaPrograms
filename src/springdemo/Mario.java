package springdemo;

public class Mario  implements GamingConsole{
    public void up(){
        System.out.println("Go into hole");
    }

    public void down(){
        System.out.println("fell down");
    }

    public void left(){
        System.out.println("Back");
    }

    public void right(){
        System.out.println("Shoot bullet!");
    }


}
