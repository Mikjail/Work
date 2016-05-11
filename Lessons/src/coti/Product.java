package coti;

abstract public class Product {

	protected Integer barCode;
	protected Integer idProduct;
	protected String descripcion;
	protected Integer cantidad;
	protected Float price;
	
	public abstract Integer getIdProduct();
	
	public abstract void setIdProduct(Integer idProduct);
	
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
	
	public Product(Integer idProduct, String descripcion, float price, Integer cantidad){
		this.idProduct = idProduct;
		this.barCode = (int)(Math.random() * (100 - 1) + 1);
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.price = price;
	}
	
	public abstract float calculatePrice(float desc);
	
	public abstract void addProduct(int cantidad);
	
	public abstract void removeProduct(int cantidad);
}
