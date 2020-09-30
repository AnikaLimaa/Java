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
public class Missing_Element_In_Array {
    public static void main(String[] args) {
        int[] ar={1,2,4,5,6,7,10,15,17,20};
        int s,i,j,k,f=0;
        k=ar.length;
        for(i=1;i<=20;i++)
        {
            for(j=0;j<k;j++)
            {
                if(i==ar[j])
                {
                    f=1;
                }
            }
            if(f==0)
            {
                System.out.println(i);
            }
            f=0;
        }
    }
}
