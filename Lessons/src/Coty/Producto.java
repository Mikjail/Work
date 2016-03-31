package Coty;

abstract public class Producto {

	protected Integer codigo;
	protected Enum<?> descripcion;
	protected Integer cantidad;
	protected Float precio;
	
	public Producto(Enum<?> descripcion, Integer cantidad){
		
		this.codigo = (int)(Math.random() * (100 - 1) + 1);
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
}
