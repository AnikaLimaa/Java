/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

/**
 *
 * @author lima
 */
public class Test_Class {
    
    public static void main(String[] args) {
        
    
Shape obj;
 
        obj=new Rectangle(2,4);
        System.out.println(obj.area());
 
        obj=new Triangle(5,12);
        System.out.println(obj.area());
 
        obj=new Circle(4);
        System.out.println(obj.area());
    }

}
