package tnsif.c2tc.m07;

import java.util.*;

public class Solution {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Singleton obj=Singleton.getSingletonInstance();
		obj.str=sc.nextLine();
		System.out.println("Hello i am Singleton! Let me say "
							+ obj.str + " to you ");
	}

}
