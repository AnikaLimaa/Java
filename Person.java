/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author lima
 */
public class Person {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.display();
        p=new Teacher();
        p.display();
        p=new Student();
        p.display();
        //Parent ob2=new Parent();
        
        
    }
    
}
