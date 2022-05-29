package subsistemaCRM2.CEP;



public class cepAPI {

	private static cepAPI instancia = new cepAPI();
	
	private cepAPI () {
		super ();
	}
	public static cepAPI getInstancia() {
		return instancia; 
	}
	
	public String recuperarCidade (String cep) {
		return "Cotia";
		
	}
	
	public String recuperarEstado (String cep) {
		return "SP";
}
}