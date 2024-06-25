package generic03_extends;

public class Example {

	public static void main(String[] args) {
		Parent<String, Integer> p1 = new Parent<>();
		p1.setKind("Car");
		p1.setModel(520);
		
		Child<String,Integer,String> child = new Child<>();
		child.setKind("Car");
		child.setModel(220);
		child.setCompany("BMW");
		System.out.println(child);
	}

}
