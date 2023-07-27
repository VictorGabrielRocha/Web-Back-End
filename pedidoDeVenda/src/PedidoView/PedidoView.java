package PedidoView;

import model.Pedido;

public class PedidoView {

	public void exibirPedido(Pedido pedido) {
		System.out.println("Detalhes do Pedido");
		System.out.println("Id: " + getIdPedido());
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Produto: " + getProduto().getNome());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Data: " + getData());
	}

	private String getIdPedido() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
