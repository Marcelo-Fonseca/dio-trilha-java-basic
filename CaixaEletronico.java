public class CaixaEletronico {
    public static void main(String[]args) {
        //condição composta tem true e false
        
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo " + saldo);


        }else {
            System.out.println("Saldo insufuciente...");
        }
    }
    
}
