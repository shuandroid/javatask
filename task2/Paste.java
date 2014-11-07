package task2;

public class Paste implements Pipe {
	
    
	@Override
	public void handle() {
		String string_one = message ;
		System.out.println(string_one);
		System.out.println("按照原样输出："+string_one) ;
	}

}
