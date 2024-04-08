package com.javaex.ex03a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		int sum = 0;
		String a = "";
		Scanner scanner = new Scanner(System.in);
		List<Goods> goodsList = new ArrayList<>();
		while (!a.equals("q")) {
			System.out.println("상품을 입력해주세요(종료 q)");
			String goodsLine = scanner.nextLine();
			a = goodsLine;
			if (a.equals("q")) {
				System.out.println("[입력완료]");
				break;
			}
			String[] data = goodsLine.split(",");

			Goods goods = new Goods(data[0], data[1], Integer.parseInt(data[2]));
			goodsList.add(goods);
		}
		scanner.close();
		System.out.println("==========");
		Iterator<Goods> it = goodsList.iterator(); // 반복자 추출

		while (it.hasNext()) {
			Goods item = it.next();
			System.out.println(item);
		}

		Iterator<Goods> s = goodsList.iterator(); // 반복자 추출

		while (s.hasNext()) {
			Goods item = s.next();
			sum += item.getCount();
		}
		// 모든 사각형의 합 출력
		System.out.println("모든 상품의 갯수는 " + sum + " 입니다.");

	}
}
