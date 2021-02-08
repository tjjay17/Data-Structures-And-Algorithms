/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;
import java.util.ArrayList;

/**
 *
 * @author Tj
 */
public class InsertionSort {
    private int[] sort(int [] arr){
        for(int i = 0; i<arr.length;i++){
            int current = arr[i];
            int j = i - 1;
            
            while(j>-1 && arr[j] > current){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
        return arr;
}
    
    public static void main(String [] args){
        InsertionSort i = new InsertionSort();
        int [] inputs = new int[]{5,2,99,12,42};
        i.sort((inputs));
        for(int a= 0; a<inputs.length; a++){
            System.out.println(inputs[a]);
        }
    }   
}
