package Coty;

enum ECereales{
	Arroz,
	Trigo,
	Centeno
}

public class Cereales extends Producto{

	public Cereales(ECereales descripcion, Integer cantidad) {
		super(descripcion,cantidad);
		// TODO Auto-generated constructor stub
		super.precio= CalcularPrecio(descripcion);
	}

	private float CalcularPrecio(ECereales descripcion){
		switch (descripcion) {
		
		case Arroz:
			return super.cantidad * 13f;
			
		case Trigo:
			return  super.cantidad * 21f;
			
		default:
			return super.cantidad * 10f;
		}
	}
}
