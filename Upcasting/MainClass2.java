package Upcasting;

public class MainClass2 {
	public static void main(String[] args) {
		red r =new red();
		ColorPallete.selectColor(r);
		System.out.println(":Red");
		
		
		Greee g =new Greee();
		ColorPallete.selectColor(g);
		System.out.println(":Green");
		
		Blue b =new Blue();
		ColorPallete.selectColor(b);
		System.out.println(":Blue ");
	}
}
