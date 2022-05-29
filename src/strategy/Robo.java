package strategy;

public class Robo {
		private Comportamento comportamento;

		public void setStrategy(Comportamento strategy) {
			this.comportamento = strategy;
		} 
		
		public void mover () {
			comportamento.mover();
	
		}
}
