package yunxing;

import java.util.*;

import main.Main;

public class Run {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x = 1;
		int choose;
		Main a = new Main();
		System.out.println("***ͼ�������Ĺ���***");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("1,����һ��Բ");
		System.out.println("2,����һ������");
		System.out.println("3,����һ��������");
		System.out.println("4,����һ��Բ����");
		System.out.println("5,��ʾ�Ѿ�������ͼ��");
		System.out.println("6,���ͼ��֮��");
		System.out.println("7,�˳�ϵͳ");
		while (true) {
			if (x == 0)
				System.out.println("��������һ��");
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
