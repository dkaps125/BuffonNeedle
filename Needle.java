package BuffonNeedle;

import java.util.Random;

public class Needle {
	private Random generator;
	public int hits;
	private int tries;
	public double ylow;
	public double yhigh;
	public double angle;
	public String status;

	public Needle() {
		this.hits = 0;
		this.tries = 0;
		generator = new Random();
	}
	
	public void drop() {
		this.ylow = 2 * generator.nextDouble();
		this.angle = 180 * generator.nextDouble();
		
		this.yhigh = ylow + Math.sin(Math.toRadians(angle));
		tries++;
	}
	
	public int getHits() {
		return this.hits;
	}
	
	public int getTries() {
		return this.tries;
	}
}
