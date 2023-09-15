package org.example;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void desPositing(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Tien gui vao la :" + depositAmount +"\r");
        System.out.println("So du hien tai :"+accountBalance+ "\r");
    }
    public void withDraw (double withdrawAmount){
        if(accountBalance - withdrawAmount < 0){
            System.out.println("So du hien tai khong du de rut so tien :"+withdrawAmount + "\r");
            System.out.println("So du hien tai :"+accountBalance+ "\r");
        }
        else {
            System.out.println("So tien ban rut la:" + withdrawAmount+ "\r");
            System.out.println("So du hien tai :"+accountBalance+ "\r");
        }
    }


}
