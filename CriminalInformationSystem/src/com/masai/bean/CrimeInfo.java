package com.masai.bean;

public class CrimeInfo {	
	private int	     CrimeId;           
	private String	 Cdate;             
	private String   Cplace;
	private String   crime_name;            
	private String	 Victims;           
	private String	 DescriptionCrime ;
	private String   Suspected_name;
	private String   CaseStatus;
	public int getCrimeId() {
		return CrimeId;
	}
	public void setCrimeId(int crimeId) {
		CrimeId = crimeId;
	}
	public String getCdate() {
		return Cdate;
	}
	public void setCdate(String cdate) {
		Cdate = cdate;
	}
	public String getCplace() {
		return Cplace;
	}
	public void setCplace(String cplace) {
		Cplace = cplace;
	}
	public String getCrime_name() {
		return crime_name;
	}
	public void setCrime_name(String crime_name) {
		this.crime_name = crime_name;
	}
	public String getVictims() {
		return Victims;
	}
	public void setVictims(String victims) {
		Victims = victims;
	}
	public String getDescriptionCrime() {
		return DescriptionCrime;
	}
	public void setDescriptionCrime(String descriptionCrime) {
		DescriptionCrime = descriptionCrime;
	}
	public String getSuspected_name() {
		return Suspected_name;
	}
	public void setSuspected_name(String suspected_name) {
		Suspected_name = suspected_name;
	}
	public String getCaseStatus() {
		return CaseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		CaseStatus = caseStatus;
	}
	@Override
	public String toString() {
		return "CrimeInfo [CrimeId=" + CrimeId + ", Cdate=" + Cdate + ", Cplace=" + Cplace + ", crime_name="
				+ crime_name + ", Victims=" + Victims + ", DescriptionCrime=" + DescriptionCrime + ", Suspected_name="
				+ Suspected_name + ", CaseStatus=" + CaseStatus + "]";
	}
	public CrimeInfo(int crimeId, String cdate, String cplace, String crime_name, String victims,
			String descriptionCrime, String suspected_name, String caseStatus) {
		super();
		CrimeId = crimeId;
		Cdate = cdate;
		Cplace = cplace;
		this.crime_name = crime_name;
		Victims = victims;
		DescriptionCrime = descriptionCrime;
		Suspected_name = suspected_name;
		CaseStatus = caseStatus;
	}
	public CrimeInfo() {
		super();
		
	}
	
	

}
