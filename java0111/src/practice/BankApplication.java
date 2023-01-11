package practice;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
			
			int selectNo = scan.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String accNo = scan.next();
		
		System.out.print("계좌주: ");
		String owner = scan.next();
		
		System.out.print("초기입금액: ");
		int balance = scan.nextInt();
		
		Account2 account = new Account2(accNo, owner, balance);
		
		for (int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	// 계좌목록보기
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) break;
			System.out.println(accountArray[i].getAccNo() + "\t" +
					accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
	
	// 예금하기
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String accNo = scan.next();
		
		System.out.print("예금액: ");
		int balance = scan.nextInt();
		
		Account2 account = findAccount(accNo);
		
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() + balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	
	
	
	
}


