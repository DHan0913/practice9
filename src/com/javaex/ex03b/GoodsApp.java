package com.javaex.ex03b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		List<Goods> goodsList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int countOfGoods = 0;
		System.out.println("상품을 입력해주세요(종료 q)");
		
		while (true) {
			System.out.println("상품을 입력해주세요(종료 q)");
			String line = scanner.nextLine();
			if (line.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("==========");
				break;
			}
			String[] data = line.split(",");
			String name = data[0].trim();
			String price = data[1].trim();
			int count = Integer.parseInt(data[2].trim());

			Goods goods = new Goods(name, price, count);
			goodsList.add(goods);
		}
		scanner.close();
		
		Iterator<Goods> it = goodsList.iterator(); // 반복자 추출

		while (it.hasNext()) {
			Goods item = it.next();
			System.out.println(item);
		}

		Iterator<Goods> s = goodsList.iterator(); // 반복자 추출

		while (s.hasNext()) {
			Goods item = s.next();
			countOfGoods += item.getCount();
		}
		
		// 모든 사각형의 합 출력
		System.out.println("모든 상품의 갯수는 " + countOfGoods + " 입니다.");

	}
	
	
}
