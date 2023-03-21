package view;
import controller.Ordenacoes;

	public class Principal {
	
		public static void main(String[] args) {
			int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
			Ordenacoes ordena = new Ordenacoes();
			
			vetor = ordena.quickSort(vetor, 0, vetor.length-1);
			for (int i = 0; i < vetor.length; i++) {
				System.out.print(vetor[i]+ " ");
			}
	}	
}