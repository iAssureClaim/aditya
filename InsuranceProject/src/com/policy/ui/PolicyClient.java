package com.policy.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.policy.bean.PolicyBean;
import com.policy.exception.PolicyException;
import com.policy.service.PolicyService;
import com.policy.service.PolicyServiceImpl;

public class PolicyClient
{
	static Scanner scanner = new Scanner(System.in);
	static PolicyService policyService = null;
	static PolicyServiceImpl policyServiceImpl = null;
	
	public static void main(String[] args) throws ClassNotFoundException, PolicyException, SQLException, IOException
	{
		PolicyBean policyBean = null;

		policyBean=new PolicyBean();
		policyServiceImpl=new PolicyServiceImpl();
		List<PolicyBean> list=null;
		list=policyServiceImpl.retriveAll();
		//System.out.println(list);
		
	}
	
}
