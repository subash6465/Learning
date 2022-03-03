package Concurrency;

public class Concurrency {

	public static void main(String[] args) {
		
		BiCounterWithAtomicInt counter = new BiCounterWithAtomicInt();
		counter.incrementI();
		counter.incrementI();
		counter.incrementI();
		counter.incrementJ();
		counter.incrementJ();
		counter.incrementJ();
		System.out.println(counter.getI());
		System.out.println(counter.getJ());

	}

}
