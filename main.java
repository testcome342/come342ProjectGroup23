package homework2;
//201531075 , 201431002, 199431001
public class main 
{
	public static void main(final String[] args) 
	{	
		Campaign campaign1 = new Campaign();
		campaign1.setCampignID(125); //deðiþtir.
		campaign1.setCampignTitle("null");
		campaign1.setCampignEstimatedCost(2);
		campaign1.uiCampaign();
		
		
		Client client1=new Client();
		client1.setClientID(8); 
		client1.setClientName("null");
		client1.setClientSurname("null");
		client1.setClientPhone(2124567898);
		client1.setClientAddress("null");
		client1.setClientMail("mail");
		client1.uiClient();
		
		System.out.println("\n\n\n");
		
		Staff staff1=new Staff();
		staff1.setstaffID(155);
		staff1.setStaffName("Ahsen");
		staff1.setStaffSurname("Deneme");
		staff1.uiStaff();
		System.out.println("\n\n\n");
		

		System.out.println(staff1.getStaffID() + " \nCampaignId=" +campaign1.getCampaignID()  );
		
		
		
	}
}
