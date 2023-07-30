
package com.mycompany.practical5q1;

public class Practical5q1 
{
        public static void main(String[] args) 
         {
       SavingAccount savingAcc=new SavingAccount();
       savingAcc.setAccNo(20);
       savingAcc.setBalance(20000000);
       System.out.println("Account No: "+savingAcc.getAccNo());
       savingAcc.calculateInterest();
       
       CheckingAccount checkingAcc=new CheckingAccount();
       checkingAcc.setBalnce(1000000);
       checkingAcc.calculateInterest();
        }
}
