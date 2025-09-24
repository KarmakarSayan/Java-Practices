package Upcasting;

public class MainClass3 {
	public static void main(String[] args) {
		Fish ffFish=new Fish();
		Zomato.orderFood(ffFish);
		System.out.println(": Fish");
		
		chicken ccChicken=new chicken();
		Zomato.orderFood(ccChicken);
		System.out.println(": Chicken");
	}
	
}
