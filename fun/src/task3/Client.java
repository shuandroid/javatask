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
		 aDella.computerfactroy("mainframe", "dell","�ߵ�") ;
		 aDellb.computerfactroy("mainframe", "dell","�е�") ;
		 aDellc.computerfactroy("mainframe", "dell","�͵�") ;
		 
		 //sung three type
		 SUNGa.computerfactroy("mainframe", "sung","�ߵ�") ;
		 SUNGb.computerfactroy("mainframe", "sung","�е�") ;
		 SUNGc.computerfactroy("mainframe", "sung","�͵�") ;
		 
		 
	 }

}
