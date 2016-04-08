package coti.domain;

abstract public class Producto {

	protected Integer codigo;
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Enum<?> getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Enum<?> descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	protected Enum<?> descripcion;
	protected Integer cantidad;
	protected Float precio;
	
	public Producto(Enum<?> descripcion, Integer cantidad){
		
		this.codigo = (int)(Math.random() * (100 - 1) + 1);
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	
	public abstract float CalcularPrecio(float desc);
	
	public abstract void AgregarProducto(int cantidad);
	
	public abstract void RemoverProducto(int cantidad);
}
