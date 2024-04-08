package com.javaex.ex02a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class FriendApp {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        List<Friend> friendList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("친구를 3명 등록해주세요.");
            String line = scanner.nextLine();
            String[] data = line.split(" ");
           
            Friend friend = new Friend(data [0], data [1], data [2]);
            friendList.add(friend);
        }
        System.out.println("입력된 친구 정보:");
//        for (Friend friend : friendList) {
//            System.out.println(friend);
//            }
        Iterator<Friend> it = friendList.iterator(); // 반복자 추출

		while (it.hasNext()) { 
			Friend item = it.next(); 
			item.showInfo();
		}
        
        
        
        
    }

}
