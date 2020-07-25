package com.springframework.services.solid.ocp;

public class VechicleInsuranceSurveyor implements IInsuranceSurveyor{

	@Override
	public boolean isValidClaim() {
		return true;
	}

}
