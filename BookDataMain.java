package Exam01;

import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
             
		BookData book1 = new BookData("�ڹ�",10000,"����");
		BookData book2 = new BookData("DataBase",20000,"����");
		BookData book3 = new BookData("Wed",30000,"��ȯ");
		
		Scanner sc = new Scanner(System.in);
		BookData[] bookList = new BookData[3];
		
		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;
		// �Է¹��� �ݾ׺��� ���� �ݾ���
		// ������ �ִ� å�� ���� ������ ��� ���� �ּ���
		System.out.print("�ݾ��� �Է��� �ּ��� >> ");
		int inputMoney = sc.nextInt();
		System.out.println("���� ������ å ���");
		for (int i = 0; i < bookList.length; i++) {
			if(bookList[i].getpice() <= inputMoney) {
				System.out.println("å ���� : " + bookList[i].getTitle());
				System.out.println("å ���� : " + bookList[i].getpice());
				System.out.println("å ���� : " + bookList[i].getwriter());
				System.out.println("============================");
			}
		}
	
		
		
		
		
		
		
		
		
//		for (int i = 0; i < bookList.length; i++) {
//			
//			System.out.print("å ������ �Է����ּ��� >> ");
//			String title = sc.next();
//			System.out.print("������ �Է����ּ��� >> ");
//			int price = sc.nextInt();
//			System.out.print("���ڸ� �Է����ּ��� >> ");
//			String writer = sc.next();
//		    BookData book = new BookData(title,price,writer);
//		    
//			bookList[i]=book;
//		}
		
		
		//bookList ����ؼ� å �̸��� ���� ������ּ���
		
		// private�� ���� Ŭ���� ��������
		//private���� ���߾� ���� ������ ���� �߻�!
		//book1.title = "¥�İ�Ƽ";
		
//		//private ���� ������� ������ ���� �ϴ� ���!!
//		System.out.println("å ���� : " + book1.getTitle());
//		System.out.println("å ���� : " + book1.getpice());
//		System.out.println("å ���� : " + book1.getwriter());
//		for (int i = 0; i < bookList.length; i++) {
//			System.out.println("å ���� : " + bookList[i].getTitle());
//			System.out.println("å ���� : " + bookList[i].getpice());
//			System.out.println("å ���� : " + bookList[i].getwriter());
//			System.out.println("============================");
//		}
		
		
		
		
	}

}
