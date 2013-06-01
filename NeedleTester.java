package BuffonNeedle;

public class NeedleTester {

	public static void main(String[] args) {
		Needle n = new Needle(); 
		final int TRIES1 = 10000;
		final int TRIES2 = 1000000;
		
		for (int i = 1; i <= TRIES1; i++)
			n.drop();
		System.out.printf("Tries = %d, Tries / hits = %8.5f\n", 
				TRIES1, (double) n.getTries() / n.getHits());
		
		for (int i = TRIES1 + 1; i <= TRIES2; i++)
			n.drop();
		System.out.printf("Tries = %d, Tries / hits = %8.5f\n", 
				TRIES2, (double) n.getTries() / n.getHits());
	}
}
