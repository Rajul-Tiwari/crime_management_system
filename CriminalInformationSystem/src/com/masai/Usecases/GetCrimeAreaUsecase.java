package com.masai.Usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.CrimeDAO;
import com.masai.Dao.CrimeDaoImpl;
import com.masai.Exception.CrimeInfoException;
import com.masai.bean.CrimeInfo;

public class GetCrimeAreaUsecase {
   
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Crime Area : ");
		String n=sc.next();
	CrimeDAO dao = new CrimeDaoImpl();
		
		try {
		List<CrimeInfo> criminals= dao.CrimeArea(n);
		
		criminals.forEach(s ->{
			
			System.out.println("Crime Id :"+s.getCrimeId());
			System.out.println("Crime Date : "+s.getCdate());
			System.out.println("Crime Place: "+s.getCplace());
			System.out.println("Crime Name: "+s.getCrime_name());
			System.out.println("Crime Victims: "+s.getVictims());
			System.out.println("Crime Description: "+s.getDescriptionCrime());
			System.out.println("Crime Suspected name : "+s.getSuspected_name());
			System.out.println("Crime Case Status: "+s.getCaseStatus());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		}catch(CrimeInfoException se) {
			System.out.println(se.getMessage());
		}
		

	}
}
