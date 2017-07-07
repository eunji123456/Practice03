package com.javaex.problem07;

public class Account {

    private String accountNo;//계좌 
    private int balance;//잔고 
   

	public Account(String accountNo) {
		this.accountNo=accountNo;
		System.out.println(accountNo+" 계좌가 개설 되었습니다");
	}


	public void deposit(int money) {
		balance=balance+money;
		
	}


	public void withdraw(int money) {
		balance=balance-money;
		
	}


	public void showBalance() {
		System.out.println(" "+balance);
		
	}
    
    //생성자 작성
    
    //필요한 메소드 작성

}
