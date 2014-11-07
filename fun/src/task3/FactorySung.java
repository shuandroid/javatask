package task3;

public class FactorySung extends Factory {
	
	String themainframe ;
	String thescreen ;
	String thetype ;
	public FactorySung() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public Computer computerfactroy(String mainframe, String screen,String type) {
		
		themainframe = mainframe ;
		thescreen = screen ;
		thetype = type ;
		System.out.println("电脑类型为三星！") ;
		if (thetype.equals("高档")) {
			return new ComputerH(themainframe, thescreen) ;
		}
		if (thetype.equals("中档")) {
			return new ComputerB(themainframe, thescreen) ;
		}
		if (thetype.equals("低档")) {
			return new ComputerL(themainframe, thescreen) ;
		}
		else{
			System.out.println("输入类型有错！请重新输入") ;
			return null ;
		}
	}

}
