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
		System.out.println("��������Ϊ���ǣ�") ;
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
