package partialAbstraction;

public class ServiceBasepage {
static void load(BasePage b) {
	if(b!=null)
	{
		b.header();
		b.body();
		b.footer();
		
	}
}
}
