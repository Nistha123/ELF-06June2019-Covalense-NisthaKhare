
public class TestCard {

	public static void main(String[] args) {

		Card j = new Card();
		Card a = new Card();
		
		j.swipe();
		a.swipe();
		j.swipe();
		
		System.out.println("Java count is " + j.count);
		System.out.println("angular count is " + a.count);
		System.out.println("organization count is " + Card.orgCount);
		
	}

}
