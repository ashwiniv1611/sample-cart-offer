package com.zomato.offerapi.model;
public class OfferResponse {
private double originalAmount;
private double finalAmount;
private double offerApplied;
public OfferResponse(double originalAmount, double finalAmount, double offerApplied) {
this.originalAmount = originalAmount;
this.finalAmount = finalAmount;
this.offerApplied = offerApplied;
}
// Getters and Setters
public double getOriginalAmount() {
return originalAmount;
}
public void setOriginalAmount(double originalAmount) {
this.originalAmount = originalAmount;
}
public double getFinalAmount() {
return finalAmount;
}
public void setFinalAmount(double finalAmount) {

this.finalAmount = finalAmount;
}
public double getOfferApplied() {
return offerApplied;
}
public void setOfferApplied(double offerApplied) {
this.offerApplied = offerApplied;
}
}
