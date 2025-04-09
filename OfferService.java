package com.zomato.offerapi.service;

import com.zomato.offerapi.model.OfferRequest;
import com.zomato.offerapi.model.OfferResponse;
import org.springframework.stereotype.Service;
@Service
public class OfferService {
public OfferResponse applyOffer(OfferRequest request) {
double finalAmount = request.getTotalAmount();
double offerValue = 0;
if ("p1".equals(request.getSegment())) {
// Flat x amount off
offerValue = 10; // Flat Rs. 10 off
finalAmount -= offerValue;
} else if ("p2".equals(request.getSegment())) {
// Flat x% off
offerValue = 10; // 10% off
finalAmount -= (finalAmount * (offerValue / 100));
} else if ("p3".equals(request.getSegment())) {
// Flat Rs. 15 off (example)
offerValue = 15;
finalAmount -= offerValue;
}
// Ensure the final amount doesn't go below 0
finalAmount = Math.max(finalAmount, 0);
return new OfferResponse(request.getTotalAmount(), finalAmount, offerValue);
}
}
