package principal;

import java.util.Date;

import model.Cliente;
import model.Pedido;
import model.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Victor", "victor@gmail.com", 1);
		
		Produto produto = new Produto("notebook",100, 1000.99);
		
		Date data = new Date();
		
		Pedido pedido = new Pedido(1, cliente, produto, 1, data);
		
		pedido.exibirPedido(pedido);

	}

}
