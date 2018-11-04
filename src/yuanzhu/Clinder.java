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
		// TODO �Զ����ɵĹ��캯�����
	}

	public Clinder(String name,float x, float y, float r) {
		super(name, x, y, r);
		// TODO �Զ����ɵĹ��캯�����
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
		String t = "Բ����";
		return t;
	}

	public void show() {
		System.out.println("Բ������=" + "[" + getX() + "," + getY() + "]" + "\t" + "�뾶= " + getR());
		System.out.println("���= " + area() + "\t" + "�ܳ�= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");

	}
}
