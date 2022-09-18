package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean precioCuidado = false;
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.precioCuidado;
	}
	
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void aumentarPrecio(double n) {
		this.setPrecio((this.getPrecio() + n));
	}
}
