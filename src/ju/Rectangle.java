package ju;

import jie.Shape;

public class Rectangle implements Shape {
	private String name;
	private float x, y, len, wid;

	public Rectangle(String name, float x, float y, float len, float wid) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.len = len;
		this.wid = wid;
	}

	public Rectangle() {
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

	public float getLen() {
		return len;
	}

	public void setLen(float len) {
		this.len = len;
	}

	public float getWid() {
		return wid;
	}

	public void setWid(float wid) {
		this.wid = wid;
	}

	public float area() {
		// TODO 自动生成的方法存根
		return len * wid;
	}

	public float perimeter() {
		return 2 * (len + wid);
	}

	public String getName() {
		return "矩形";
	}

	public void show() {
		System.out.println("矩形坐标=" + "[" + getX() + "," + getY() + "]");
		System.out.println("length= " + len + "\n" + "width= " + wid);
		System.out.println("面积= " + area() + "\t" + "周长= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}

}
