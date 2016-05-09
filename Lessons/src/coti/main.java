package coti;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Cliente cliente1 = new Cliente("Juan",25);
		Cliente cliente2 = new Cliente("Pedro", 10);
		Shelf shelfProducts = new Shelf();
		//SE AGREGA STOCK A COTI
		Shelf.addProduct(shelfProducts, new ProductWithDiscount("Trigo",20, 100));
		Shelf.addProduct(shelfProducts, new ProductWithoutDiscount("Maiz",30, 100));
		Shelf.addProduct(shelfProducts, new ProductWithDiscount("Oreo",15, 100));
		
		
		//SE REALIZA UNA NUEVA COMPRA
		Order compraNueva = new Order(new CotiCard());		
		compraNueva.addProduct(shelfProducts, new ProductWithDiscount("Trigo", 15, 1));
		compraNueva.addProduct(shelfProducts, new ProductWithDiscount("Maiz", 15, 3));
		compraNueva.addProduct(shelfProducts, new ProductWithoutDiscount("Arvejas",20, 3));
		compraNueva.addProduct(shelfProducts, new ProductWithoutDiscount("Oreo",26, 4));
		 
		compraNueva.Pagar();
		
		
		//SE LE AGREGA COMPRA AL CLIENTE1.
		cliente1.AgregarAListaCompras(compraNueva);
		
		
		
		
		//SE REALIZA OTRA COMPRA
		Order otraCompra = new Order(new DebitCard());
		
		otraCompra.addProduct(shelfProducts, new ProductWithDiscount("Porotos",36, 5));
		otraCompra.addProduct(shelfProducts, new ProductWithoutDiscount("Toddy",19, 10));
		otraCompra.addProduct(shelfProducts, new ProductWithoutDiscount("Trigo",16, 36));
		
		
		otraCompra.Pagar();
		
		//SE LE AGREGA COMPRA AL CLIENTE2
		cliente2.AgregarAListaCompras(otraCompra);
		
	

		System.out.println("PASAMOS A MOSTRAR LAS COMPRAS DE CADA CLIENTE");
	
		cliente1.Mostrar();
		
		cliente2.Mostrar();
	}

}
