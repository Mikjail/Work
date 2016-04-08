package coti.domain;

public class ProductoSinDesc extends Producto{

	public ProductoSinDesc(Enum<?> descripcion, Integer cantidad) {
		super(descripcion, cantidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float CalcularPrecio(float desc) {
		// TODO Auto-generated method stub
		return super.precio;
	}
	
	@Override
	public void AgregarProducto(int cantidad) {
		// TODO Auto-generated method stub
		super.cantidad += cantidad;
	}

	@Override
	public void RemoverProducto(int cantidad) {
		// TODO Auto-generated method stub
		super.cantidad -= cantidad;
	}

}
