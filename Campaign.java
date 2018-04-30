package homework2;

public class Campaign implements AssignStaffUI 
{	private int campaignID; 
	private String campaignTitle;
	private double estimatedCost;
	private double actualCost;
	private int advertisementID;
	public Campaign() {
	}
	public void uiCampaign() {
		  System.out.println("     Dear customer," +
				  			 "\n Campaign ID is  :" + campaignID  + "\n Title of Campaign is :" + campaignTitle + 
				  			 "\n Estimated Cost is :"+ estimatedCost + "\n Cost is : " + actualCost );
	}
	public int getCampaignID(){ return campaignID; }
	public void setCampignID(int campaignID){
		this.campaignID=campaignID;
	}
	public String getCampaignTitle(){ return campaignTitle; }
	public void setCampignTitle(String campaignTitle){
		this.campaignTitle=campaignTitle;
	}
	public double getEstimatedCost(){ return estimatedCost; }
	public void setCampignEstimatedCost(double estimatedCost){
		this.estimatedCost=estimatedCost;
	}
	public double getActualCost(){	return actualCost; }
	public void setActualCost(double actualCost){
		this.actualCost=actualCost;
	}
	public int getAdvertisementID() {return advertisementID ; }
	public void setAdvertisementID(int advertisementID) {
		this.advertisementID=advertisementID;
	}
	public void addNewAdvert() {
		System.out.println(advertisementID +"," +  campaignID  + "içindir." );
	}
	@Override
	public void assignStaff() {
		Staff staffnew=new Staff();
		Campaign mycampaign=new Campaign();
		System.out.println(staffnew.getStaffName()+ staffnew.getStaffSurname()+ "," +mycampaign.getCampaignTitle() 
		+"' da calisiyor " );		
	}
	@Override
	public void addNewStaff() {		
	}
}