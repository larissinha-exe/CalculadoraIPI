import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo a porcentagem do IPI
        System.out.print("Informe a porcentagem do IPI a ser acrescido (%): ");
        double ipiPorcentagem = scanner.nextDouble();

        // Recebendo os detalhes do produto 1
        System.out.print("Informe o código do produto 1: ");
        int codigoProduto1 = scanner.nextInt();
        System.out.print("Informe o valor unitário do produto 1: ");
        double valorUnitarioProduto1 = scanner.nextDouble();
        System.out.print("Informe a quantidade do produto 1: ");
        int quantidadeProduto1 = scanner.nextInt();

        // Recebendo os detalhes do produto 2
        System.out.print("Informe o código do produto 2: ");
        int codigoProduto2 = scanner.nextInt();
        System.out.print("Informe o valor unitário do produto 2: ");
        double valorUnitarioProduto2 = scanner.nextDouble();
        System.out.print("Informe a quantidade do produto 2: ");
        int quantidadeProduto2 = scanner.nextInt();

        // Calculando o total a ser pago
        double totalProduto1 = valorUnitarioProduto1 * quantidadeProduto1;
        double totalProduto2 = valorUnitarioProduto2 * quantidadeProduto2;
        double totalSemIPI = totalProduto1 + totalProduto2;
        double ipi = totalSemIPI * (ipiPorcentagem / 100);
        double totalComIPI = totalSemIPI + ipi;

        // Apresentando o resultado detalhado
        System.out.println("\nDetalhamento da compra:");
        System.out.println("Produto 1 - Código: " + codigoProduto1 + ", Valor Unitário: R$" + valorUnitarioProduto1 + ", Quantidade: " + quantidadeProduto1 + ", Total: R$" + totalProduto1);
        System.out.println("Produto 2 - Código: " + codigoProduto2 + ", Valor Unitário: R$" + valorUnitarioProduto2 + ", Quantidade: " + quantidadeProduto2 + ", Total: R$" + totalProduto2);
        System.out.println("Total sem IPI: R$" + totalSemIPI);
        System.out.println("IPI (" + ipiPorcentagem + "%): R$" + ipi);
        System.out.println("Total com IPI: R$" + totalComIPI);

        scanner.close();
    }
}