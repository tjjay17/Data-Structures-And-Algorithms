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
public class LargestAndSecondLargest {
    public void printLandS(int [] arr){
        int largest = 0;
        int second = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]> second){
                second = arr[i];
            }
        }
        
        System.out.println("Largest is " + largest + " Second is " + second);
    }
    public static void main(String [] args){
        LargestAndSecondLargest test = new LargestAndSecondLargest();
        int [] input = new int[]{9,45,23,42};
        test.printLandS(input);
    }
}
