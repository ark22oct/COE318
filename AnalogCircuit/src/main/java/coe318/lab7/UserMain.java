/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author abdulrehman
 */
public class UserMain implements UserInterface {
   String input = "";
    ArrayList<Object> cirElement = new ArrayList<>();
    Scanner userIn = new Scanner(System.in);
    
    @Override
    public void start()
    {
        display();
        run();
    }
    @Override
    public void run()
    {
        while(true){
            input = userIn.nextLine().trim();
            if(input.equalsIgnoreCase("end")) 
            {
                end();
                break;
            }
            else if(input.equalsIgnoreCase("spice"))
            {
                spice();
            }
            else
            {
                String[] value = input.split(" ");
                if(value.length != 4)
                {
                    System.out.println("Format of inputs is incorrect!");
                }
                else
                {
                    if(input.toLowerCase().startsWith("v"))
                    {
                        double temp;
                        Node a1 = new Node();
                        Node a2 = new Node();
                        a1.id = Integer.parseInt(value[1]);
                        a2.id = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        Voltage v = new Voltage(temp, a1, a2);
                        cirElement.add(v);
                    }
                    else if (input.toLowerCase().startsWith("r"))
                    {
                       double temp;
                       Node a1 = new Node();
                       Node a2 = new Node();
                       a1.id = Integer.parseInt(value[1]);
                       a2.id = Integer.parseInt(value[2]);
                       temp = Double.parseDouble(value[3]);
                        Resistor r = new Resistor(temp, a1, a2);
                        cirElement.add(r);                              
                    }
                }
            }
            
        }
    }
    @Override
    public void display()
    {
        System.out.println("Enter input:");
    }
    @Override
   public void spice()
   {
       for(Object obj : cirElement)
       {
           System.out.println(obj);
       }
    }
   
   @Override
   public void end()
   {
       System.out.println("All Done");
   }
   
   public static void main(String[] args)
   {
       UserMain main = new UserMain();
       main.start();
   }
}