package juti;

import ju.Rectangle;

public class Cude extends Rectangle {
private float h;

public Cude(String name,float x, float y, float len, float wid, float h) {
	super(name,x, y, len, wid);
	this.h = h;
}

public Cude() {
	super();
	// TODO �Զ����ɵĹ��캯�����
}

public Cude(String name,float x, float y, float len, float wid) {
	super(name,x, y, len, wid);
	// TODO �Զ����ɵĹ��캯�����
}

public float getH() {
	return h;
}

public void setH(float h) {
	this.h = h;
}
public float area() {
	return (getLen() * h + getLen() * getWid() + getWid() * h) * 2;
}
public float perimeter() {
	return (getLen() + getWid() + h) * 4;
}
public String getName() {
	return "������";
}
public void show() {
	System.out.println("��������=" + "[" + getX() + "," + getY() + "]");
	System.out.println("length= " + getLen() + "\n" + "width= " + getWid() + "\n" + "height= " + h);
	System.out.println("���= " + area() + "\t" + "�ܳ�= " + perimeter());
	System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
}
}
