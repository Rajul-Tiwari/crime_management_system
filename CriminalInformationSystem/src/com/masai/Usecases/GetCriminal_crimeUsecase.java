package com.masai.Usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.Criminal_crimeDAO;
import com.masai.Dao.Criminal_crimeDAOImpl;
import com.masai.Exception.CriminalException;
import com.masai.bean.CrimeInfo;
import com.masai.bean.Criminal;

public class GetCriminal_crimeUsecase {
	
	public static void CriminalCrimeRecord() {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Crime Name : ");
		
		String cr=sc.next();
		
		Criminal_crimeDAO dao = new Criminal_crimeDAOImpl();
		
		try {
		List<Criminal> criminals= dao.File(cr);
		
		criminals.forEach(s ->{
			
			
			System.out.println("Criminal name: "+s.getName());
			System.out.println("Criminal Crime Name: "+s.getCrime_Name());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		}catch(CriminalException se) {
			System.out.println(se.getMessage());
		}

		
	}

}
