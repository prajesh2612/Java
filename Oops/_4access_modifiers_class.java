package oops;
import javalabdemo.C3;//importing class C3 from package javalabdemo

class C1// this class is accessible within the this package(oops) only
{
	_4access_modifiers_class c2=new _4access_modifiers_class();/*class C2 or _4access_modifiers_class is accessible here, 
	                                                         since it is a public class within the same package (oops)*/
	
	C3 c3=new C3();//class C3 is accessible here, since it is a public class, although it is from a different package (javalabdemo)
	
	//class C4 isn't accessible, since it is a private class, although it is from the same package(oops)	
}


public class _4access_modifiers_class//let us assume this class to be class C2, this class is accessible everywhere (any class or package)
{
	C1 c1=new C1();//class C1 is accessible from here since it is a default class and belongs to the same package
	
	C3 c3=new C3();//class C3 is accessible here, since it is a public class, although it is from a different package (javalabdemo)
	
	//class C4 isn't accessible, since it is a private class, although it is from the same package(oops)	
}


private class C4/*this class is not accessible to any other class or package. This kind(private) of class is only valid for inner/child/
                  derived classes*/
{
	C1 c1=new C1();//class C1 is accessible from here since it is a default class and belongs to the same package
	
	_4access_modifiers_class c2=new _4access_modifiers_class();/*class C2 or _4access_modifiers_class is accessible here, 
                                                                 since it is a public class within the same package (oops)*/
	
	C3 c3=new C3();//class C3 is accessible here, since it is a public class, although it is from a different package (javalabdemo)
}
