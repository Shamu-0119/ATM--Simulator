package atm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmImpl implements AtmInterface{
	
	Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();
	
	
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: "+atm.getBalance());
	}

	
	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("Collect Your Cash: "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.put(withdrawAmount,"Amount Withdrawn");
				viewBalance();
			}
			else {
				System.out.println("Insufficient Balance!");
			}
		}
		else {
			System.out.println("Enter the amount in terms of 500");
		}
		
	}

	
	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Deposited Amount is:"+depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		ministmt.put(depositAmount, "Deposited Successfully");
		viewBalance();
		
	}

	
	@Override
	public void viewMiniStatement() {
		Set<Double> set=ministmt.keySet();
		for(double d:set) {
			System.out.println(d+" - "+ministmt.get(d));
		}
	}

}
