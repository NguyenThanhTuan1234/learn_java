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
public class overloading {
    void sum(int a, int b){
        System.out.print(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        overloading ov = new overloading();
        ov.sum(1, 2);
        ov.sum(1, 2, 3);
}
}

