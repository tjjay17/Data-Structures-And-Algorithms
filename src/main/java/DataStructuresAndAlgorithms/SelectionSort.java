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
        int len = arr.length;
        int temp = 0;
        int min = 0;
        
        for(int i = 0; i<len - 1; i++){
            min = i;
            for(int j = i + 1; j< len; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
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

