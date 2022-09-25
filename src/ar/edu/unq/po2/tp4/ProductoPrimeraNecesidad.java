package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	

	public double descuentoCalculado() {
		return (this.getDescuento()*this.getPrecio())/100;
	}
	
	public double calcularPrecio() {
		return (this.getPrecio() - this.descuentoCalculado());
	}
	
}
