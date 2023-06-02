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
public class Node {
    private int nodeId;
    private static int nodeCount = 0; 
    
    public Node(){
       this.nodeId = nodeCount;
       nodeCount++;
    }
    
    @Override
    public String toString(){
        return("" + this.nodeId);
    }
    
    }
