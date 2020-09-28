package com.lti.dao;

import java.util.List;

import com.lti.entity.BiddingRequest;

public interface BiddingRequestDao {

	List<BiddingRequest> fetchBiddingRequestsForFarmerSellRequest(String email);

	List<BiddingRequest> fetchBiddingRequestByBidder(String email);

}