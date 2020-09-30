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
public class Circle extends Shape{
    int r1,r2;
    Circle(int r1)
    {
        super(r1,r1);
    }
    double area()
    {
        return 3.1416*value1*value2; 
    }
}
