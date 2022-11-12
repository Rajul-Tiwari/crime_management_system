package com.masai.Usecases;

import java.util.List;

import com.masai.Dao.CriminalDAo;
import com.masai.Dao.CriminalaDAOImpl;
import com.masai.Exception.CriminalException;

public class GetCriminalsUsecase {
public static void Criminal() {
		
		CriminalDAo dao = new CriminalaDAOImpl();
		
		try {
		List<com.masai.bean.Criminal> criminals= dao.ViewCriminal();
		
		criminals.forEach(s ->{
			
			System.out.println("Criminal Id :"+s.getCid());
			System.out.println("Criminal name: "+s.getName());
			System.out.println("Criminal Age: "+s.getAge());
			System.out.println("Criminal Gender: "+s.getGender());
			System.out.println("Criminal Address: "+s.getAddress());
			System.out.println("Criminal Face Mark: "+s.getIdentify_face_mark());
			System.out.println("Criminal Crime Area: "+s.getCrime_Area());
			System.out.println("Criminal Crime Name: "+s.getCrime_Name());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		}catch(CriminalException se) {
			System.out.println(se.getMessage());
		}
		
		
		
	}
}
