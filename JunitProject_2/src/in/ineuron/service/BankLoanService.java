package in.ineuron.service;

public class BankLoanService {
	public float calculateSimpleInterest(float pAmount,float rate,float time) {
		System.out.println("BankLoanService.calculateSimpleInterest()");
		if (pAmount<=0 || rate<=0 || time<=0)
			throw new IllegalArgumentException("Invalid inputs");
		return (pAmount*rate*time)/100.0f;
	}	
}
