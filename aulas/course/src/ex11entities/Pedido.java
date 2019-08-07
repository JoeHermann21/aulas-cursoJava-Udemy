package ex11entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Pedido {
	private Date momento;
	private OrderStatus status;

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Pedido() {

	}

	public Pedido(Date momento, OrderStatus status) {
		this.momento = momento;
		this.status = status;
	}

	public List<Item> items = new ArrayList<>();

	public Double total() {
		Double preco = 0.0;
		for (Item item : items) {
			preco += item.subTotal();
		}
		return preco;
	}

	private Cliente cliente;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido(Date momento, OrderStatus status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public String PegaDataAtual() {
		Calendar calendar = new GregorianCalendar();
		Date momento = calendar.getTime();
		calendar.setTime(momento);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM");
		return sdf.format(momento);
	}

	Cliente c = new Cliente();
	Product p = new Product();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido");
		String pda = PegaDataAtual();
		sb.append(pda + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido: ");
		for (Item i : items) {
			sb.append(i + "\n");
		}
		sb.append("Preco Total: ");
		sb.append(total());
		return sb.toString();
	}

}
