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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((numeroImaginario == null) ? 0 : numeroImaginario.hashCode());
		result = prime * result
				+ ((numeroReal == null) ? 0 : numeroReal.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejos other = (Complejos) obj;
		if (numeroImaginario == null) {
			if (other.numeroImaginario != null)
				return false;
		} else if (!numeroImaginario.equals(other.numeroImaginario))
			return false;
		if (numeroReal == null) {
			if (other.numeroReal != null)
				return false;
		} else if (!numeroReal.equals(other.numeroReal))
			return false;
		return true;
	}
	
	
	
}
