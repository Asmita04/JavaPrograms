package com.Exercise;

import java.util.Arrays;

public class Intersection1 {


//    public static  int[] intersection(int[] num1, int[] num2) {
//        int[] res = new int[ Math.min(num1.length, num2.length)];
//        int k=0;
//        for (int i = 0; i < num1.length; i++) {
//            for (int j = 0; j < num1.length; j++) {
//                if (num1[i] == num2[j]) {
//                    res[k++] = num1[i];
//                }
//            }
//
//        }
//

// ------------------------------------------------------------------------------
        public static int[] findIntersection ( int[] arr1, int[] arr2){
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int len1 = arr1.length;
            int len2 = arr2.length;
            int[] intersection = new int[Math.min(len1, len2)];
            int index = 0;

            int i = 0, j = 0;

            while (i < len1 && j < len2) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    j++;
                } else {
                    intersection[index++] = arr1[i];
                    i++;
                    j++;
                }
            }

            return Arrays.copyOf(intersection, index);
        }

    public static void main(String[] args) {
        int[] arr1=new int[]{1,3,4,5,6,7,2};
        int[] arr2=new int[]{5,6,7,8};

        //  System.out.println(intersection(arr1,arr2));
        for(int x: findIntersection(arr1,arr2)){
            System.out.println(x+",");
        }

    }
}
