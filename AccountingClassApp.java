class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public void print() {
		// 공급가
		System.out.println("Value of supply : "+ valueOfSupply);

		// 부가가치
		System.out.println("VAT : "+ getVat() );
		
		// 공급가 + 부가가치 
		System.out.println("Total : "+ getTotal() );
		
		// 비용
		System.out.println("Expense : "+ getExpense() );
		
		// 순수이익
		System.out.println("Income : "+ getIncome() );
		
		// 배당
		System.out.println("Dividend 1 : "+ getDividend1() );
		System.out.println("Dividend 2 : "+ getDividend2() );
		System.out.println("Dividend 3 : "+ getDividend3() );
	}

	private double getDividend1() {
		return getIncome() * 0.5;
	}
	
	private double getDividend2() {
		return getIncome() * 0.3;
	}
	
	private double getDividend3() {
		return getIncome() * 0.2;
	}

	private double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVat();
	}

	private double getVat() {
		return valueOfSupply * vatRate;
	}
}
public class AccountingClassApp {
	
	public static void main(String[] args) {
		
		//instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 30000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
		
	}

}
