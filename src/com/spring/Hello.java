package com.spring;

public class Hello {
private A aobj;
private B bobj;

public void setAobj(A aobj) {
	System.out.println("Hello-setAobj");
	this.aobj = aobj;
}

public Hello() {
	System.out.println("DC in Hello");
}

public Hello(B bobj) {
	System.out.println("Hello 1-arg const");
	this.bobj = bobj;
}
public void show(){
System.out.println("show in Hello");
aobj.showA();
bobj.showB();
}
}
