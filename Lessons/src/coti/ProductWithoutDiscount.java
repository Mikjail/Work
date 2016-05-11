package coti;

public class ProductWithoutDiscount extends Product{

	public ProductWithoutDiscount(Integer idProduct, String descripcion, float price, Integer cantidad) {
		super(idProduct, descripcion, price, cantidad);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Integer getIdProduct() {
		return super.idProduct;
	}

	@Override
	public void setIdProduct(Integer idProduct) {
		super.idProduct = idProduct;
	}
	
	@Override
	public void setCodigo(Integer codigo) {
		super.barCode = codigo;
	}
	
	@Override
	public String getDescripcion() {
		return super.descripcion;
	}
	
	@Override
	public void setDescripcion(String descripcion) {
		super.descripcion = descripcion;
	}

	@Override
	public Integer getCantidad() {
		return super.cantidad;
	}

	@Override
	public void setCantidad(Integer cantidad) {
		super.cantidad = cantidad;
	}

	@Override
	public Float getPrice() {
		return price;
	}

	@Override
	public void setPrice(Float precio) {
		this.price = precio;
	}

	
	@Override
	public float calculatePrice(float desc) {
		// TODO Auto-generated method stub
		return super.price;
	}
	
	@Override
	public void addProduct(int cantidad) {
		// TODO Auto-generated method stub
		super.cantidad += cantidad;
	}

	@Override
	public void removeProduct(int cantidad) {
		// TODO Auto-generated method stub
		super.cantidad -= cantidad;
	}

}
