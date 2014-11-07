package task3;

public class Client {
	 
	
	 public static void main(String[] args ) {
		 
		 FactoryDell aDella = new FactoryDell() ; 
		 FactoryDell aDellb = new FactoryDell() ;
		 FactoryDell aDellc = new FactoryDell() ;
		 
		 FactorySung SUNGa = new FactorySung() ;
		 FactorySung SUNGb = new FactorySung() ;
		 FactorySung SUNGc = new FactorySung() ;
		 //dell three type
		 aDella.computerfactroy("mainframe", "dell","¸ßµµ") ;
		 aDellb.computerfactroy("mainframe", "dell","ÖÐµµ") ;
		 aDellc.computerfactroy("mainframe", "dell","µÍµµ") ;
		 
		 //sung three type
		 SUNGa.computerfactroy("mainframe", "sung","¸ßµµ") ;
		 SUNGb.computerfactroy("mainframe", "sung","ÖÐµµ") ;
		 SUNGc.computerfactroy("mainframe", "sung","µÍµµ") ;
		 
		 
	 }

}
