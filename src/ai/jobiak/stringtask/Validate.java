package ai.jobiak.stringtask;
import java.util.Scanner;
public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name ");
		String firstName = sc.next();
		System.out.println("Last Name  ");
		String lastName = sc.next();
		System.out.println("Phone no   ");
		long phoneno = sc.nextLong();
		System.out.println("Email");
		String email = sc.next();
		boolean ch=false;
		int c1=0,c2=0;
		while(!ch) {
			
		  
			for(char c:email.toCharArray()) {
				if(c=='@') {
					
					c1=1;
				
					
				}
				if(c=='.') {
					c2=1;
				}
				
			}
			if(c1==0 && c2==0) {
				System.out.println("please include @ and .");
				ch=false;
				System.out.println("enter your Email again");
				email = sc.next();
				
			}
			else if(c1==0) {
				System.out.println("please include @");
				ch=false;
				System.out.println("enter your Email again");
				email = sc.next();
			}
			else if(c2==0) {
				System.out.println("please include .");
				ch=false;
				System.out.println("enter your Email again");
				email = sc.next();
			}
			else if(email.length()<7){
				System.out.println("please include atleast 7 characters");
				ch=false;
				System.out.println("enter your Email again");
				email = sc.next();
			}
			else {
				ch=true;
			}
			c1=0;
			c2=0;
		}
		System.out.println("Password   ");
		String password = sc.next();
		
		
		ch=false;
		while(!ch) {
			
		  
			if(password.length()<8) {
				System.out.println("Use 8 characters for your password");
				ch=false;
				System.out.println("please enter your password again");
				password = sc.next();
				
			}
			else if(password.length()>10) {
				System.out.println("Very Strong password");
				ch=false;
				System.out.println("please enter your password again");
				password = sc.next();
				
				
			}
		
			else {
				ch=true;
			}
		}
		
	   
    CreateAccount obj1=new CreateAccount(firstName,lastName,phoneno,email,password);
    System.out.println(obj1);
   System.out.println();
	
    System.out.println();
    System.out.println("             Login");
    System.out.println("email  ");
    String email1=sc.next();
    System.out.println("password    ");
    String password1=sc.next();
   System.out.println();
   if(email1.equals(obj1.getEmail()) && password1.equals(obj1.getPassword())) {
	   System.out.println("correct");
   }
   else {
	   System.out.println("invalid details");
   }
 

	}


	}


