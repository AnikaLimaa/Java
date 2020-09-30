/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search_with_recursion;

/**
 *
 * @author lima
 */
public class Binary_Search_Pari_nah {
    
    int[] ar={1,4,6,7,8,12,14,16,19,21,24,26};
    int binary_Search_Fun(int f,int l,int num)
    {
        if(f<=l)
        {
            int mid=(f+l)/2;
            
            if(ar[mid]==num)
            {
                System.out.println("Mid");
                return mid;
            }
            if(ar[mid]<num)
            {
                System.out.println("Right");
                return binary_Search_Fun(mid+1,l,num);
            }
            if(ar[mid]>num)
            {
                System.out.println("Left");
                return binary_Search_Fun(f,mid-1,num);
            }
        }
        return -1;
    }
}
