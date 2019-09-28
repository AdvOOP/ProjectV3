package b6070236_b6070212_b6074425;

public class calculate2 {
	
	private double total, pay;

	public void calTotal(double finace,double inter) {
		total = finace + inter;
//		System.out.println(interest+"     intersss ");
//		System.out.println(finace +"     finance ");
//		System.out.println(total+"     T ");
	}
	
	public void calInstallment(double month) {
		pay = total / month;
//		System.out.println(pay+"     pay ");
//		System.out.println(total+"     total ");
//		System.out.println(month+"    month ");
	}

	public double getInstallment(){
		return pay;
	}
	
	public double getTotal(){
		return total;
	}
}
