
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;
import java.util.*;

public class EasyRecursion {
    public int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
    
    public int power(int base,int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * power(base,exponent - 1);
    }
    
    public int productArray(int [] arr){
        //key takeaway for these is that you will usually be slicing off your array and base case is when array is empty.
        //in this case, base is an empty array
        if(arr.length == 0){
            return 1;
        }
        //Arrays.copyOfRange is the equivalent of slice in javascript.
        return arr[0] * productArray(Arrays.copyOfRange(arr, 1, arr.length));
    }
    
    public static void main(String [] args){
        EasyRecursion test = new EasyRecursion();
        System.out.println(test.factorial(2));
        System.out.println(test.factorial(5));
        System.out.println(test.power(2, 3));
        int [] input = new int[]{3,5,2,8};
        System.out.println(test.productArray(input));
        input = new int[]{4,3};
        System.out.println(test.productArray(input));
    }
}
