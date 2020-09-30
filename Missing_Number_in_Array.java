/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missing_number_in_array;

/**
 *
 * @author lima
 */
public class Missing_Number_in_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ar[]={1,2,3,6,7,9};
    int len=ar.length;
        System.out.println(len);
        int i=0,j,n=10;
       
       n=n-2;
       while(i<=n)
       {
           if(ar[i]+1!=ar[i+1])
           {
               //System.out.println(ar[i]+1);
           }
           i++;
       }
    }
    
}
