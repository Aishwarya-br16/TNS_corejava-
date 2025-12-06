package com.shopping;

public class Main {
 public static void main(String[] args) {
     ShopFactory factory = new GSShopFactory();

     PrimeAcc prime = factory.getNewPrimeAccount(101, "Aishwarya Prime", 20.0f, true);

     NormalAcc normal = factory.getNewNormalAccount(201, "Swapnil Normal", 10.0f, 40.0f);

     System.out.println("---- Prime Account Booking ----");
     prime.bookProduct(1000.0f);
     System.out.println();
     System.out.println("---- Normal Account Booking ----");
     normal.bookProduct(1000.0f);
     System.out.println();

     System.out.println("Prime toString: " + prime.toString());
     System.out.println("Normal toString: " + normal.toString());
 }
}
