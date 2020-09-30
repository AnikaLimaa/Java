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
public class Rectangle extends Shape{
    
    Rectangle(int value1,int value2)
    {
        super(value1,value2);
    }
    
    double area()
    {
        return value1*value2;
    }
}
