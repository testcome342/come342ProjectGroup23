package homework2;
public class main 
{
	public static void main(final String[] args) 
	{	
		Campaign campaign1 = new Campaign();
		campaign1.uiCampaign();
		
		Client client1=new Client();
		client1.setClientID(200031001); 
		client1.setClientName("mer");
		client1.setClientSurname("null");
		client1.setClientPhone(2124567898);
		client1.setClientAddress("null");
		client1.setClientMail("mail");
		client1.uiClient();
		System.out.println("\n\n\n");
		
		Staff staff1=new Staff();	
		staff1.uiStaff();
		System.out.println("\n\n\n");
		
		Campaign assignment=new Campaign();
		assignment.assignStaff();
		System.out.println("\n\n\n");
		
		Campaign advert=new Campaign();
		advert.addNewAdvert();
		System.out.println("\n\n\n");

		Client additionClient=new Client();
		additionClient.addNewClient();
		
		Staff additionStaff=new Staff();
		additionStaff.addNewStaff();
		
	}
}
