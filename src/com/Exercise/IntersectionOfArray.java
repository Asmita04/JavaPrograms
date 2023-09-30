package com.Exercise;

import java.util.ArrayList;

public class IntersectionOfArray {

    public static ArrayList<Integer> intersectionOfArray(int[] arr1,int[] arr2){
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    res.add(arr1[i]);
                }

            }
           // System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[]{4,5,6,7};
        //;
        System.out.println(intersectionOfArray(arr1,arr2));

    }
}
