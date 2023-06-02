/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author abdulrehman
 */
public class Resistor {
    
    private double resistance;
    private Node node1;
    private Node node2;
    public int resistanceId;
    private static int resistanceCount =1;
    
    
    public Resistor(double resistance, Node node1, Node node2){
        if (resistance < 0){
            throw new IllegalArgumentException("Resistance value can't be negative!");
        }
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("Node 1 and Node 2 can't be nulll!");
        }
        this.resistance= resistance;
        this.node1= node1;
        this.node2= node2;
        this.resistanceId= resistanceCount;
        resistanceCount++;
       
        
        
    }
    
    public Node [] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
        
    }
     @Override     
    public String toString(){
        return("R" +resistanceId + " " + node1 + " " + node2 + " " + resistance);
    }
    
}
