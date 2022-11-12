package com.masai.Dao;

import java.util.List;

import com.masai.Exception.CriminalException;
import com.masai.bean.CrimeInfo;
import com.masai.bean.Criminal;

public interface Criminal_crimeDAO {
	public List<Criminal>  File(String cname)  throws CriminalException;
}
