import java.util.Scanner;

class HitVolBola {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	RumusBola rumus = new RumusBola();
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Menghitung volume bola");
	System.out.println();
	System.out.print("Masukkan jari-jari : ");
	jari = input.nextInt();
	System.out.println();
	
	rumus.radius(jari);
	rumus.tampil();
	rumus.hitung(jari);

	}	
}