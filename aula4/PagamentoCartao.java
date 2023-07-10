package aula4;

public class PagamentoCartao implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via cartão de crédito no valor de R$" + valor);
        // Lógica específica para processamento de pagamento via cartão de crédito
    }
}