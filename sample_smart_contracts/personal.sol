// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.7.0 <0.9.0;

contract PersonalInsurance {
	
	
	address payable customer = payable(0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2);
	
	address payable company = payable(0x5B38Da6a701c568545dCfcB03FcB875f56beddC4);			
				
	uint256 private paymentPeriod = 10 days;
	uint256 private premiumIncrease = 5;			
	uint256 private claimAmount = 30.0 ether;			
	uint256 private premiumAmount = 10.0 ether;			
	uint256 private lastPayment;
	uint256 public numClaims;			
	
	enum ContractState { ACTIVE, INACTIVE, BLOCKED }
	ContractState public contractState;
				
	constructor() {
	
	    numClaims = 0;
	    lastPayment = block.timestamp;
	    contractState = ContractState.INACTIVE;					
	
	}
	
	function pay() public payable {
	
	    if(lastPayment + paymentPeriod < block.timestamp) {
			contractState = ContractState.BLOCKED;
		}
		
		require(contractState != ContractState.BLOCKED, "The contract has been blocked due to late payment.");
	    require(msg.sender == customer, "Only the contract owner can pay");
	
	    require(msg.value == getPremium(), "Incorrect premium. Invoke the getPremium function to see the required amount");
	
	    company.transfer(msg.value);
	
	    contractState = ContractState.ACTIVE;
	
	    lastPayment = block.timestamp;				
	
	}
				
	function claim() public payable {
	
	    require(contractState == ContractState.ACTIVE, "Premium payment required. Only an active contract can be claimed");
	
	    require(msg.sender == company, "Claims can only be initiated by the insurer");
	
	    require(msg.value == claimAmount, "Incorrect claim. Invoke the getClaim function to see the required amount");
	
	    customer.transfer(claimAmount);
	
	    numClaims++;
	
	}
	
	function getPremium() public view returns (uint256 premium) {
		return ((premiumIncrease * numClaims)/100 + 1) * premiumAmount;
	}
	
	function getClaim() public view returns (uint256 the_claim) {
		return claimAmount;
	}
	
}
