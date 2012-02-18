
import java.io.*;

class Chatter {

	
	private String chatServer = "localhost";
	private ChatterInfo info;
	
	ChatServerClientInterface c;
	
	public Chatter (String userName) {
	
		c = ChatServerClient.getClientObject(chatServer,userName,"");
		info = new ChatterInfo(userName, "");
		c.connect(this);
	}
	
	public ChatterInfo getInfo() {
		return info;
	}
}

class ChatterInfo  implements Serializable {

	private String username;
	private String password;
	
	public ChatterInfo (String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return username;
	}
	
	public String toString() {
	
		String retVal = "Username: " + username + ", Password: " + password;
		return retVal;
	}
}