package Exercicio1_1_Abstract_Factory;
/**
 * 
 * @author Leonardo Santiago Gon�alves 81612334 SI3AN-MCA
 * 			
 *
 */


//Impress�o na Tela
public class ImpressaoTela implements Impressao {
	
	public void imprimir(String string) {
		System.out.println(string);
	}

}
