package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class FriendApp {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        ArrayList<Friend> friendList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("친구 정보를 입력하세요.");

            System.out.print("이름: ");
            String name = scanner.nextLine();
            
            System.out.print("핸드폰: ");
            String hp = scanner.nextLine();

            System.out.print("학교: ");
            String school = scanner.nextLine();
           
            Friend friend = new Friend(name, hp, school);
            friendList.add(friend);
        }
        System.out.println("입력된 친구 정보:");
//        for (Friend friend : friendList) {
//            System.out.println(friend);
//            }
        Iterator<Friend> it = friendList.iterator(); // 반복자 추출

		while (it.hasNext()) { 
			Friend item = it.next(); 
			System.out.println(item);
		}
        
		scanner.close();
        
        
    }

}
