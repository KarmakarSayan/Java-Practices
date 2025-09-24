package InstanceKeyword;

public class Manager {
static void workReview(SoftwareEngineer sw) {
	if(sw!=null) {
		sw.Meeting();
		if(sw instanceof Developer)
		{
			Developer developer=(Developer) sw;
			developer.Coding();
		}
		else if (sw instanceof Tester)
		{
			Tester tester=(Tester) sw;
			tester.testing();
		}
	}
}
}
