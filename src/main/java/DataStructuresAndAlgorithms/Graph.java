/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Tj
 */
public class Graph {
    private HashMap<String,ArrayList<String>> list;
    
    public Graph(){
        this.list = new HashMap<String,ArrayList<String>>();
    }
    
    void addVertex(String vertex){
        if(!list.containsKey(vertex)){
            ArrayList<String> connections = new ArrayList<String>();
            list.put(vertex, connections);
        }
    }
    
    void addEdge(String vertex1,String vertex2){
        HashMap<String,ArrayList<String>> list = this.list;
        ArrayList<String> updateVertex1 = list.get(vertex1);
        ArrayList<String> updateVertex2 = list.get(vertex2);
        updateVertex1.add(vertex2);
        updateVertex2.add(vertex1);
       
//        if(!list.containsKey(vertex1) || !list.containsKey(vertex2)){
//            throw new Exception("Vertices Do Not Exist!");
//        }
//        
        list.put(vertex1,updateVertex1);
        list.put(vertex2, updateVertex2);
    }
    
    void removeEdge(String vertex1, String vertex2){
        //did not account for errors, but thats not important to understanding
         ArrayList<String> updateVertex1 = list.get(vertex1);
         ArrayList<String> updateVertex2 = list.get(vertex2);
         
         updateVertex1.remove(vertex2);
         updateVertex2.remove(vertex1);
    }
    
    void removeVertex(String v){
        for(String key : this.list.keySet()){
            if(list.get(key).contains(v)){
                list.get(key).remove(v);
            }
        }
        list.remove(v);
    }
    
    public static void main(String [] args){
        Graph g = new Graph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        g.addEdge("C", "A");
        g.addEdge("C","B");
        g.addEdge("D","E");
//        g.removeEdge("D", "E");
//        g.removeEdge("C","B");
        g.removeVertex("B");
        System.out.println(g.list);
    }
}
