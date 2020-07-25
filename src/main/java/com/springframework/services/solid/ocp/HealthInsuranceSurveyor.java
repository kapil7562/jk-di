package com.springframework.services.solid.ocp;

public class HealthInsuranceSurveyor implements IInsuranceSurveyor{

	@Override
	public boolean isValidClaim() {
		return true;
	}

}
