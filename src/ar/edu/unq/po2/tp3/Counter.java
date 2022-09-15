package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> counter = new ArrayList<Integer>(); 
	
	public void addNumber(int n) {
		this.counter.add(n);
	}
	
	public boolean esNumeroPar(int n) {
		return (n%2 == 0);
	}
	
	public int getPares() {
		int pares = 0;
		
		for(int i=0;i<counter.size();i++) {
			if(this.esNumeroPar(counter.get(i))) {
				pares++; 
			}
		}
		
		return pares;
	}
	
	public int getImpares() {
		int impares = 0;
			
		for(int i=0;i<counter.size();i++) {
			if(!this.esNumeroPar(counter.get(i))) {
				impares++; 
			}
		}
		
		return impares;
	}
	
	public int cantidadDeMultiplosDe(int n) {
		int multiplos = 0;
		
		for(int i=0;i<counter.size();i++) {
			if(this.esMultiploDe(counter.get(i), n)) {
				multiplos++;
			}
		}
		return multiplos;
	}
	
	public boolean esMultiploDe(int n, int n1) {
		return (n % n1 == 0);
	}
}
