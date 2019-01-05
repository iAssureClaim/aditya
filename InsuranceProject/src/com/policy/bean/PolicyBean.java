package com.policy.bean;

public class PolicyBean
{
	private long policy_number;
	private double policy_premium;
	private long account_number;
	
	public long getPolicy_number() {
		return policy_number;
	}
	public void setPolicy_number(long policy_number) {
		this.policy_number = policy_number;
	}
	public double getPolicy_premium() {
		return policy_premium;
	}
	public void setPolicy_premium(double policy_premium) {
		this.policy_premium = policy_premium;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	
	/*@Override
	public String toString() {
		return "PolicyBean [policy_number=" + policy_number + ", policy_premium=" + policy_premium + ", account_number="
				+ account_number + "]";
	}*/
		
}
