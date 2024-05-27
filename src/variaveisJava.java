
	
	public class variaveisJava {
		
		/*variavel global é acessivel a todos */
		static int maiorIdadeGlobal = 30;

		public static void main(String[] args) {
			
			/*variavel local pertence somente a esse metodo */
			int maiorIdade = 18;
			System.out.println("Valor variavel local = " + maiorIdade);
			
			metodo2();
			
		}
		
		public static void metodo2() {
			System.out.println("Valor da variavel global = " + maiorIdadeGlobal);
			}
			
	}
	
