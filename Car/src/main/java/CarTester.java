/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdulrehman
 */
public class A {
    private final int v=5;
    private static int count;
    public A(){
        count++;
    }
    public A(int v){
        count++;
    }
    public void setCount(final int v){
        count=v;
    }
}
        class zero{
   public static void main(String[]args){
       A a1=new A();
        A a2= new A(5);
        a1.setCount(3);
        System.out.println(a2.v);
        System.out.println(a1.count);}
   } 
