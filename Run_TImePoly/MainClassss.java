package Run_TImePoly;

public class MainClassss {
	public static void main(String[] args) {
		Frontend feFrontend=new Frontend();
		Lead.review(feFrontend);
		System.out.println("==========================");
		BackEnd bEnd=new BackEnd();
		Lead.review(bEnd);
	}
}
