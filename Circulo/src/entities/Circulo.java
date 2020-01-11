package entities;

public class Circulo {
	
	public double raio;
	public double perimetro;
	public double diametro;


public double Area() {
	return Math.PI * Math.pow(raio, 2);
	
	
}

public double Perimetro() {
return 2 * (Math.PI * raio);
	
}

public double Diametro() {
	return 2 * raio;
		
}



}