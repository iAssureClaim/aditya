package com.policy.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.policy.bean.PolicyBean;
import com.policy.dao.IPolicyDao;
import com.policy.dao.PolicyDaoImpl;
import com.policy.exception.PolicyException;

public class PolicyServiceImpl implements PolicyService
{

	IPolicyDao ipolicyDao = new PolicyDaoImpl();
	
	/*@Override
	public PolicyBean ViewPolicy(long policy_number) throws SQLException, ClassNotFoundException, IOException 
	{
		
		PolicyBean policyBean = ipolicyDao.ViewPolicy(policy_number);
		return policyBean;
	}*/

	@Override
	public List<PolicyBean> retriveAll() throws PolicyException, ClassNotFoundException, SQLException, IOException {
		List<PolicyBean> list = new ArrayList<>();
		list=ipolicyDao.retriveAll();
		return list;
	}

}
