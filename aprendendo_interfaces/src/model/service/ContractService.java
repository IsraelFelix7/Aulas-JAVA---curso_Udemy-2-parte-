package model.service;

import model.entities.Contract;

public class ContractService  {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int morths) {
		
		for(int i = 1; i <= morths ; i++) {
				
		}
		
		
	}
	
}
