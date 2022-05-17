package ai.jobiak.strings;

import java.util.Arrays;

public class TestStrings {

	public static void main(String[] args) {
		// jar to jar
		
		/*String str = new String();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println((str==null?true:false));
		System.out.println(str.hashCode());
		System.out.println(str.toString());
        
		String string = new String("Jobiak.com Grooming AI");
		System.out.println(string);
		System.out.println(string.length());
		System.out.println(string.hashCode());
		System.out.println(string.toString());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string);
		*/
		byte bytes[]= {65,84,87,67,98};
		String bytesStr=new String(bytes);
		System.out.println(bytesStr);
	    
		char chars[]= {'T',' ','S','c','r','e','a','m'};
		String charStr=new String(chars);
		System.out.println(charStr);
		
		String tongueTwister=new String("She sells sea shells on the sea shore");
		char letters[]=new char[tongueTwister.length()];
		tongueTwister.getChars(0,tongueTwister.length(),letters,0);
		
		for(char c:letters) {
			
			//System.out.println(c);
			System.out.print(c);
		}
		System.out.println();
		String fromChars = new String(letters,10,10);
		System.out.println(fromChars);
		
		String name = new String("My name is Kavya");
		String copyName=new String("My name is Kavya");
		
		System.out.println("name="+name);
		System.out.println("copyName="+copyName);
		
		boolean result =name==copyName;
		System.out.println(result);
		
		result=name.equals(copyName);// in String class it checks the values passed in constructor whereas in Object class this method checks or uses or performs reference check with == operator 
		System.out.println(result);
	
		String email = new String("java2@gmail.com");
		String userName=email.substring(0, email.indexOf("2")+1);
		System.out.println(userName);
		
		boolean valid=false;
		for(char c:email.toCharArray()) {
			if(c=='@'&&c=='.') {
				valid=true;
			}
		}
		if(valid) {
			System.out.println("you have provided valid username");
		}
		else {
			System.out.println("invalid username");
		}	
	}
{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
