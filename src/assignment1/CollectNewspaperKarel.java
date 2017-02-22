package assignment1;

import stanford.karel.SuperKarel;

public class CollectNewspaperKarel extends SuperKarel {
	
	@Override
	public void run() {
		System.out.println("Before run: CollectNewspaper Karel");
		move();
		move();
		move();
		move();
		System.out.println("After run: CollectNewspaper Karel");
	}

}
