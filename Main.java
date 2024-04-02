package media_aluno;

public class Main {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 50;
		int nota3 = 70;
		int nota4 = 60;
		int mediaNota = 0;
		 
		 mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;
		 
		 
		 if (mediaNota >= 70) {
			 
			 
			 System.out.println("Aprovado " + mediaNota);
			 
		 }
		
		 
		 else if (mediaNota <= 60 ) {
			 
			 System.out.println("recuperação " + mediaNota);
			 
		 }
		 
		 else {
			 
			 
			 System.out.println("Reprovado " + mediaNota);
		 }

	}

}
