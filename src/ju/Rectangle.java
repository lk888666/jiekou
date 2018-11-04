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
		// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵķ������
		return len * wid;
	}

	public float perimeter() {
		return 2 * (len + wid);
	}

	public String getName() {
		return "����";
	}

	public void show() {
		System.out.println("��������=" + "[" + getX() + "," + getY() + "]");
		System.out.println("length= " + len + "\n" + "width= " + wid);
		System.out.println("���= " + area() + "\t" + "�ܳ�= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}

}
