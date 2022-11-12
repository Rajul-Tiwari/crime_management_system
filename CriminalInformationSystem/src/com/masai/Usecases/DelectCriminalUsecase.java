package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.CriminalDAo;
import com.masai.Dao.CriminalaDAOImpl;
import com.masai.bean.Criminal;

public class DelectCriminalUsecase {
public static void DeleteCriminal() {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Cid: ");
		int id=sc.nextInt();
		
		CriminalDAo dao=new CriminalaDAOImpl();

		Criminal criminal=new Criminal();
	
		criminal.setCid(id);
		
      String result= dao.DeleteCriminal(criminal);
		
		System.out.println(result);
		
		
	}
}
