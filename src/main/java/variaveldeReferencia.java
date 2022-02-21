public class variaveldeReferencia {
	
	public static void main	(String[] args){
		
		//Variavel Primitiva
		int x = 7;
		x = 9; // se eu colocar outro valor de uma variavel ela sera substituida pelo novo valor
		
		//Variavel de Referencia
		String y = "David";
		y = "david55.com.br"; /**o novo valor atribuido a y não substituira o antigo"david" ele ainda permanecera
		na memoria então é criado um novo link para david55.com.br*/
		y = null; // null serve para quando vc queira não informar nenum valor para uma variavel
		
	System.out.println (y);	
	}

}
/** variavel de referencia é toda variavel que tem seu valor apontando a um objeto
a diferença entre uma variavel primitiva e uma variavel de referencia é que 
variavel primitiva int x = 7; x é como se fosse um compo e 7 seria o valor contido dentro do copo ou seja 7 = x 

já uma variavel de referencia  String y = "david"; String = y é como se fosse um copo e dentro desse copo ele tivensse um controle que de 
alguma forma ele linka direto a um objeto "david"


*/