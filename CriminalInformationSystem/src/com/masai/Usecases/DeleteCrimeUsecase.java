package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.CrimeDAO;
import com.masai.Dao.CrimeDaoImpl;
import com.masai.bean.CrimeInfo;

public class DeleteCrimeUsecase {
	
	public static void DelectCrimeRecord() {
		
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the Cid: ");
	int id=sc.nextInt();
	
	CrimeDAO dao=new CrimeDaoImpl();

	CrimeInfo crime=new CrimeInfo();

	crime.setCrimeId(id);
	
  String result= dao.DeleteCrime(crime);
	
	System.out.println(result);

}
}