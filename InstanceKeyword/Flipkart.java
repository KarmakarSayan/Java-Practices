package InstanceKeyword;

//import Upcasting.product;

public class Flipkart {
static void workDetails(pproduct p)
{
	if(p!=null)
	{
//		details();
		if(p instanceof televison)
		{
			televison t=(televison)p;
			t.details();
			t.tv();
		}
	}
}
}
