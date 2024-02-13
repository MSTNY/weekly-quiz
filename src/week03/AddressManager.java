package week03;

import java.util.Scanner;

public class AddressManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            int menuNumber = scanner.nextInt();
            scanner.nextLine();

            switch (menuNumber) {
                case 1:
                    BusinessContact businessContact = new BusinessContact();

                    System.out.print("이름을 입력하세요: ");
                    businessContact.setName(scanner.nextLine());

                    System.out.print("전화번호를 입력하세요: ");
                    businessContact.setPhoneNumber(scanner.nextLine());

                    System.out.println("회사명을 입력하세요: ");
                    businessContact.setCompany(scanner.nextLine());

                    addressBook.contacts.add(businessContact);
                    break;

                case 2:
                    PersonalContact personalContact = new PersonalContact();

                    System.out.print("이름을 입력하세요: ");
                    personalContact.setName(scanner.nextLine());

                    System.out.print("전화번호를 입력하세요: ");
                    personalContact.setPhoneNumber(scanner.nextLine());

                    System.out.println("회사명을 입력하세요: ");
                    personalContact.setRelationship(scanner.nextLine());

                    addressBook.contacts.add(personalContact);
                    break;

                case 3:
                    addressBook.displayContacts();
                    break;

                case 4:
                    System.out.println("검색할 이름을 입력하세요: ");
                    addressBook.searchContact(scanner.nextLine());
                    break;

                case 5:
                    System.out.println("프로그램 종료...");
                    System.exit(0);

                default:
                    System.out.println("1 ~ 5번 중 선택해주세요.");
            }
        }
    }
}
