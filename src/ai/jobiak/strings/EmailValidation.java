package ai.jobiak.strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailValidation {
    
	public static String isValid(String email)
	{
		if((email==null)||email.isEmpty()) 
        {
		      return "Invalid";	
		}
        String emailRegex="^[A-Za-z0-9+_.-]+@[a-z0-9]+(.+)$";
       Pattern pattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
       Matcher matcher = pattern.matcher(email);
       if(pattern.matcher(email).matches())
       {
    	   return "Valid";
       }
       else
       {
    	   return "Invalid";
       }
	}	
	public static void main(String[] args) 
	{
		String email1="game23@gmail.com";
		String email2="joydreamgmail.com";
		String email3="+earn@outlook.com";
		System.out.println("email1="+isValid(email1));
		System.out.println("email2="+isValid(email2));
		System.out.println("email3="+isValid(email3));
	}
}

