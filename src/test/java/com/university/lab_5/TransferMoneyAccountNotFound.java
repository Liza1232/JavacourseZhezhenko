package com.university.lab_5;

public class TransferMoneyAccountNotFound {
    public static void main(String args[]){
        Bank bank = new Bank();

        BankAccount account1 = bank.createAccount(72831803,"Dan Johnson", 350.0);
        BankAccount account2 = bank.createAccount(19238473, "Diana Taylor", 720.0);

        System.out.println(account1.getAccountSummary());
        System.out.println(account2.getAccountSummary());

        try{
            bank.transferMoney(account1.getAccountNumber(), 23942029, 300.0);
        } catch(AccountNotFoundException e){
            System.out.println(e.getMessage());
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        } catch(NegativeAmountException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation completed/failed");
        }

        System.out.println(account1.getAccountSummary());
        System.out.println(account2.getAccountSummary());
    }
}
