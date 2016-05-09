package coti;

public class ProductWithDiscount extends Product{

	public ProductWithDiscount(String descripcion,float price, Integer cantidad) {
		super(descripcion, price,  cantidad);
		System.out.println("usted creo un "+ descripcion.toString());
		// TODO Auto-generated constructor stub
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
		return super.price * desc;
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
