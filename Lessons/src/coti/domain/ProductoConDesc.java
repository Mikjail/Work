package coti.domain;

public class ProductoConDesc extends Producto{

	public ProductoConDesc(Enum<?> descripcion, Integer cantidad) {
		super(descripcion, cantidad);
		System.out.println("usted creo un "+ descripcion.toString());
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float CalcularPrecio(float desc) {
		// TODO Auto-generated method stub
		return super.precio * desc;
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
