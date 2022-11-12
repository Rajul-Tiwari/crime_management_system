package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Exception.CriminalException;
import com.masai.Utility.DbUtil;
import com.masai.bean.CrimeInfo;
import com.masai.bean.Criminal;

public class Criminal_crimeDAOImpl implements Criminal_crimeDAO {

	@Override
	public List<Criminal> File(String cname) throws CriminalException {
		List<Criminal> Criminals= new ArrayList<>();


		try(Connection conn= DbUtil.provideConnection();) {
		
			PreparedStatement ps = conn.prepareStatement ("select c.cname, cr.crime_name from criminal"
					+ " c INNER JOIN criminfo cr INNER JOIN criminal_crime ccr ON ccr.crimId=cr.crimId "
					+ "AND ccr.cid=c.cid AND cr.crime_name=?");
			ps.setString(1,cname );
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				
				Criminal cri=new Criminal();
				cri.setName(	rs.getString("cname"));
				cri.setCrime_Name(rs.getString("Crime_name"));
     
	    Criminals.add(cri);
	
			}
			} catch (SQLException e) {
				throw new CriminalException(e.getMessage());
				
			}
			
			
			if(Criminals.size() == 0)
				throw new CriminalException("No Criminal crime found..");
			
			
			
			
			return Criminals;
	}
	
	
}
