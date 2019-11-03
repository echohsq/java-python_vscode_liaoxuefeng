
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new OtherIncome(3000), new SalaryIncome(7500), new RoyaltyIncome(12000) };
		
		// TODO:
		double total = 0;
		for (Income income : incomes){
			total += income.getTax();
		}


		System.out.println(total);
		System.out.println(totalTax(incomes));
	}
	//类方法，必须是静态方法（java是面向对象的）
	public static double totalTax(Income... incomes){
		double t = 0;
		for (Income income2 : incomes){
			t = t + income2.getTax();
		}
		return t;
	}
}
