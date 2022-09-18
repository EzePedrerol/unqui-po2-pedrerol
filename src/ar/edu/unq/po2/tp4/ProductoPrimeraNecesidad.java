package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularPrecio() {
		return (this.getPrecio() * 0.1);
	}
	
}
