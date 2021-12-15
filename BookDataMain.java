package Exam01;

import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
             
		BookData book1 = new BookData("자바",10000,"병관");
		BookData book2 = new BookData("DataBase",20000,"동원");
		BookData book3 = new BookData("Wed",30000,"승환");
		
		Scanner sc = new Scanner(System.in);
		BookData[] bookList = new BookData[3];
		
		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;
		// 입력받은 금액보다 적은 금액을
		// 가지고 있는 책에 대한 정보를 출력 시켜 주세요
		System.out.print("금액을 입력해 주세요 >> ");
		int inputMoney = sc.nextInt();
		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < bookList.length; i++) {
			if(bookList[i].getpice() <= inputMoney) {
				System.out.println("책 제목 : " + bookList[i].getTitle());
				System.out.println("책 가격 : " + bookList[i].getpice());
				System.out.println("책 저자 : " + bookList[i].getwriter());
				System.out.println("============================");
			}
		}
	
		
		
		
		
		
		
		
		
//		for (int i = 0; i < bookList.length; i++) {
//			
//			System.out.print("책 제목을 입력해주세요 >> ");
//			String title = sc.next();
//			System.out.print("가격을 입력해주세요 >> ");
//			int price = sc.nextInt();
//			System.out.print("저자를 입력해주세요 >> ");
//			String writer = sc.next();
//		    BookData book = new BookData(title,price,writer);
//		    
//			bookList[i]=book;
//		}
		
		
		//bookList 사용해서 책 이름으 전부 출력해주세요
		
		// private은 같은 클래쓰 내에서만
		//private으로 감추어 놨기 때문에 오류 발생!
		//book1.title = "짜파게티";
		
//		//private 으로 감춰어진 정보를 접근 하는 방법!!
//		System.out.println("책 제목 : " + book1.getTitle());
//		System.out.println("책 가격 : " + book1.getpice());
//		System.out.println("책 저자 : " + book1.getwriter());
//		for (int i = 0; i < bookList.length; i++) {
//			System.out.println("책 제목 : " + bookList[i].getTitle());
//			System.out.println("책 가격 : " + bookList[i].getpice());
//			System.out.println("책 저자 : " + bookList[i].getwriter());
//			System.out.println("============================");
//		}
		
		
		
		
	}

}
