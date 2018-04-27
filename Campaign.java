package homework2;
//199431001
public class Campaign implements AssignStaffUI
{	public int campaignID; 
	private String campaignTitle;
	private double estimatedCost;
	public Campaign() {
	}
	public void uiCampaign() {
		  System.out.println("\n Campaign ID is  :" + campaignID  + "\n Title of Campaign is :" + campaignTitle + 
				  			 "\n Estimated Cost is :"+ estimatedCost  );
	}
	public int getCampaignID(){
		return campaignID;
	}
	public void setCampignID(int campaignID){
		this.campaignID=campaignID;
	}
	public String getCampaignTitle(){
		return campaignTitle;
	}
	public void setCampignTitle(String campaignTitle){
		this.campaignTitle=campaignTitle;
	}
	public double getEstimatedCost(){
		return estimatedCost;
	}
	public void setCampignEstimatedCost(double estimatedCost){
		this.estimatedCost=estimatedCost;
	}

}