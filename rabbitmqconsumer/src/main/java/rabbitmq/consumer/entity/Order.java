package rabbitmq.consumer.entity;

public class Order {

	private int orderID;
	private String date;

	
	public Order() {
	}

	public Order(int orderID, String date) {
		this.orderID = orderID;
		this.date = date;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}	
}
