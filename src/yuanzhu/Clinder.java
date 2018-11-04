package yuanzhu;

import yuan.Circle;

public class Clinder extends Circle {
	private float h;

	public Clinder(String name,float x, float y, float r, float h) {
		super(name,x, y, r);
		this.h = h;
	}

	public Clinder() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Clinder(String name,float x, float y, float r) {
		super(name, x, y, r);
		// TODO 自动生成的构造函数存根
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float area() {
		return (float) (2 * 3.14 * getR() * h + 3.14 * getR() * getR() * 2);
	}

	public float perimeter() {
		return (float) (2 * (2 * 3.14 * getR()) + 2 * h);
	}

	public String getName() {
		String t = "圆柱体";
		return t;
	}

	public void show() {
		System.out.println("圆心坐标=" + "[" + getX() + "," + getY() + "]" + "\t" + "半径= " + getR());
		System.out.println("面积= " + area() + "\t" + "周长= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");

	}
}
