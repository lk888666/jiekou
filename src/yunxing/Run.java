package yunxing;

import java.util.*;

import main.Main;

public class Run {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x = 1;
		int choose;
		Main a = new Main();
		System.out.println("***图形类对象的管理***");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("1,创建一个圆");
		System.out.println("2,创建一个矩形");
		System.out.println("3,创建一个长方体");
		System.out.println("4,创建一个圆柱体");
		System.out.println("5,显示已经创建的图形");
		System.out.println("6,求各图形之和");
		System.out.println("7,退出系统");
		while (true) {
			if (x == 0)
				System.out.println("请输入下一个");
			x = 0;
			choose = cin.nextInt();
			if (choose == 7)
				break;
			if (choose == 1)
				a.main(1);
			if (choose == 2)
				a.main(2);
			if (choose == 3)
				a.main(3);
			if (choose == 4)
				a.main(4);
			if (choose == 5)
				a.main(5);
			if (choose == 6)
				a.main(6);
		}
	}
}
