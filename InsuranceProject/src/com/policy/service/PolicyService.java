package com.policy.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.policy.bean.PolicyBean;
import com.policy.exception.PolicyException;

public interface PolicyService
{
	//public PolicyBean ViewPolicy(long policy_number) throws SQLException, ClassNotFoundException, IOException;
	public List<PolicyBean> retriveAll()throws PolicyException, ClassNotFoundException, SQLException, IOException;
}
