package partialAbstraction;

public class MainClassBasePage {
public static void main(String[] args) {
	homepage hpHomepage=new homepage()	;
	ServiceBasepage.load(hpHomepage);
	
	System.out.println("------------------");
	
	LoginPAge lp=new LoginPAge()	;
	ServiceBasepage.load(lp);
}
}
