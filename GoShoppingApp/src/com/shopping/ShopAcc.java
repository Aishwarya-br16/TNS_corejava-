package com.shopping;
public abstract class ShopAcc {
 private final int accNo;     
 private String accNm;       
 private final float charges; 

 public ShopAcc(int accNo, String accNm, float charges) {
     this.accNo = accNo;
     this.accNm = accNm;
     this.charges = charges;
 }

 public int getAccNo() {
     return accNo;
 }

 public String getAccNm() {
     return accNm;
 }

 public void setAccNm(String accNm) {
     this.accNm = accNm;
 }

 public float getCharges() {
     return charges;
 }

 public abstract void bookProduct(float price);

 public void items(float price) {
     System.out.println("Item price: " + price);
 }

 @Override
 public String toString() {
     return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
 }
}

