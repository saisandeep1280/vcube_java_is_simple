package com.miniproblem;

public class HouseLoan extends Loan {
	@Override
	double cibilScore() {
		System.out.print("Enter Your Cibil Score: ");
		double score = sc.nextDouble();
		String rating;
		String action;
		double insterstRate =8.3; 
		if (score >= 750 && score <= 900) {
			rating = "Excellent";
			action = "Instant Approval, Lowest Interest Rates, Pre-approved Offers.";
			return insterstRate = insterstRate-2.1;
		} else if (score >= 650 && score <= 749) {
			rating = "Good/Fair";
			action = "Standard Approval, Average Interest Rates, Mild Documentation.";
			return  insterstRate = insterstRate-1.3;
		} else if (score >= 550 && score <= 649) {
			rating = "Average/Poor";
			action = "Conditional Approval, High Interest Rates, Requires Collateral/Guarantor.";
			return  insterstRate = insterstRate+0.95;
		} else if (score >= 300 && score <= 549) {
			rating = "Critical/Poor";
			action = "High Risk of Rejection, Past Defaults Detected.";
			return  insterstRate = insterstRate+1.85;
		} else if (score == -1) {
			rating = "No History (NH/NA)";
			action = "New to Credit. Lenders will evaluate based on income/employment.";
			return insterstRate = insterstRate+2.75;
		} else {
			rating = "Invalid Score";
			action = "Please enter a value between 300 and 900, or -1.";
			
		}
		System.out.println("Interest Rate: " + insterstRate + "%");
		System.out.println("CIBIL Score: " + score);
		System.out.println("Category: " + rating);
		System.out.println("Lender Decision: " + action);
		return insterstRate;
	}
	public static void main(String[] args) {
		HouseLoan h = new HouseLoan();
		boolean isValidMobile = h.moblieNumber();
		boolean isValidAadhar =h.aadharNumber();
		boolean isVAlidPan =h.panNumber();
		if(isValidMobile && isValidAadhar && isVAlidPan) {
			String name =h.name();
			System.out.println("Wlecome To The House Lone mr/mrs : "+ name );
			int  age = h.age();
			double salary =h.salary();
			int cibilInfo =h.cibilInfo();
			double cibil = h.cibilScore();
			if(salary>=250000 &&( age>=25 && age<=50 )&& (cibilInfo>=300 && cibilInfo<=900)) {
				System.out.println("Congratualtions !! Your Eligible For House Lone !!");
				System.out.println("Your Rate Of Interest IS "+cibil);
			}else {
				System.out.println("Your Are Not Eligible For Loan");
			}
			
		}else {
			System.out.println("inavalid details");
		}
	}

}
