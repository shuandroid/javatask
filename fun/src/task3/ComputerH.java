package task3;

public class ComputerH extends Computer {

	private String mainframe ;
	private String screen ;
	
	public   ComputerH(String mainframe ,String screen) {
		
		setMainframe(mainframe) ;
		setScreen(screen) ;
		System.out.println("�����ߵ�����,"+"����Ϊ��"+mainframe+",��ʾ��Ϊ��"+screen+".") ;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMainframe() {
		
		// TODO Auto-generated method stub
		return mainframe ;
	}

	@Override
	public String getScreen() {
		// TODO Auto-generated method stub
		return screen ;
	}
	public void  setMainframe(String mainframe) {
		this.mainframe = mainframe ;
	}
	public void setScreen(String screen) {
		this.screen = screen ;
	}

}
