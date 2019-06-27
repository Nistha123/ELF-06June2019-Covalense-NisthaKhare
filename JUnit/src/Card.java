
public class Card {
	
	int count;
	static int orgCount;
	
	void swipe()
	{
		count++; 
		System.out.println(orgCount++);
	}

}
