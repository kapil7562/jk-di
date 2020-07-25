package com.springframework.test.services.solid.ocp;

import org.junit.jupiter.api.Test;

import com.springframework.services.solid.ocp.ClaimApprovalManager;
import com.springframework.services.solid.ocp.HealthInsuranceSurveyor;
import com.springframework.services.solid.ocp.IInsuranceSurveyor;
import com.springframework.services.solid.ocp.VechicleInsuranceSurveyor;

public class ClaimApprovalManagerTest {
	
	@Test
	public void testProcessClaim() {
		IInsuranceSurveyor surveyor = new HealthInsuranceSurveyor();
		ClaimApprovalManager manager = new ClaimApprovalManager();
		
		manager.processClaim(surveyor);
		
		surveyor = new VechicleInsuranceSurveyor();
		
		manager.processClaim(surveyor);
	}

}
