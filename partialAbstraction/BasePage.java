package partialAbstraction;

abstract class BasePage {
void header()
{
	System.out.println("heading ");
}
abstract void body();
void footer()
{
	System.out.println("Footer");
}
}
