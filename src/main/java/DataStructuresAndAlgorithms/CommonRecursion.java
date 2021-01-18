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
public class CommonRecursion {
    public String reverseString(String s){
        if(s.length() == 1){
            return  String.valueOf(s.charAt(0));
        }
        return s.charAt(s.length() - 1) + reverseString(s.substring(0,s.length() - 1 ));
    }
    
    public static void main(String [] args){
        CommonRecursion r = new CommonRecursion();
        System.out.println(r.reverseString("JT"));
    }
}
