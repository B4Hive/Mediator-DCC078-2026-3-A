package b4hive;

public class Ouvidoria implements Setor {
    @Override
    public String processarPedido(String cliente, String pedido) {
        return "Processando registro de reclamação sobre: " + pedido + " do cliente " + cliente + ".";
    }
}
