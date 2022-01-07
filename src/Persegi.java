
public class Persegi extends Bentuk {

	Integer panjang, lebar;
	
	public Persegi(Integer panjang, Integer lebar) {
		// TODO Auto-generated constructor stub
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	Double luas() {
		// TODO Auto-generated method stub
		Double luas = (double) panjang * (double) lebar;
		return (double) luas;
	}

	@Override
	Double keliling() {
		// TODO Auto-generated method stub
		Double keliling = ((double) panjang + (double) lebar)*2;
		return keliling;
	}

	@Override
	Double volume() {
		// TODO Auto-generated method stub
		System.out.println("Di persegi, tidak mempunyai volume karena persegi merupakan bangun 2 dimensi");
		return null;
	}

	@Override
	void keteranganAtribut() {
		// TODO Auto-generated method stub
		System.out.println("Persegi memiliki panjang, lebar, luas, dan keliling");
	}

}
