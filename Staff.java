package homework2;
//201431002
public  class Staff implements AssignStaffUI
{
	int staffID;
	public String staffName;
	private String staffSurname;

	public Staff() {	
	}
	public void uiStaff() {
		  System.out.println("Staff ID is  :" + staffID + " " + "\nName of Staff is :"+ staffName + ",\nSurname of Staff is :"+ staffSurname  );	 
	}

	public void setstaffID(int staffID){
		this.staffID=staffID;
	}
	public int getStaffID(){
		return staffID; 
	}

	public void setStaffName(String staffName){
		this.staffName=staffName;
	}
	public String getStaffName(){
		return staffName;
	}
	public void setStaffSurname(String staffSurname){
		this.staffSurname=staffSurname;
	}
	public String getStaffSurname(){
		return staffSurname;
		
		
	}
	
}