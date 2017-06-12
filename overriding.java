/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn_java;

/**
 *
 * @author Tuankun
 */
public class overriding {
    void run(){
        System.out.println("a");
    }
}

class Bike extends overriding{
    void run(){
        System.out.println("b");
    }
    
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
