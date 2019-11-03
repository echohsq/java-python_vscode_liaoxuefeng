
public class SalaryIncome implements Income{

	// TODO
	protected double income;
	public SalaryIncome(double income){
		this.income = income;
	}
	public double getTax(){
		if(income <= 5000){
			return 0;
		}else{
			return (income - 5000) * 0.2;
		}
	}
}
