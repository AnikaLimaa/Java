/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_class;

/**
 *
 * @author lima
 */
public class Test {
    public static void main(String[] args) {
        Dog ob=new Dog();
        ob.bark();
        Animal ob1;
        ob1=new Dog();
        ob1.bark();
        Cat obj=new Cat();
        obj.bark();
        Animal ob2;
        ob2=new Cat();
        ob2.bark();
    }
}
