package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Leonardo Santiago Gon�alves 81612334 SI3AN-MCA
 * 			
 *
 */

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Jessica";
		String sobrenome = "Alexandre";
		
		fn.getNome(nome, sobrenome);

	}

}