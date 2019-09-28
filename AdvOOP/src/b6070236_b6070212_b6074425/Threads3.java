package b6070236_b6070212_b6074425;

public class Threads3 {
	public static double finance;
	public double month,pay,price,interest,totale;
	
	public void Thread(double pay,double price){
		this.pay = pay;
		this.price = price;
	}
	
	public void calStar(double price,double pay){
		finance = price - pay ;
		System.out.println(finance + "     finance ");
		System.out.println(pay+"     pay ");
		System.out.println(price+"     price ");
	}
	
	public double getFinance(){
		return finance;
	}
}
