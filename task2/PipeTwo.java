package task2;

public class PipeTwo implements Pipe {

	@Override
	public void handle() {
		String string_two = message ;
		//把小写换成大写	,大写换成小写	
		 String upStr = string_two.toUpperCase();
	     String lowStr = string_two.toLowerCase();
	     StringBuffer buf = new StringBuffer(string_two.length());
		 for(int i=0;i<string_two.length();i++){
	          if(string_two.charAt(i) == lowStr.charAt(i)){
	            buf.append(upStr.charAt(i));
	          }
	          else{
	            buf.append(upStr.charAt(i));
	          }
	     }
		 string_two = buf.toString() ;
		 System.out.print("全部换成大写："+string_two) ;
	}

}
