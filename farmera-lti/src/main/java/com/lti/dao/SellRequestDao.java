package com.lti.dao;

import java.util.List;

import com.lti.entity.SellRequest;

public interface SellRequestDao {

	List<SellRequest> fetchSellRequestsByFarmer(String email);

}