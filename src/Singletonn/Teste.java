package Singletonn;

import PACKFacade.Facade;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo ();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo ();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade ();
		facade.migrarCliente ("Bruna", "06717-200");
		
	}
	
}
