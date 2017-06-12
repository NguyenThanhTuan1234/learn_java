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
public class tukhoasuper {
int speed = 50;    
}

class Bike4 extends tukhoasuper{
    int speed = 100;
    void display(){
        System.out.println(super.speed);
    }
    public static void main(String[] args) {
        Bike4 b = new Bike4();
        b.display();
    }
}
