package calculadoraPOO;

public class Calculadora {

	private Double n1;
	private Double n2;
	private int n3;

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN1() {
		return this.n1;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public Double getN2() {
		return this.n2;
	}

	public void Soma() {
		Double n3 = this.getN1() + this.getN2();
		System.out.println("A soma é: " + n3);
	}

	public void Subtacao() {
		Double n3;
		if (this.getN1() > this.getN2()) {
			n3 = this.getN1() - this.getN2();
			System.out.println("1º: " + n3);
			
		} else if (this.getN2() > this.getN1()) {
			n3 = this.getN2() - this.getN1();
			System.out.println("2º: " + n3);
			
		} else{
			n3 = this.getN1() - this.getN2();
			System.out.println("3º: " + n3);
		}
	}
	
	public void MostrarTabuadaN1() {
		for(this.n3 = 0 ; this.n3 <=10; this.n3 =this.n3+1) {
			Double n4 = this.n3 * this.getN1();
			System.out.println(this.n3+" x "+this.getN1()+" = "+n4);
		}
	}
	
	public void MostrarTabuadaN2() {
		for(this.n3 = 0 ; this.n3 <=10 ; this.n3++) {
			double n4 = this.n3 * this.getN2();
			System.out.println(this.n3+" x "+this.getN2()+" = "+n4);
		}
	}
	
	public void Divisao() {
		if(this.getN1() > this.getN2()) {
			double n3 = this.getN1() / this.getN2();
			System.out.println("1º: A divisao de "+this.getN1()+" por "+this.getN2()+" é de "+n3);
		}else if(this.getN2() > this.getN1()) {
			double n3 = this.getN2() / this.getN1();
			System.out.println("2º: A divisao de "+this.getN2()+" por "+this.getN1()+" é de "+n3);
		}else {
			double n3 = this.getN2() / this.getN1();
			System.out.println("3º: A divisao de "+this.getN2()+" por "+this.getN1()+" é de "+n3);
		}
	}
	
	public void Multiplicacao() {
		double n3;
		n3 = this.getN1() * this.getN2();
		System.out.println(this.getN1()+" X "+this.getN2()+" = "+n3);
	}

}
