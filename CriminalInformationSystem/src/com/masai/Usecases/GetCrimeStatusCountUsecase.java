package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.CrimeDAO;
import com.masai.Dao.CrimeDaoImpl;
import com.masai.Exception.CrimeInfoException;

public class GetCrimeStatusCountUsecase {
	public static void countSovingCases() {
		CrimeDAO dao = new CrimeDaoImpl();
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of Case status");
		String s1=sc.next();
		
		try {
		int c=dao.statuscount(s1);
		System.out.println("Total Number of soved/Unsolved Cases : "+c);	
			
		} catch (CrimeInfoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
