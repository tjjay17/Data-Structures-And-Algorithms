/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

/**
 *
 * @author Tj
 */
public class SelectionSort {
    public SelectionSort(){
        super();
    }
    private int [] sort(int [] arr){
       int minIndex = 0;
       int temp = 0;
       
       for(int i = 0; i<arr.length;i++){
           minIndex = i;
           for(int j = i+1; j<arr.length;j++){
               if(arr[j] < arr[minIndex]){
                   minIndex = j;
               }
           }
           temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
       return arr;
    }
    
    public static void main(String [] args){
        SelectionSort instance = new SelectionSort();
        int [] input = new int[]{2,5,9,7,1};
        int [] result = instance.sort(input);
        for(int c = 0; c<result.length; c++){
            System.out.println(result[c]);
        }

    }

}

