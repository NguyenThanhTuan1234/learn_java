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
public class tukhoathis {
    int id;
    String name;
    tukhoathis(){
        System.out.println("Constructor mac dinh duoc goi");
    }
    tukhoathis(int id,String name){
        this();
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        tukhoathis s1 = new tukhoathis(1,"tuan");
        tukhoathis s2 = new tukhoathis(2, "son");
        s1.display();
        s2.display();
    }
}
