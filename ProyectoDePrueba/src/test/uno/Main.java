package test.uno;

public class Main {

	public static void main(String[] args) {
		System.out.println("INICIO");
		System.out.println("Funca el main");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Funca el main despues de 1 segundo");
		System.out.println("FIN");

	}

}
