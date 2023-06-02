/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.*;

/**
 *
 * @author abdulrehman
 */
public class Circuit {
     
    public ArrayList<Resistor> resistor = new ArrayList<Resistor>();
    public ArrayList<Voltage> voltage = new ArrayList<Voltage>();
     
    
    public void addresistor(Resistor r)
    {
       resistor.add(r); 
    }
    
    public void addvoltage(Voltage v)
    {
        voltage.add(v);
    }
    
        private static Circuit instance = null;
    
    public static Circuit getInstance()
    {
        if(instance  == null)
        {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() {}  

    @Override
   public String toString()
   {
       String result2= "";
       String result= "";
       int index=0;
       
       //Confirms with the array list created if there are any values that need to be displayed at output
       while(index<voltage.size() || index<resistor.size()) 
       {
           //If any values found at the voltage array list, they will be displayed at output with index i
           if(index<voltage.size())
           {
               result += voltage.get(index);
           }
           
           //If any values found at the resistor array list, they will be displayed at output with index i
           if(index<resistor.size())
           {
               result2 += resistor.get(index);
           }
           index++;
       }   
       return result+result2;
   }
    

}