package b4hive;

public class Financeiro implements Setor {
    @Override
    public String processarPedido(String cliente, String pedido) {
        return "Processando pedido de negociação do valor: " + pedido + " para o cliente " + cliente + ".";
    }
}
