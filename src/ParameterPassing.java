public class ParameterPassing {

    static String change(String str)
    {
        str="Hello";
         return str;
    }
//    static void change(int[] arr,int value)
//    {
//        arr[0]=value;
//    }
    public static void main(String[] args){
    int[] arr=new int[5];

    String str=new String("Asmita");

        System.out.println("String is :"+  change(str));


    arr[0]=5;
    arr[1]=10;
    arr[2]=5;
    arr[3]=5;
    arr[4]=5;
/*
    change(arr,100);
        System.out.println("Array is:");
        for(int x:arr)
        {
            System.out.println(x);
        }

*/
    }
}
