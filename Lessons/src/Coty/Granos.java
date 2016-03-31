package Coty;
enum EGranos{
	Poroto,
	Arvejas,
	Maiz
}
public class Granos extends Producto {

	public Granos(EGranos descripcion, int cantidad) {
		super(descripcion, cantidad);
		// TODO Auto-generated constructor stub
		super.precio= CalcularPrecio(descripcion);
		
	}
	
	private float CalcularPrecio(EGranos descripcion){
		
		switch (descripcion) {
		case Arvejas:
				return super.cantidad * 18f;
		case Maiz:
				return super.cantidad * 15f;
		default:
				return super.precio = super.cantidad * 17f;
		}
	}
	

}
