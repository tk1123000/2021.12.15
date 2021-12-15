package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.println("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료");
			int a = sc.nextInt();
			if (a == 1) {
				// 전화번호부(addressList) 에 값을 추가시키고싶음

				// 이름, 나이 ,전화번호를 입력받아서 -> 객체로만들어서
				// addressList 추가 시키면됨!
				System.out.print("이름 : ");
				String listName = sc.next();
				System.out.print("나이 : ");
				int listage = sc.nextInt();
				System.out.print("전화번호 : ");
				String listNumber = sc.next();

				Address adr = new Address(listName, listage, listNumber);
				addressList.add(adr);

			} else if (a == 2) {
				if (addressList.size() == 0) {
					System.out.println("입력값이 없습니다.");
					for (int i = 0; i < addressList.size(); i++) {
						System.out.println("이름 : " + addressList.get(i).getName());
						System.out.println("나이 : " + addressList.get(i).getAge());
						System.out.println("전화번호 : " + addressList.get(i).getPhoneNumber());
					}
				}

			} else if (a == 3) {
				if (addressList.size() == 0) {
					System.out.println("삭제할 연락처가 없습니다.");
					for (int i = 0; i < addressList.size(); i++) {
						System.out.println((i + 1) + ". ");
						System.out.println("이름 : " + addressList.get(i).getName());
						System.out.println("나이 : " + addressList.get(i).getAge());
						System.out.println("전화번호 : " + addressList.get(i).getPhoneNumber());

						System.out.print("삭제할 번호 : ");
						int delet = sc.nextInt();
						addressList.remove(delet - 1);
					}
				}
			} else if (a == 4) {
				System.out.print("검색할 이름 입력 : ");
				String namegg = sc.next();
				int cnt = 0;
				for (int i = 0; i < addressList.size(); i++) {
					if (namegg.equals(addressList.get(i).getName())) {
						System.out.println("이름 : " + addressList.get(i).getName());
						System.out.println("나이 : " + addressList.get(i).getAge());
						System.out.println("전화번호 : " + addressList.get(i).getPhoneNumber());
						cnt++;
					}

				}
				if (cnt == 0) {
					System.out.println("검색할 이름이 없습니다.");
				}
			} else if (a == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}