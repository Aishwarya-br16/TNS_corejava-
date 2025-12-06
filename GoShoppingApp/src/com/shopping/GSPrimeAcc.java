package com.shopping;

public class GSPrimeAcc extends PrimeAcc {
 private static final float SPECIAL_CHARGES = 50.0f; // student's choice (example)

 public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
     super(accNo, accNm, charges, isPrime);
 }

 @Override
 public void bookProduct(float price) {
     float discount = getCharges();
     float finalPrice = price - discount;
     if (finalPrice < 0) finalPrice = 0;
     System.out.println("Booking product for Prime account: " + getAccNm());
     System.out.println("Original price: " + price);
     System.out.println("Applying account discount (charges): " + discount);
     System.out.println("Delivery charges: " + PrimeAcc.DELIVERY_CHARGES + " (Prime - free)");
     System.out.println("Final price to pay: " + finalPrice);
 }

 @Override
 public String toString() {
     return "GSPrimeAcc [accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
             + ", isPrime=true" + "]";
 }
}
