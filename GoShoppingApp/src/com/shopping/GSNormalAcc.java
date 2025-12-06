package com.shopping;

public class GSNormalAcc extends NormalAcc {

 public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
     super(accNo, accNm, charges, deliveryCharges);
 }
 
 @Override
 public void bookProduct(float price) {
     float discount = getCharges(); // treated as small discount
     float delivery = getDeliveryCharges();
     float finalPrice = price - discount + delivery;
     if (finalPrice < 0) finalPrice = 0;
     System.out.println("Booking product for Normal account: " + getAccNm());
     System.out.println("Original price: " + price);
     System.out.println("Applying account discount (charges): " + discount);
     System.out.println("Adding delivery charges: " + delivery);
     System.out.println("Final price to pay: " + finalPrice);
 }

 @Override
 public String toString() {
     return "GSNormalAcc [accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
             + ", deliveryCharges=" + getDeliveryCharges() + "]";
 }
}
