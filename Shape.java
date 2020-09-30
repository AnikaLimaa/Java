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
public abstract class Shape {
    int value1;
    int value2;
    Shape(int value1,int value2)
    {
        this.value1=value1;
        this.value2=value2;
    }
    abstract double area(); 
}
