package task3;

public class FactoryDell extends Factory {
	
	String themainframe ;
	String thescreen ;
	String thetype ;
	public  FactoryDell() {
		 
		// TODO Auto-generated constructor stub
	}


	@Override
	public Computer computerfactroy(String mainframe, String screen,String type) {
		
		themainframe = mainframe ;
		thescreen = screen ;
		thetype = type ;
		System.out.println("��������Ϊ������") ;
		if (thetype.equals("�ߵ�")) {
			return new ComputerH(themainframe, thescreen) ;
		}
		if (thetype.equals("�е�")) {
			return new ComputerB(themainframe, thescreen) ;
		}
		if (thetype.equals("�͵�")) {
			return new ComputerL(themainframe, thescreen) ;
		}
		else{
			System.out.println("���������д�����������") ;
			return null ;
		}
	}

}
