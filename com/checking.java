package com;

class checkk {
	void message()
	{
		System.out.println("send");
	}

}
class check extends checkk{
	@Override
	void message()
	{
		System.out.println("Delivered");
	}
}
class check2 extends check{
	@Override
	void message()
	{
		System.out.println("seen");
	}
}
class service{
	static void functionality(checkk c) {
		if(c!=null)
		{
			c.message();
		}
	}
}
public class checking{
 public static void main(String[] args) {
	check2 ck=new check2();
	service.functionality(ck);
	
	checkk c=new checkk();
	service.functionality(c);
	
	
	check ckk=new check();
	service.functionality(ckk);
}
}
