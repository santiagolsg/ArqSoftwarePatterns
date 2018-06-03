package Exercicio1;

/**
 * 
 * @author Leonardo Santiago Gon�alves 81612334 SI3AN-MCA
 * 			
 *
 */

public class Incremental {

	private static final Object lock = new Object();

	private static Incremental singletonInstance;

	private static int count = 0;

	private int numero;

	private Incremental() {
		numero = ++count;
	}

	public static Incremental getInstance() {
		synchronized (lock) {
			if (singletonInstance == null)
				singletonInstance = new Incremental();
		}

		return singletonInstance;
	}

	public String toString() {
		return "Incremental " + numero;
	}

	public static class TesteIncremental {
		public static void main(String[] args) {
			for (int i = 0; i < 10; i++) {
				Incremental inc = new Incremental();
				System.out.println(inc);
			}
		}
	}
}
