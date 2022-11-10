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
			PreparedStatement ps = conn.prepareStatement("insert into  CrimeInfo (cdate, cplace, Crime_name, Victims, DescriptionCrime, suspected_name)"
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
		    if(clist.size()==0)
		    	throw new CrimeInfoException("No crime found..");
		    	
		
		  return clist;
	}

	@Override
	public int statuscount(String s1) throws CrimeInfoException {
		int count=0;
		
		           try (Connection conn=DbUtil.provideConnection();){
					PreparedStatement ps=conn.prepareStatement("select count(*) from criminfo where case_status=?");
					ps.setString(1, s1);
					ResultSet rs=ps.executeQuery();
					if(rs.next()) {
						count=rs.getInt("count(*)");
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		
		return count;
	}

	@Override
	public int Monthcount(String s1, String s2) throws CrimeInfoException {
		int count=0;
		
		try (Connection conn= DbUtil.provideConnection();){
			PreparedStatement ps = conn.prepareStatement ("select count(*) from criminfo where cdate between ? AND ?");
				ps.setString(1,s1);
				ps.setString(2, s2);
		
				
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				count= rs.getInt("count(*)");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return count;
	}

	@Override
	public List<CrimeInfo> CrimeArea(String s) throws CrimeInfoException {
List<CrimeInfo> Crime= new ArrayList<>();
		
		try (Connection conn= DbUtil.provideConnection();){
			PreparedStatement ps = conn.prepareStatement ("select * from criminfo where cplace=?");
			
	          ps.setString(1, s);
				
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int id= rs.getInt("crimId");
				String d= rs.getString("cdate");
				String a= rs.getString("cplace");
				String g= rs.getString("crime_name");
				String ad= rs.getString("Victims");
				String fm= rs.getString("DescriptionCrime");
				String  area= rs.getString("suspected_name");
				String crn= rs.getString("CaseStatus");
				
				
			CrimeInfo cri=new CrimeInfo(id, d, a, g, ad, fm, area, crn);
		    Crime.add(cri);
	    
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		if(Crime.size() == 0)
			throw new CrimeInfoException("No crime found..");
	
		
		return Crime;
	}

	@Override
	public String UpdateCrime(CrimeInfo crimeInfo) {
String msg="Not Updated....";
		
		try(Connection conn= DbUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("update criminfo set case_status=? where crimId=?");
				
			
			ps.setString(1, crimeInfo.getCaseStatus());
			ps.setInt(2, crimeInfo.getCrimeId());
			ps.executeUpdate();
			
		
				
				msg="Case Status Updated Successfully";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

	@Override
	public String DeleteCrime(CrimeInfo crimeInfo) {
String msg="Not Updated....";
		
		try(Connection conn= DbUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM criminfo WHERE crimId=?");
			
		
			ps.setInt(1, crimeInfo.getCrimeId());
			ps.executeUpdate();
		
				msg="Data deleted Successfully";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}
	

}
