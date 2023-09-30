package com.Exercise;

public class StringExampleQ {
    public static void main(String[] args){
//            String s1= args[1];
//            String s2= args[2];
//            String s3= args[3];
//            String s4= args[4];
//            System.out.println("arg[2]"+s1);
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
        for(int i=0;i<args.length;i++){
            System.out.println("args[i]="+args[i]);
        }

        System.out.println(args.length);

        final int a;
        a=10;
        //a=10;
        System.out.println(a);
    }
}
