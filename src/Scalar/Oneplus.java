package com.ciena.pms.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusOne {

	public static void main(String[] args) {
		ArrayList<Integer> A=new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		plusOne(A);
	}
	
	public static  ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> B= new ArrayList();
       // List<String> myList= new ArrayList();
        int lastDig=0;
        for(int i=0; i<A.size()-1;i++)
        {
         lastDig=lastDig+A.get(i);
         
        // myList.add(String.valueOf(A.get(i)));
        }
        lastDig=lastDig+1;
        String s=String.valueOf(lastDig);
       List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
        /*for(int j=0; j<s.length(); j++)
        {
            int val=Integer.parseInt(s.charAt(j));
            A.get(j)=val;
        }*/
        for(String a:myList)
        {
            int val=Integer.parseInt(a);
            B.add(val);
            System.out.println("before"+B);

        }
        System.out.println("now"+B);
        //A.set((A.size()-1),lastDig);
        return B;
        
    }

}
