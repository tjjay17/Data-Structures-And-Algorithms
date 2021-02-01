/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;
import java.util.Arrays;

/**
 *
 * @author Tj
 */

//Generally speaking, bubble sort sucks. Best case O(n) if already sorted
//if not, then it's O(n^2)
public class BubbleSort {
    private int [] bruteForce(int [] array){
        int temp = 0;
        boolean swapped;
        do{
            swapped = false;
            for(int j = 0; j< array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
        
        return array;
    }
    
    public static void main(String [] args){
        BubbleSort b = new BubbleSort();
        int [] test = new int[]{4,72,90,43,21,6,12,2};
        System.out.println(Arrays.toString(b.bruteForce(test)));   
    }
}
