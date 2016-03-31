package Coty;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Cliente cliente1 = new Cliente("Juan",25);
		Cliente cliente2 = new Cliente("Pedro", 10);
	
		//SE AGREGA STOCK A COTI
		Stock.AgregarProducto(new Cereales(ECereales.Trigo,100));
		Stock.AgregarProducto(new Granos(EGranos.Maiz,100));
		Stock.AgregarProducto(new Galletas(EGalletas.Oreo,100));
		
		
		//SE REALIZA UNA NUEVA COMPRA
		Compra compraNueva = new Compra();		
		compraNueva.AgregarProducto(new Cereales(ECereales.Trigo,1));
		compraNueva.AgregarProducto(new Granos(EGranos.Maiz,3));
		compraNueva.AgregarProducto(new Granos(EGranos.Arvejas,3));
		compraNueva.AgregarProducto(new Galletas(EGalletas.Oreo,4));
		
		//SE LE AGREGA COMPRA AL CLIENTE1.
		cliente1.AgregarAListaCompras(compraNueva);
		
		
		//SE REALIZA OTRA COMPRA
		Compra otraCompra = new Compra();
		
		otraCompra.AgregarProducto(new Granos(EGranos.Poroto,5));
		otraCompra.AgregarProducto(new Galletas(EGalletas.Toddy,10));
		otraCompra.AgregarProducto(new Cereales(ECereales.Trigo,36));
		
		
		//SE LE AGREGA COMPRA AL CLIENTE2
		cliente2.AgregarAListaCompras(otraCompra);

		System.out.println("PASAMOS A MOSTRAR LAS COMPRAS DE CADA CLIENTE");
	
		cliente1.Mostrar();
		
		cliente2.Mostrar();
	}

}
