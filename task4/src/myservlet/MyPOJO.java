package myservlet;

public class MyPOJO {
	public boolean login_speed(int  speed){
		
		int sp = speed ;
		if (sp>120) {
			return false ;
		}
		else 
			return true ;		
	}
	public boolean login_direction(String direction) {
		
		String dirString = direction ;
		System.out.println(dirString) ;
		if (dirString.equals("left")||(dirString.equals("right"))) {
			return true ;
		}
		else
			return false ;
		
	}
		
}
