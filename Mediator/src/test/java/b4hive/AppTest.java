package b4hive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCompra() {
        Cliente cliente = new Cliente("Cliente1");
        assertEquals("Resposta do setor de Venda:\n>>Processando pedido de compra do produto: Produto1 para o cliente Cliente1.", cliente.comprar("Produto1"));
    }

    @Test
    public void testNegociacao() {
        Cliente cliente = new Cliente("Cliente1");
        assertEquals("Resposta do setor de Financeiro:\n>>Processando pedido de negociação do valor: R$100 para o cliente Cliente1.", cliente.negociar(100));
    }

    @Test
    public void testReclamacao() {
        Cliente cliente = new Cliente("Cliente1");
        assertEquals("Resposta do setor de Ouvidoria:\n>>Processando registro de reclamação sobre: Assunto1 do cliente Cliente1.", cliente.reclamar("Assunto1"));
    }

    @Test 
    public void testCancelamento() {
        Cliente cliente = new Cliente("Cliente1");
        assertEquals("Resposta do setor de Cancelamento:\n>>Processando pedido de cancelamento para o cliente Cliente1.", cliente.cancelar());
    }

    @Test
    public void testElogio() {
        Cliente cliente = new Cliente("Cliente1");
        assertEquals("Resposta do setor de Atendimento:\n>>Registro de elogio sobre: Assunto1 do cliente Cliente1.", cliente.elogiar("Assunto1"));
    }

}
