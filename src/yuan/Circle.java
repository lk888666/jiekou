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

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public float area() {
		// TODO �Զ����ɵķ������
		return (float) (3.14 * r * r);
	}

	@Override
	public float perimeter() {
		// TODO �Զ����ɵķ������
		return (float) (2 * 3.14 * r);
	}

	@Override
	public void show() {
		System.out.println("Բ������=" + "[" + getX() + "," + getY() + "]" + "\t" + "�뾶=" + r);
		System.out.println("���= " + area() + "\t" + "�ܳ�= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}

	public String getName() {
		// TODO �Զ����ɵķ������
		return "Բ��";
	}

}
