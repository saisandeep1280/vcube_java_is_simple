package com.miniproblem;

public class PersonalLoan extends Loan{

	public static void main(String[] args) {
		PersonalLoan p = new PersonalLoan();
		boolean isValidMobile = p.moblieNumber();
		boolean isValidAadhar =p.aadharNumber();
		boolean isVAlidPan =p.panNumber();
		if(isValidMobile && isValidAadhar && isVAlidPan) {
			String name =p.name();
			System.out.println("Wlecome To The Personal Lone mr/mrs : "+ name );
			int  age = p.age();
			double salary =p.salary();
			int cibilInfo =p.cibilInfo();
			double cibil = p.cibilScore();
			if(salary>=150000 &&( age>=20 && age<=45 )&& (cibilInfo>=300 && cibilInfo<=900)) {
				System.out.println("Congratualtions !! Your Eligible For Personal Lone !!");
				System.out.println("Your Rate Of Interest IS "+cibil);
			}else {
				System.out.println("Your Are Not Eligible For Loan");
			}
			
		}else {
			System.out.println("inavalid details");
		}
	}

}
