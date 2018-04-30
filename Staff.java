package homework2;

public  class Staff implements AssignStaffUI
{
	private int staffID;
	private String staffName;
	private String staffSurname;
	private String campaignManager;

	public Staff() {	
	}
	public void uiStaff() {
		  System.out.println("Staff ID are  :" + staffID + " " + "\nName of Staff are :"+ staffName
				  				+ ",\nSurname of Staff are :"+ staffSurname +
				  				"\nCampaign Manager is : " + campaignManager);	 
	}
	public void setCampaignManager(String campaignManager) {
		this.campaignManager=campaignManager;
	}
	public String getCampaignManager() { return campaignManager; }
	public void setstaffID(int staffID){
		this.staffID=staffID;
	}
	public int getStaffID(){ return staffID;  }
	public void setStaffName(String staffName){
		this.staffName=staffName;
	}
	public String getStaffName(){ return staffName; }
	public void setStaffSurname(String staffSurname){
		this.staffSurname=staffSurname;
	}
	public String getStaffSurname(){ return staffSurname; }
	@Override
	public void assignStaff() {		
	}
	@Override
	public void addNewStaff() {
		Staff newStaff= new Staff();
		System.out.println("New Staff Information: "
		+ newStaff.staffID+ newStaff.staffName + 
							newStaff.staffSurname + "\n");
	}
}