package com.masai.Dao;

import java.util.List;

import com.masai.Exception.CrimeInfoException;
import com.masai.bean.CrimeInfo;

public interface CrimeDAO {
	public String AddCrime(CrimeInfo crimeInfo);
	public List<CrimeInfo> ViewCrime() throws CrimeInfoException;
	public int statuscount(String s1)throws CrimeInfoException;
	public int Monthcount(String s1, String s2)throws CrimeInfoException; 
	public List<CrimeInfo> CrimeArea(String s) throws CrimeInfoException;
	public String UpdateCrime(CrimeInfo crimeInfo);
	public String DeleteCrime(CrimeInfo crimeInfo);
	
}

