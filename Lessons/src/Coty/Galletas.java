package Coty;
enum EGalletas{
	Oreo,
	Cerealitas,
	Toddy,
}

public class Galletas extends Producto {

	public Galletas(EGalletas descripcion, Integer cantidad) {
		super(descripcion, cantidad);
		super.precio= CalcularPrecio(descripcion);
	}
	
	private float CalcularPrecio(EGalletas descripcion){
		switch (descripcion) {
		
		case Oreo:
			return super.cantidad * 27f;
				
		case Cerealitas:
			return  super.cantidad * 22f;
			
		default:
			return super.cantidad * 30f;
		}
	}

}
