package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Exception.CrimeInfoException;
import com.masai.Utility.DbUtil;
import com.masai.bean.CrimeInfo;

public class CrimeDaoImpl implements CrimeDAO {

	@Override
	public String AddCrime(CrimeInfo crimeInfo) {
		
			String msg= "Not Insertd ....";
		
		

		try(Connection conn= DbUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("insert into  CrimeInfo (cdate, cplace, Crime_name, Victims, Description_crime, suspected_name)"
												+ "values (?,?,?,?,?,?)");
			
			ps.setString(1,crimeInfo.getCdate());
			ps.setString(2, crimeInfo.getCplace());
			ps.setString(3,crimeInfo.getCrime_name());
			ps.setString(4,crimeInfo.getVictims());
			ps.setString(5,crimeInfo.getDescriptionCrime());
			ps.setString(6,crimeInfo.getSuspected_name());
			
			
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				msg="Crime Added Sucessfully !";
			}
		   } 
		catch (SQLException e) {
		
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		return msg;
	}
	

	@Override
	public List<CrimeInfo> ViewCrime() throws CrimeInfoException {
		List<CrimeInfo> clist=new ArrayList<>();
		
		    
		    try (Connection conn=DbUtil.provideConnection()){
				PreparedStatement ps= conn.prepareStatement("select * from CrimeInfo");
				
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					int id=rs.getInt("CrimeId");
					String date=rs.getString("Cdate");
					String cp=rs.getString("Cplace");
					String cn=rs.getString("Crime_name ");
					String v=rs.getString(" Victims ");
					String dc=rs.getString("DescriptionCrime");
					String sn=rs.getString("Suspected_name");
					String cs=rs.getString("CaseStatus");
					
					CrimeInfo crm_info=new CrimeInfo(id,date,cp,cn,v,dc,sn,cs);
					
					clist.add(crm_info);
					
					}
				
				} catch (SQLException e) {
				
				throw new CrimeInfoException(e.getMessage());
			}
		
		  return clist;
	}

	@Override
	public int statuscount(String s1) throws CrimeInfoException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Monthcount(String s1, String s2) throws CrimeInfoException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CrimeInfo> CrimeArea(String s) throws CrimeInfoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateCrime(CrimeInfo crimeInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteCrime(CrimeInfo crimeInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
