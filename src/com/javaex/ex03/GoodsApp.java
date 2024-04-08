package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.javaex.ex01.Rectangle;

public class GoodsApp {

	public static void main(String[] args) {

		int sum = 0;
		String a = "";
		Scanner scanner = new Scanner(System.in);
		ArrayList<Goods> goodsList = new ArrayList<>();
		while (!a.equals("q")) {
			System.out.println("상품을 입력해주세요(종료 q)");
			String goodsLine = scanner.nextLine();
			a = goodsLine;
			if (a.equals("q")) {
				System.out.println("[입력완료]");
				break;
			}
			String[] goods = goodsLine.split(",");
			String name = (goods[0]);
			String price = (goods[1]);
			int count = Integer.parseInt(goods[2]);

			Goods goodss = new Goods(name, price, count);
			goodsList.add(goodss);
		}
		System.out.println("==========");
		for (Goods goodss : goodsList) {
			System.out.println(goodss);
		}

		for (Goods goodss : goodsList) {
			sum += goodss.getCount();

		}
	
		// 모든 사각형의 합 출력
		System.out.println("모든 상품의 갯수는 " + sum + " 입니다.");

	}

}
