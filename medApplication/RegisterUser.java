package medApplication;
import java.util.ArrayList;
import java.util.HashMap;


public class RegisterUser {
	
	
	ArrayList<String> credential=new ArrayList<>();
	static HashMap<String , ArrayList<String>> user=new HashMap<>();
	public RegisterUser(String username, String password , String email){
		if(user.containsKey(username)) {
			System.out.println("User already exists");
			return;
		}
		else {
		
		  credential.add(password);
		  credential.add(email);
		  user.put(username, credential);
		  
		  System.out.println("Registration successful");
		  
		}
		
	}
		
	public void getuser(){
		System.out.println(user);
		
	}

	}


