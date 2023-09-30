package com.Exercise;

import java.util.HashSet;
import java.util.Set;

/* Online Java Compiler and Editor */
/*arr1=[8,7,5,6,4]
arr2=[7,8,4,6]*/
public class MissingNumber{
    public static void missingElement (int[] arr1, int[] arr2){

        Set<Integer> set2 = new HashSet<>();
        for(Integer i : arr2) {
            set2.add(i);
        }

        for(Integer i : arr1) {
            if(!set2.contains(i)) {
                System.out.println(i);
            }
        } // O(2n) = n

//        for(int i=0;i<arr1.length;i++){
//            boolean flag=true;
//            for(int j=0;j<arr2.length;j++){
//
//                if(arr1[i] == arr2[j]) {
//                    flag = false;
//                    break;
//                }
//
//
//            }
//            if(flag) System.out.println(arr1[i]);
//        }

    }




    public static void main(String []args){
        int[] arr1 = new int[]{8,7,5,6,4};
        int[] arr2=new int[]{7,8,4,6};
        missingElement(arr1,arr2);


    }
}