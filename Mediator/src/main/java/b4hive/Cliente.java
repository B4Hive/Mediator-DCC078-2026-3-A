package b4hive;

public class Cliente {
    
    private String name;

    public Cliente(String name) { this.name = name; }

    public String getName() { return name; }

    public String comprar(String produto) {
        return Atendimento.getInstance().pedidoCompra(getName(), produto);
    }

    public String negociar(int divida) {
        return Atendimento.getInstance().pedidoNegociacao(getName(), divida);
    }

    public String reclamar(String assunto) {
        return Atendimento.getInstance().registroReclamacao(getName(), assunto);
    }

    public String cancelar() {
        return Atendimento.getInstance().pedidoCancelamento(getName());
    }

    public String elogiar(String assunto) {
        return Atendimento.getInstance().registroElogio(getName(), assunto);
    }

}
