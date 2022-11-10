package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.CrimeDAO;
import com.masai.Dao.CrimeDaoImpl;
import com.masai.bean.CrimeInfo;

public class Add_crimeUsecase {
	
	public static void AddCrimeRecord() {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Crime Date:- ");
		String date=sc.nextLine();
		
		System.out.println("Enter Crime Place:- ");
		String place=sc.nextLine();
		
		System.out.println("Enter crime Name : ");
		String crime=sc.nextLine();
		
		System.out.println("Enter Crime Victims : ");
		String victim=sc.nextLine();
		
		System.out.println("Enter Detail Description of crime: ");
		String desc=sc.nextLine();
		
		System.out.println("Enter Crime Suspected name : ");
		String suspectName=sc.nextLine();
		
		CrimeDAO dao1=new CrimeDaoImpl();

		CrimeInfo crime1=new CrimeInfo();
		
	
		crime1.setCdate(date);
		crime1.setCplace(place);
		crime1.setCrime_name(crime);
		crime1.setVictims(victim);;
		crime1.setDescriptionCrime(desc);
		crime1.setSuspected_name(suspectName);
	
	
		
		String result= dao1.AddCrime(crime1);
		
		System.out.println(result);
		
	}
	
	
	
}
