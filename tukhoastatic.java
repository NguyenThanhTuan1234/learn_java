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
public class tukhoastatic {
    int rollno;
    String name;
    static String college="BachKhoa";
    
    static void change(){
        college="Quocgia";
    }
    
    tukhoastatic(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
    public static void main(String[] args) {
        tukhoastatic.change();
        tukhoastatic s1 = new tukhoastatic(111, "Tuan");
        tukhoastatic s2 = new tukhoastatic(22, "Kun");
        s1.display();
        s2.display();
    }
}
