package com.policy.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.policy.bean.PolicyBean;
import com.policy.exception.PolicyException;
import com.policy.util.DbConnection;

public class PolicyDaoImpl implements IPolicyDao
{

	int i = 0;
	/*@Override
	public PolicyBean ViewPolicy(long policy_number) throws SQLException, ClassNotFoundException, IOException
	{
		Connection connection = DbConnection.getConnection();
		PolicyBean policyBean = new PolicyBean();
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		preparedStatement = connection.prepareStatement(QueryMapper.EXECUTE_QUERY);
		preparedStatement.setLong(1, policy_number);
		resultSet = preparedStatement.executeQuery();
		
		try
		{
			while(resultSet.next())
			{
				policyBean.setPolicy_number(resultSet.getLong(1));
				policyBean.setPolicy_premium(resultSet.getDouble(2));
				policyBean.setAccount_number(resultSet.getLong(3));
			}
		}catch (Exception e)
		{
			// TODO: handle exception
		}
		
		return policyBean;
	}*/

	@Override
	public List<PolicyBean> retriveAll() throws PolicyException, ClassNotFoundException, SQLException, IOException
	{
		
		Connection connection = DbConnection.getConnection();
		Statement statement=connection.createStatement();
		PolicyBean policyBean = new PolicyBean();
		
		List<PolicyBean> list=null;
		ResultSet resultSet=null;
		
		resultSet=statement.executeQuery(QueryMapper.EXECUTE_QUERY);
		
		list=new ArrayList<>();
		
		System.out.println("S.no	Policy_Number		Policy_Premium		Account_number");
		while(resultSet.next())
		{
			
			policyBean.setPolicy_number(resultSet.getLong(1));
			policyBean.setPolicy_premium(resultSet.getDouble(2));
			policyBean.setAccount_number(resultSet.getLong(3));
			
			System.out.println(++i+"."+"		"+policyBean.getPolicy_number()+"			"+policyBean.getPolicy_premium()+"			"+policyBean.getAccount_number());
			
			list.add(policyBean);
		}
		
		return list;
	}

}
