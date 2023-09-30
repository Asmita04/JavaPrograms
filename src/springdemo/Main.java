package springdemo;
//import org.springframework.context.ApplicationContext;


public class Main {
    public static void main(String[] args) {

        

        Packman packman=new Packman();


       GameRunner gameRunner=new GameRunner(packman);
       gameRunner.Run();

    }
}
