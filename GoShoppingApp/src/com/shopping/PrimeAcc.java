package com.shopping;

public abstract class PrimeAcc extends ShopAcc {
 private final boolean isPrime;
 protected static final float DELIVERY_CHARGES = 0.0f;

 public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
     super(accNo, accNm, charges);
     this.isPrime = isPrime;
 }

 public boolean isPrime() {
     return isPrime;
 }

 @Override
 public abstract void bookProduct(float price);

 @Override
 public String toString() {
     return "PrimeAcc [accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
             + ", isPrime=" + isPrime + "]";
 }
}
