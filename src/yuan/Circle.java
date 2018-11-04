package yuan;

import jie.Shape;

public class Circle implements Shape {
	private String name;
	private float x, y, r;

	public Circle(String name,float x, float y, float r) {
		super();
		this.name=name;
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public float area() {
		// TODO 自动生成的方法存根
		return (float) (3.14 * r * r);
	}

	@Override
	public float perimeter() {
		// TODO 自动生成的方法存根
		return (float) (2 * 3.14 * r);
	}

	@Override
	public void show() {
		System.out.println("圆心坐标=" + "[" + getX() + "," + getY() + "]" + "\t" + "半径=" + r);
		System.out.println("面积= " + area() + "\t" + "周长= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}

	public String getName() {
		// TODO 自动生成的方法存根
		return "圆形";
	}

}
