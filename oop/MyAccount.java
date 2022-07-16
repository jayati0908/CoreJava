package in.co.rays.oop;

import in.co.rays.testingexceptions.Myexception;

public class MyAccount {
//	String accnum;
//	String acctype;
	double bal;

//	public String getAccnum() {
//		return accnum;
//	}

//	public void setAccnum(String accnum) {
//		this.accnum = accnum;
//	}

//	public String getAcctype() {
//		return acctype;
//	}
//
//	public void setAcctype(String acctype) {
//		this.acctype = acctype;
//	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

//	public void deposit(int d) {
//
//		double total = getBal() + d;
//
//		setBal(total);
//
//	} 
	public void withdrawl(int w) throws Myexception {
		
		if(getBal()>w) {
		double total = getBal()-w;
		setBal(total);
		}else {
			throw new Myexception("insufficient balance");
		}
	}

}
