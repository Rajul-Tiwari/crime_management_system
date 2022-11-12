package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.CriminalDAo;
import com.masai.Dao.CriminalaDAOImpl;
import com.masai.bean.Criminal;

public class UpdateCriminalUsecase {
public static void Updatecriminal() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name=sc.next();
		
		System.out.println("Enter the Cid: ");
		int id=sc.nextInt();
		
		CriminalDAo dao=new CriminalaDAOImpl();

		Criminal criminal=new Criminal();
		
		
		criminal.setName(name);
		criminal.setCid(id);
		
      String result= dao.UpdateCriminal(criminal);
		
		System.out.println(result);
		
		
	}
}
