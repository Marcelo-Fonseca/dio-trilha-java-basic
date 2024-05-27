import java.util.Scanner;

public class DriverEarningsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita informações ao usuário
        System.out.print("Meta de lucro mensal (R$): ");
        double lucroMensal = scanner.nextDouble();

        System.out.print("Preço do combustível por litro (R$): ");
        double precoCombustivel = scanner.nextDouble();

        System.out.print("Custos de manutenção mensais (R$): ");
        double custosManutencao = scanner.nextDouble();

        System.out.print("Comissão do aplicativo (%): ");
        double comissaoApp = scanner.nextDouble() / 100;

        System.out.print("Número de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        System.out.print("Quilômetros rodados por dia: ");
        double kmPorDia = scanner.nextDouble();

        // Consumo de combustível do carro
        double kmPorLitro = 10.0;

        // Calcula os custos mensais com combustível
        double consumoMensalCombustivel = (kmPorDia * diasTrabalhados) / kmPorLitro;
        double custoMensalCombustivel = consumoMensalCombustivel * precoCombustivel;

        // Calcula os custos operacionais totais
        double custosOperacionais = custoMensalCombustivel + custosManutencao;

        // Calcula o ganho bruto necessário
        double ganhoBrutoNecessarioMensal = (lucroMensal + custosOperacionais) / (1 - comissaoApp);

        // Calcula o ganho diário necessário
        double ganhoDiarioNecessario = ganhoBrutoNecessarioMensal / diasTrabalhados;

        // Exibe os resultados
        System.out.printf("Ganho bruto necessário por dia: R$ %.2f%n", ganhoDiarioNecessario);

        // Fecha o scanner
        scanner.close();
    }
}

