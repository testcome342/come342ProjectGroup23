package homework2;
public class Client {
	private int clientID;
	private String clientName;
	private String clientSurname;
	private String clientAddress;
	private int clientPhone;
	private String clientMail;
	
	public Client() {
	}
	public void uiClient() {
		  System.out.println("\n Client ID is  :" + clientID  + "\n Name of Client is :"+  clientName + 
				  			 "\n Surname of Client is :"+ clientSurname + "\n Address of Client is :"+
				  			  clientAddress + "\n Phone of Client is :"+ clientPhone + "\n Mail of Client :"+  clientMail  );
	}
	public int getClientID(){	return clientID ;}
	public void setClientID(int clientID) {
		this.clientID=clientID;
	}
	public String getClientName(){ return clientName ;}
	public void setClientName(String clientName) {
		this.clientName=clientName;
	}
	public String getClientSurname(){return clientSurname ;}
	public void setClientSurname(String clientSurname) {
		this.clientSurname=clientSurname;
	}
	public String getClientAddress(){ return clientAddress  ;}
	public void setClientAddress(String clientAddress) {
		this.clientAddress=clientAddress;
	}
	public long getClientPhone(){return clientPhone ;}
	public void setClientPhone(int clientPhone) {
		this.clientPhone=clientPhone;
	}
	public String getClientMail(){return clientMail ;}
	public void setClientMail(String clientMail) {
		this.clientMail=clientMail;
	}
	public void addNewClient() {
		// TODO Auto-generated method stub
		Client client1= new Client();
		System.out.println("Information of new Client:" + client1.clientID + "\n" + client1.clientName + "\n" + 
				           client1.clientSurname + "\n"  + client1.clientAddress + "\n" +client1.clientPhone
				           + "\n" + client1.clientMail + "\n");

	}
	
}
