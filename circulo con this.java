package ejercicio1;

public class circulo1 {
	
	public double pi;
	public int id, radio;
	
	
	
	public circulo1() {	
		this (174527); 
	}
	
	public circulo1 (int id) {
		this.id = id;
		pi = 3.1416; 
		
	}
	 
	public double calcularcircunferencia() 
	{
		return (2*pi)*id;
	}
	
	public void cambiavalor(int x) {
		x = id;
	}
	
	public double calculararea()
	{
		return pi*(id*id);
	}
	
	public circulo (int x) {
	this.id = x;
	
}

}
