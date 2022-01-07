
public abstract class Bentuk {
	Integer tinggi;
	Integer lebar;
	
	//method abstract
	abstract Double luas();
	abstract Double keliling();
	abstract Double volume();
	abstract void keteranganAtribut();
	void printBentuk() {
		System.out.println("Bentuk adalah sesuatu yang bisa dilihat manusia");
	}

}
