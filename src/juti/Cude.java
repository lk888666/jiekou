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
	// TODO 自动生成的构造函数存根
}

public Cude(String name,float x, float y, float len, float wid) {
	super(name,x, y, len, wid);
	// TODO 自动生成的构造函数存根
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
	return "长方体";
}
public void show() {
	System.out.println("矩形坐标=" + "[" + getX() + "," + getY() + "]");
	System.out.println("length= " + getLen() + "\n" + "width= " + getWid() + "\n" + "height= " + h);
	System.out.println("面积= " + area() + "\t" + "周长= " + perimeter());
	System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
}
}
