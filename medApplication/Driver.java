package medApplication;
import java.util.*;




public class Driver {
	
	static void Register() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String username=sc.nextLine();
		
		System.out.println("Enter Password");
		String password=sc.nextLine();
		
		System.out.println("Enter Email-ID");
		String email=sc.nextLine();
		
		 
		RegisterUser newuser=new RegisterUser( username,  password ,  email);
		newuser.getuser();
		
		
		
	}
	static void login() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String Username=sc.nextLine();
		System.out.println("Enter Password");
		String password=sc.nextLine();
		
		
		
	}
	static void BrowseMedicine() {
		
	}
	
	static void ViewCart() {
		
	}
    static void CheckOut() {
		
	}
    
    static void Exit() {
    	
    }
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		while(true) {
			System.out.println("====Online Medicine Shopping System====");
			
			System.out.println("Enter your choice");
			
			
			
			System.out.println("1.Login");
			System.out.println("2.Register");
			System.out.println("3.Browse Medicine");
			System.out.println("4.View Cart");
			System.out.println("5.Checkout");
			System.out.println("6.Exit");
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				login();
				break;
				
			case 2:
				Register();
				break;
			
			case 3:
				BrowseMedicine();
				break;
				
			case 4:
				ViewCart();
				break;
				
			case 5:
				CheckOut();
				break;
				
			case 6:
				Exit();
				break;
			default:
				System.out.println("Invalid input");
			}
			sc.close();
		}
		
	

	}
	
	
}
