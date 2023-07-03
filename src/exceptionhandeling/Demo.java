package exceptionhandeling;

public class Demo {

    private static Object Exception;

    static int Area(int length, int breadth) throws Exception
    {

            if(length<0 || breadth<0)
                throw new Exception();
            return  length*breadth;

    }
    static void display() throws Exception
    {
        System.out.println("Area is:"+Area(10,-5));
    }


    public static void main(String[] arg) throws Exception{

       //  Area(5,10);

        try{
            display();
        }catch (Exception e)
        {
            System.out.println(e);
        }


        



    }
}



