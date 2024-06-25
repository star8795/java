package b_field;

public class FieldExample {
	// main()이 포함되는 실행 가능한 class
	public static void main(String[] args) {
		Field f = new Field();
		int field = f.inField;
		double d = f.duobleField;
		boolean bool = f.boolFeild;
		String str = f.strField;
		
		System.out.println(field);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(str);
		
		Field f2 = new Field();
		f2.inField = 200;
		f2.duobleField = 3.141592;
		f2.boolFeild = true;
		f2.strField = "잘까?";
		
		System.out.println(f == f2);
	}

}
