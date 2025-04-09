package com.zomato.offerapi.controller;
import com.zomato.offerapi.model.OfferResponse;
import com.zomato.offerapi.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class OfferController {
@Autowired
private OfferService offerService;
@PostMapping("/apply_offer")
public OfferResponse applyOffer(@RequestBody OfferRequest request) {
return offerService.applyOffer(request);
}
}
