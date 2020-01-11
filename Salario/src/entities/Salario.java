package entities;

public class Salario {
	
	public String name;
	public double GrossSalary;
	public double tax = 1000.00;
	
	public double netSalary() {
		return GrossSalary - tax;
				
	}
	
	public void IncreaseSalary(double percentage) {
		this.GrossSalary += (this.GrossSalary*percentage) /100;
	}
	

}
