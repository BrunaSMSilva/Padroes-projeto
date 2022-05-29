package PACKFacade;

import subsistemaCRM1.CRMService;
import subsistemaCRM2.CEP.cepAPI;

public class Facade {
		public void migrarCliente (String nome, String cep) {
		String cidade = cepAPI.getInstancia().recuperarCidade(cep);
		String estado = cepAPI.getInstancia().recuperarEstado(cep);
		  CRMService.gravarCliente(nome, cep, cidade, estado);
		}
}
