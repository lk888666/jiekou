package main;

import java.util.*;
import jie.*;
import ju.*;
import juti.*;
import yuan.*;
import yuanzhu.*;

public class Main {
	float x, y, len, wid, r, h;
	float sum = 0;
	Shape[] a = new Shape[100];
	Scanner cin = new Scanner(System.in);
	int p = 0;

	public void main(int k) {
		if (k == 1) {
			System.out.println("������Բ������Ͱ뾶");
			x = cin.nextFloat();
			y = cin.nextFloat();
			r = cin.nextFloat();
			a[p] = new Circle("Բ��", x, y, r);
			sum += a[p].area();
			p++;
		}
		if (k == 2) {
			System.out.println("��������ε�����ͳ���");
			x = cin.nextFloat();
			y = cin.nextFloat();
			len = cin.nextFloat();
			wid = cin.nextFloat();
			a[p] = new Rectangle("����", x, y, len, wid);
			sum += a[p].area();
			p++;
		}
		if (k == 3) {
			System.out.println("�����볤��������꣬�����");
			x = cin.nextFloat();
			y = cin.nextFloat();
			len = cin.nextFloat();
			wid = cin.nextFloat();
			h = cin.nextFloat();
			a[p] = new Cude("������", x, y, len, wid, h);
			sum += a[p].area();
			p++;
		}
		if (k == 4) {
			System.out.println("������Բ���������뾶��");
			x = cin.nextFloat();
			y = cin.nextFloat();
			r = cin.nextFloat();
			h = cin.nextFloat();
			a[p] = new Clinder("Բ����", x, y, r, h);
			sum += a[p].area();
			p++;
		}
		if (k == 5) {
			for (int i = 0; i < p; i++) {
				System.out.println(a[i].getName());
				a[i].show();
			}
		}
		if (k == 6) {
			System.out.println("�������:    " + sum);
		}

	}
}
