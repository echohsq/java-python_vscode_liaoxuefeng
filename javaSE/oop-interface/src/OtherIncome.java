
/**
 * 其他收入税率是10%
 */
public class OtherIncome implements Income{
	// TODO
    protected double income;
    public OtherIncome(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        return income*0.1;
    }
}