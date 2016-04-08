package coti;

import coti.domain.ProductoConDesc;
import coti.domain.ProductoSinDesc;
import coti.domain.enums.eCereales;
import coti.domain.enums.eGalletas;
import coti.domain.enums.eGranos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Cliente cliente1 = new Cliente("Juan",25);
		Cliente cliente2 = new Cliente("Pedro", 10);
	
		//SE AGREGA STOCK A COTI
		Stock.AgregarProducto(new ProductoConDesc(eCereales.Trigo,100));
		Stock.AgregarProducto(new ProductoSinDesc(eGranos.Maiz,100));
		Stock.AgregarProducto(new ProductoConDesc(eGalletas.Oreo,100));
		
		
		//SE REALIZA UNA NUEVA COMPRA
		Compra compraNueva = new Compra(new TarjetaCoti());		
		compraNueva.AgregarProducto(new ProductoConDesc(eCereales.Trigo,1));
		compraNueva.AgregarProducto(new ProductoConDesc(eGranos.Maiz,3));
		compraNueva.AgregarProducto(new ProductoSinDesc(eGranos.Arvejas,3));
		compraNueva.AgregarProducto(new ProductoSinDesc(eGalletas.Oreo,4));
		
		compraNueva.Pagar();
		
		
		//SE LE AGREGA COMPRA AL CLIENTE1.
		cliente1.AgregarAListaCompras(compraNueva);
		
		
		
		
		//SE REALIZA OTRA COMPRA
		Compra otraCompra = new Compra(new TarjetaDebito());
		
		otraCompra.AgregarProducto(new ProductoConDesc(eGranos.Porotos,5));
		otraCompra.AgregarProducto(new ProductoSinDesc(eGalletas.Toddy,10));
		otraCompra.AgregarProducto(new ProductoSinDesc(eCereales.Trigo,36));
		
		
		otraCompra.Pagar();
		
		//SE LE AGREGA COMPRA AL CLIENTE2
		cliente2.AgregarAListaCompras(otraCompra);
		
	

		System.out.println("PASAMOS A MOSTRAR LAS COMPRAS DE CADA CLIENTE");
	
		cliente1.Mostrar();
		
		cliente2.Mostrar();
	}

}
