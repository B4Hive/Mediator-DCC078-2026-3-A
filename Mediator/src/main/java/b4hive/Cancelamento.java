package b4hive;

public class Cancelamento implements Setor {
    @Override
    public String processarPedido(String cliente, String pedido) {
        return "Processando pedido de cancelamento para o cliente " + cliente + ".";
    }
}
