package entities;

public class MainAluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	double mediaFinal;

	public double CalcMediaFinal() {
		return nota1 + nota2 + nota3;
	}
	
 public void resultFinal() {
	
	if (CalcMediaFinal() >= 60.0) {
	 System.out.println("FINAL GRADE = " + CalcMediaFinal());
	 System.out.println("PASS");
	 
 }else {
	 System.out.println("FINAL GRADE = " + CalcMediaFinal());
	 System.out.println("FAILED");
	 System.out.println("MISSING :" + (60 - CalcMediaFinal()));
	 
 }
	
}

}