package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.println("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]����");
			int a = sc.nextInt();
			if (a == 1) {
				// ��ȭ��ȣ��(addressList) �� ���� �߰���Ű�����

				// �̸�, ���� ,��ȭ��ȣ�� �Է¹޾Ƽ� -> ��ü�θ���
				// addressList �߰� ��Ű���!
				System.out.print("�̸� : ");
				String listName = sc.next();
				System.out.print("���� : ");
				int listage = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String listNumber = sc.next();

				Address adr = new Address(listName, listage, listNumber);
				addressList.add(adr);

			} else if (a == 2) {
				if (addressList.size() == 0) {
					System.out.println("�Է°��� �����ϴ�.");
					for (int i = 0; i < addressList.size(); i++) {
						System.out.println("�̸� : " + addressList.get(i).getName());
						System.out.println("���� : " + addressList.get(i).getAge());
						System.out.println("��ȭ��ȣ : " + addressList.get(i).getPhoneNumber());
					}
				}

			} else if (a == 3) {
				if (addressList.size() == 0) {
					System.out.println("������ ����ó�� �����ϴ�.");
					for (int i = 0; i < addressList.size(); i++) {
						System.out.println((i + 1) + ". ");
						System.out.println("�̸� : " + addressList.get(i).getName());
						System.out.println("���� : " + addressList.get(i).getAge());
						System.out.println("��ȭ��ȣ : " + addressList.get(i).getPhoneNumber());

						System.out.print("������ ��ȣ : ");
						int delet = sc.nextInt();
						addressList.remove(delet - 1);
					}
				}
			} else if (a == 4) {
				System.out.print("�˻��� �̸� �Է� : ");
				String namegg = sc.next();
				int cnt = 0;
				for (int i = 0; i < addressList.size(); i++) {
					if (namegg.equals(addressList.get(i).getName())) {
						System.out.println("�̸� : " + addressList.get(i).getName());
						System.out.println("���� : " + addressList.get(i).getAge());
						System.out.println("��ȭ��ȣ : " + addressList.get(i).getPhoneNumber());
						cnt++;
					}

				}
				if (cnt == 0) {
					System.out.println("�˻��� �̸��� �����ϴ�.");
				}
			} else if (a == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}
	}
}