package task3;

public class ComputerB extends Computer {

	private String mainframe ;
	private String screen ;
	
	public   ComputerB(String mainframe,String screen) {
		
		setMainframe(mainframe) ;
		setScreen(screen) ;
		System.out.println("生产中档电脑,"+"主机为："+mainframe+",显示屏为："+screen+".") ;
		
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
