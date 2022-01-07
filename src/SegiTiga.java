
public class SegiTiga extends Bentuk{
	Integer tinggi, alas;
	public SegiTiga(Integer tinggi, Integer alas) {
		this.tinggi = tinggi;
		this.alas = alas;
	}
	@Override
	Double luas() {
		Double luas = 0.5 * (double) tinggi * (double) alas;
		return luas;
	}
	@Override
	Double keliling() {
		// TODO Auto-generated method stub
		System.out.println("Keliling memerluakan atribut sisi");
		return null;
	}
	@Override
	Double volume() {
		System.out.println("Segitiga tidak punya volume");
		return null;
	}
	@Override
	void keteranganAtribut() {
		System.out.println("Segitiga meiliki 3 sisi, alas, dan luas");
		
	}

}
