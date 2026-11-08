package b4hive;

public class Venda implements Setor {
    @Override
    public String processarPedido(String cliente, String pedido) {
        return "Processando pedido de compra do produto: " + pedido + " para o cliente " + cliente + ".";
    }
}
