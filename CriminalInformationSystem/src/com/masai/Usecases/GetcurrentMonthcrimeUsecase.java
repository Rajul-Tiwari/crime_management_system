package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.CrimeDAO;
import com.masai.Dao.CrimeDaoImpl;
import com.masai.Exception.CrimeInfoException;

public class GetcurrentMonthcrimeUsecase {
	
	public static void OneMonthCrime() {
		CrimeDAO dao = new CrimeDaoImpl();
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the  Date of the Month :");
		String s1=sc.next();
		System.out.println("Enter the Date of the Month End: ");
		String s2=sc.next();
		
		try {
		int c=dao.Monthcount(s1,s2);
		System.out.println("Number of crimes recorded in the current month : "+c);	
			
		} catch (CrimeInfoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
