package com.masai.Usecases;

import java.util.List;

import com.masai.Dao.CrimeDAO;
import com.masai.Dao.CrimeDaoImpl;
import com.masai.Exception.CrimeInfoException;
import com.masai.bean.CrimeInfo;

public class GetCrimeUsecase {
	
public static void ViewCrimeRecord() {
		
		CrimeDAO dao = new CrimeDaoImpl();
		
		try {
		List<CrimeInfo> criminals= dao.ViewCrime();
		
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
