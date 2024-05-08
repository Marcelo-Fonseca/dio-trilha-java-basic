public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Os oitos tipos primitivos em java:
        //tipo       menoria   valor minimo
        //int        4bytes 
        //byte       1byte 
        //long        8bytes

        //float  
        //double
        //boolean
        //char
        //esses tipos não sao considerados objetos sao armazenados diretamente na pilha de memoria.
//JAVA É FORTAMENTE TIPADO
//-------------------------------------------------------------------------------------------------------------

double salarioMinimo = 2500;
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal; 


// constantes é um valor em menoria que não pode ser mudado.
// em java esses valores sao representados pela palavra reservada "final  ler fainel " e segundo tipo
// Todo o valor que quer que seja uma constante tem que estar em CAIXA ALTA

final double VALOR_DE_PI = 3.14;
    }
}
