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
			System.out.println("请输入圆的坐标和半径");
			x = cin.nextFloat();
			y = cin.nextFloat();
			r = cin.nextFloat();
			a[p] = new Circle("圆形", x, y, r);
			sum += a[p].area();
			p++;
		}
		if (k == 2) {
			System.out.println("请输入矩形的坐标和长宽");
			x = cin.nextFloat();
			y = cin.nextFloat();
			len = cin.nextFloat();
			wid = cin.nextFloat();
			a[p] = new Rectangle("矩形", x, y, len, wid);
			sum += a[p].area();
			p++;
		}
		if (k == 3) {
			System.out.println("请输入长方体的坐标，长宽高");
			x = cin.nextFloat();
			y = cin.nextFloat();
			len = cin.nextFloat();
			wid = cin.nextFloat();
			h = cin.nextFloat();
			a[p] = new Cude("长方体", x, y, len, wid, h);
			sum += a[p].area();
			p++;
		}
		if (k == 4) {
			System.out.println("请输入圆柱体的坐标半径高");
			x = cin.nextFloat();
			y = cin.nextFloat();
			r = cin.nextFloat();
			h = cin.nextFloat();
			a[p] = new Clinder("圆柱体", x, y, r, h);
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
			System.out.println("总面积是:    " + sum);
		}

	}
}
