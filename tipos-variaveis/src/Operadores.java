

public class Operadores {

    //Operadores são simbolos especiais
    //que utiliza em operações e expressoes matematica. 

    //Operadores aritimeticos
    //operadores unários
    //operadores relacionais
    //operadores lógicos
    //operadores ternarios

    //---------operadores- ATRIBUIÇÂO---------
    //operador    Comparação
    // ==   igual   
    //!=    Diferente
    //<     Menor
    //>     Maior
    //<=   Menor e igual
    //>=   Maior e igual 
    
    // = ATribuição
    // === igual e do mesmo tipo 
  // "" algo dentro de "" Representa String
    // . ponto é usado quando um valor tem separação ex 47.47 não se usa virgula.
    
    //exemplo
    //String nome = "Gleyson";
    //int idade = 22;
    //double peso 68.5;
    //boolean doador Orgao = false;
    //Date dataNascimento = new Date();

    //-------------------Operador aritimético -e utilizado para realizar operações matematicas
    //op aritiméticos sáo: +(adição) -(subtração) *(multiplicação) / (divição) %(resto da divição)

    //double soma = 10.5 +15.7;
    // int subtracao = 113 -25;
    //int divisao = 15 / 3;
    // modulo = 18 % 3;
    //double resultado = (10 * 7) + (20/4);
    //----------CONCATENAÇÃO DE TEXTOS "" + "";
    //concatenação é realizdo a junção de textos 
   //String nomeCompleto = "LINGUAGEM" + "JAVA";

   //qUAL O RESULTADO DAS EXPRESSOES ABAIXO?


public static void main(String[]args) {

String nomeCompleto = "LINGUAGEM" + "JAVA";
System.out.println(nomeCompleto);

//concatenacao1 =  1+1+1+"1";
//concatenacao2  = 1+"1"+1+1;
//concatenacao3 = 1+"1"+"1"+"1";
//



//OPERADOR UNIARIO
/*Esses operadore sao aplicado com outro operador aritimetico
 * Eles realizam alguns trabalhos basicos como incremetar e Descrementar
 * inverter valores numericos e booleanos.
 * (+) operador unario de valor positivo
 * (-) operador unario de balor negativo
 * (++) operador unario incrementando vaolor
 * (--) operador unario Descrementando valor 
 */


 //--------------Operador Ternario
//<expressao Condicional> ? <caso condição seja true> :
//<caso condição seja false>
   
int a, b;
a = 5;
b =5;
String resultado ="";
//Ex de Condicional utilizando uma estruuta if/else
if(a ==b) 
    resultado = "verdadeiro";

else {
    resultado = "falso";
    System.out.println(resultado);

//usando TERNARIO
}




String resultados = a ==b ? "verdadeiro" : "falsos";
System.out.println(resultados);



//------operadores RELACIONAIS
/* Os operadores relacinais avaliam a relação entre duas variaveis ou expressoes.
* == Quamdp desejamos verificar se uma variavel oi IGUAL a outra.
*!= Quando desejamos verificar se uam variavel é diferente da outra 
* > Quando desejamos rerificar se uma variavel MAIOR que a outra
* >= Quando desejamos rerificar se uma variavel MAIOR e IGUAL que a outra 
* < Quando desejamos rerificar se uma variavel MENOR que a outra
* <= Quando desejamos rerificar se uma variavel MENOR e IGUAL a outra
*/


int numero1 = 1;
int nuemro2 = 2;


//verif se é igual
boolean simNao = numero1 == nuemro2;
System.out.println("NumeroUm é igual ao NumeroDois? " + simNao);

//verif se diferente
 simNao = numero1 != nuemro2;
System.out.println("NumeroUm é Diferente ao NumeroDois? " + simNao);

//maior
simNao = numero1 > nuemro2;
System.out.println("NumeroUm é Maior ao NumeroDois? " + simNao);
//verif se menor
simNao = numero1 < nuemro2;
System.out.println("NumeroUm é Menor ao NumeroDois? " + simNao);
// Os operadores Relacionais em tomada de decisao e realia fluxos na nossa aplicação,
//dependo se a expressao  for verdeira
// para comparar objetos se usa equals

String nomeUm = "Marcelo";
String nomeDois = new String("Fonseca");
System.out.println(nomeUm.equals(nomeDois) );
System.out.println("---------------");





}

}