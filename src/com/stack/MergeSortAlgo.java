package com.stack;

public class MergeSortAlgo {
    void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ,");
        }
    }
    void mergeSort(int[] arr, int L, int R){
        if( L< R){
            int mid= L+R/2;
            mergeSort(arr,L,mid);
            mergeSort(arr,mid+1,R);
            merge(arr,L,mid,R);

        }

    }

    public void merge(int[] arr, int L, int mid, int R) {
        int[] res=new int[R-L+1];

        int i=L;
        int j=mid+1;
        int k=0;

        while( i<mid && j<R){
            if(arr[i]<arr[j]){
                res[k++]=arr[i++];
            }
            else if(arr[i]>arr[j]){
                res[k++]=arr[j++];
            }
            else{
                while(i<mid){
                    res[k++]=arr[i++];
                }
                while(j<R){
                    res[k++]=arr[j++];

                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}