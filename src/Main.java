
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		//buat object persegi
		Persegi kotak = new Persegi(12, 15);
		System.out.println("Luas persegi kotak: " + kotak.luas());
		System.out.println("Keliling persegi kotak: " + kotak.keliling());
		System.out.println("Volume persegi kotak: " + kotak.volume());
		kotak.keteranganAtribut();
		kotak.printBentuk();
		
		SegiTiga segi3 = new SegiTiga(5, 10);
		System.out.println("Luas segi3: " + segi3.luas());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
