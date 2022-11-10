package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.CrimeDAO;
import com.masai.Dao.CrimeDaoImpl;
import com.masai.bean.CrimeInfo;

public class CaseStatusUpdateUsecase {
	public static void UpdateCaseStatus() {
	    Scanner sc=new Scanner(System.in);
			
			System.out.println("Update Case Status: ");
			String Status=sc.next();
			
			System.out.println("Enter the crimId: ");
			int id=sc.nextInt();
			
			CrimeDAO dao=new CrimeDaoImpl();

			CrimeInfo crime=new CrimeInfo();
			
			
			crime.setCaseStatus(Status);;
			crime.setCrimeId(id);;
			
	      String result= dao.UpdateCrime(crime);
			
			System.out.println(result);
		}
}
