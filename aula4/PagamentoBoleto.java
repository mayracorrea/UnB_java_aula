package aula4;

public class PagamentoBoleto  implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via boleto bancário no valor de R$" + valor);
        // Lógica específica para processamento de pagamento via boleto bancário
    }
}