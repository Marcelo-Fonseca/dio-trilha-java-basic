public class ResultadoEscolarTernario {
    public static void main(String[] args) {
      int nota = 8;
        String resultados = nota >= 7 ? "Aprovado": "Reprovado";
        System.out.println(resultados);

        //encadeado
        int notass= 9;
        String resultadoss = notass > 6 ? "Aprovado " : notass >=5 && notass < 8 ? "Recuperação" : "Reprovado";
        System.out.println(resultadoss);

    
    }
    
}
