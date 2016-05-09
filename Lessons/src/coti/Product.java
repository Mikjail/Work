package coti;

abstract public class Product {

	protected Integer barCode;
	protected String descripcion;
	protected Integer cantidad;
	protected Float price;
	public Integer getCodigo() {
		return barCode;
	}

	public abstract void setCodigo(Integer codigo);
	
	public abstract String getDescripcion();
	
	public abstract void setDescripcion(String descripcion);

	public abstract Integer getCantidad();

	public abstract void setCantidad(Integer cantidad);
	
	public abstract Float getPrice();
	
	public abstract void setPrice(Float precio);
	
	public Product(String descripcion, float price, Integer cantidad){
		
		this.barCode = (int)(Math.random() * (100 - 1) + 1);
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.price = price;
	}
	
	public abstract float calculatePrice(float desc);
	
	public abstract void addProduct(int cantidad);
	
	public abstract void removeProduct(int cantidad);
}
