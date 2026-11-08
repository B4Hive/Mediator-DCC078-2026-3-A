package b4hive;

public class Atendimento {

    private static Atendimento instance = new Atendimento();
    private Atendimento(){}
    public static Atendimento getInstance() { return instance; }

    public String pedidoCompra(String cliente, String produto) {
        return "Resposta do setor de Venda:\n>>" + new Venda().processarPedido(cliente, produto);
    }

    public String pedidoNegociacao(String cliente, int divida) {
        return "Resposta do setor de Financeiro:\n>>" + new Financeiro().processarPedido(cliente, "R$" + String.valueOf(divida));
    }

    public String registroReclamacao(String cliente, String assunto) {
        return "Resposta do setor de Ouvidoria:\n>>" + new Ouvidoria().processarPedido(cliente, assunto);
    }

    public String pedidoCancelamento(String cliente) {
        return "Resposta do setor de Cancelamento:\n>>" + new Cancelamento().processarPedido(cliente, "Pedido de cancelamento");
    }

    public String registroElogio(String cliente, String assunto) {
        return "Resposta do setor de Atendimento:\n>>" + "Registro de elogio sobre: " + assunto + " do cliente " + cliente + ".";
    }

}
