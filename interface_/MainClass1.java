package interface_;

  interface  Demo { 
  
//    here the demo is the name of the interface 
	  void test();
  }
  	 class sample implements Demo{
  		 @Override	
  		 public void test()
  		 {
  			 System.out.println("Executing test()--------------");
  		 }
  	 }
 public class MainClass1{
	  public static void main(String[] args) {
		Demo demo=new sample();
		demo.test();
		
	}
  }
