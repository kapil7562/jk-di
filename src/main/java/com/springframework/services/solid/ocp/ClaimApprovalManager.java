package com.springframework.services.solid.ocp;

public class ClaimApprovalManager {

	public void processClaim(IInsuranceSurveyor surveyor) {
		
		if(surveyor.isValidClaim()) {
			System.out.println("Claim Processed");
		}
	}
}
