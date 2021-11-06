public class RumusBola extends volbola {
	private Double hasil; 
	final double pi = 3.14;
	
	
	void hitung(int r){
		System.out.println("Volume Bola = " +  String.format("%.2f",(1.33*pi*r*r*r)));
	}
	
	void tampil(){
		System.out.println("Rumus Volume Bola : (4/3)*pi*jari^3");
	}
	
}