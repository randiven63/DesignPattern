package tnsif.c2tc.m07;

import java.util.Scanner;

public class factoryDesign 
{
	public static void main(String[] args) throws Exception
    {
		Scanner sc=new Scanner(System.in);
		String order=sc.next();
		FoodFactory ff=new FoodFactory();
        Food f=ff.getFood(order);
        System.out.println("The factory returned class "
        					+f.getClass().getName());
        System.out.print(f.getType());
     }
}
