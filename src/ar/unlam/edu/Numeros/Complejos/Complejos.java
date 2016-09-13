package ar.unlam.edu.Numeros.Complejos;

public class Complejos {

	private Double numeroReal;
	private Double numeroImaginario;
	
	
	public Complejos(Double numeroReal, Double numeroImaginario){
		
		this.numeroReal = numeroReal;
		this.numeroImaginario = numeroImaginario;
	}
	

	public Double getNumeroReal() {
		return numeroReal;
	}


	public void setNumeroReal(Double numeroReal) {
		this.numeroReal = numeroReal;
	}


	public Double getNumeroImaginario() {
		return numeroImaginario;
	}


	public void setNumeroImaginario(Double numeroImaginario) {
		this.numeroImaginario = numeroImaginario;
	}


	public Complejos sumar(Complejos c1){
		Double sumaReal = this.numeroReal + c1.numeroReal;
		Double sumaImaginaria = this.numeroImaginario + c1.numeroImaginario;
		return new Complejos(sumaReal,sumaImaginaria);
	}
	
	public Complejos restar(Complejos c1){
		Double restaReal = this.numeroReal - c1.numeroReal;
		Double restaImaginaria = this.numeroImaginario - c1.numeroImaginario;
		return new Complejos(restaReal,restaImaginaria);
	}
	
	public Complejos multiplicar(Complejos c1){
		Double multiplicacionReal = this.numeroReal * c1.numeroReal;
		Double multiplicacionImaginaria = this.numeroImaginario * c1.numeroImaginario;
		return new Complejos(multiplicacionReal,multiplicacionImaginaria);
	}
	
	public Complejos multiplicarPorEscalar(Double escalar){
		
		return new Complejos(this.numeroReal*escalar,this.numeroImaginario*escalar);
		
	}
	
}
