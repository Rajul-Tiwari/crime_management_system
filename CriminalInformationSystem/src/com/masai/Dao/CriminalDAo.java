package com.masai.Dao;

import java.util.List;

import com.masai.Exception.CriminalException;
import com.masai.bean.Criminal;

public interface CriminalDAo {
public String AddCriminal(Criminal criminalInfo);
    
	public List<Criminal> ViewCriminal() throws CriminalException;
	
	public Criminal getcriminalByCId(int Cid) throws   CriminalException;
	
	public String UpdateCriminal(Criminal criminalInfo);
	
	public String DeleteCriminal(Criminal criminalInfo);
	
}
