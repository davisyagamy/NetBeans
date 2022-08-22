public class TarjetaOro extends TarjetaCine {
	private String [] beneficiosDescriocion = new String [] {"Boleto Gratis" , "Crispetas gratis" , "Gaseosa Gratis"};
	private boolean [] beneficiosEstado = new boolean [] {true ,true, true};
	
	public TarjetaOro (String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
		super (idTarjeta, nombreCompleto, email, telefono, edad, 20); 
	}

	public String[] getBeneficiosDescriocion() {
		return beneficiosDescriocion;
	}

	public void setBeneficiosDescriocion(String[] beneficiosDescriocion) {
		this.beneficiosDescriocion = beneficiosDescriocion;
	}

	public boolean[] getBeneficiosEstado() {
		return beneficiosEstado;
	}

	public void setBeneficiosEstado(boolean[] beneficiosEstado) {
		this.beneficiosEstado = beneficiosEstado;
	}
	
	public boolean redimirBeneficio (int posicionBeneficio) {
		if (this.beneficiosEstado [posicionBeneficio]) {
			this.beneficiosEstado [posicionBeneficio] = false;
			return true;
		}
		return false;
	}
	
	

}
