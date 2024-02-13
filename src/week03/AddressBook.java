package week03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public List<Contact> contacts = new ArrayList<>();

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                if (contact instanceof BusinessContact) {
                    System.out.println("이름: " + contact.getName() +
                            ", 전화번호: " + contact.getPhoneNumber() +
                            ", 회사명: " + ((BusinessContact) contact).getCompany());
                } else if (contact instanceof PersonalContact) {
                    System.out.println("이름: " + contact.getName() +
                            ", 전화번호: " + contact.getPhoneNumber() +
                            ", 관계: " + ((PersonalContact) contact).getRelationship());
                }
            }
        }
    }

    void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().contains(name)) {
                if (contact instanceof BusinessContact) {
                    System.out.println("이름: " + contact.getName() +
                            ", 전화번호: " + contact.getPhoneNumber() +
                            ", 회사명: " + ((BusinessContact) contact).getCompany());
                } else if (contact instanceof PersonalContact) {
                    System.out.println("이름: " + contact.getName() +
                            ", 전화번호: " + contact.getPhoneNumber() +
                            ", 관계: " + ((PersonalContact) contact).getRelationship());
                }
            } else {
                System.out.println("연락처를 찾을 수 없습니다.");
            }
        }
    }
}
