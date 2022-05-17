package emailvalidation;

import java.util.Scanner;
public class Password{
	
	public static void main(String[] args) {
		myPassword pass=new myPassword();
        pass.getDetails();
	}

   }
 class myPassword {
	private static String username;
	private static String email;
	private static String pass;
	private static char c;
	private static boolean hasLenth;
	private static boolean hasLower;
	private static boolean hasUpper;
	private static boolean hasNum;
	private static boolean hasEmail;
	private static boolean hasLength;
	
	public static void getDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		username=sc.nextLine();
		System.out.println("Enter your email");
		email=sc.next();
		System.out.println("Enter your password");
		pass=sc.next();	
		System.out.println(check(pass));
	}
	public static String check(String password) {
		for(int i=0;i<password.length();i++) {
			c=password.charAt(i);
			if(password.length()>8) {
				hasLenth = true;
			}
            if(Character.isLowerCase(c)) {
				hasLower = true;
			}
            if(Character.isUpperCase(c)) {
				hasUpper = true;
			}
            if(Character.isDigit(c)) {
            	hasNum = true;
            }
            if(email.charAt(0)!='@'&&email.contains("@")&&email.endsWith(".com")) {
            	hasEmail = true;
            }
		}
		if(hasLength&&hasLower&&hasUpper&&hasNum&&hasEmail) {
                return "You have a strong User";
		}
		return "Your Password must contain at least 8 Character\nYour password must contain at least 1 Upper or Lower case Character\nYour email must be correct";
	}
}
