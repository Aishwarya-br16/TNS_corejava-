package com.shopping;

public abstract class NormalAcc extends ShopAcc {
 private final float deliveryCharges; 

 public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
     super(accNo, accNm, charges);
     this.deliveryCharges = deliveryCharges;
 }

 public float getDeliveryCharges() {
     return deliveryCharges;
 }

 @Override
 public abstract void bookProduct(float price);

 @Override
 public String toString() {
     return "NormalAcc [accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
             + ", deliveryCharges=" + deliveryCharges + "]";
 }
}
