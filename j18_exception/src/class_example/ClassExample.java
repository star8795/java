package class_example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ClassExample {

	public static void main(String[] args) {
		// class의 설계 정보를 저장하는 객체 Class
		// Class 객체를 얻는 방법 3가지
		
		// 1. Object의 정적 멤버인 class keyword 를 이용하여 객체 설계정보 획득
		Class<Person> pClass1 = Person.class;
		// class의 이름 정보(package를 포함하는 class의 전체 이름)
		System.out.println(pClass1.getName());
		
		// 2. Object의 인스턴스 멤버 메소드인 getClass()
		Person person = new Person("최기근");
		System.out.println(person);
		
		Class<Person> pClass2 = (Class<Person>)person.getClass();
		System.out.println(pClass2.getName());
		
		// 3. class의 이름 정보를 이용해서 설계정보 획득
		// Class.forName("클래스 이름");
		
		try {
			Class<Person> pClass3 
						= (Class<Person>)Class.forName("class_example.Person");
			System.out.println(pClass3.getName());				// 풀 네임
			System.out.println(pClass3.getSimpleName());		// class 이름
			System.out.println(pClass3.getPackage().getName()); // package 이름
			
			// class에 정의된 Field(전역변수) 정보
			// java.lang.relect.Field
			// Declared - 선언된 
			Field[] fields = pClass3.getDeclaredFields();
			
			System.out.println("Fields =============================");
			
			for(Field f : fields) {
				// 접근 제한자
				int modifier = f.getModifiers();
				System.out.print(modifier+"\t");
				// java.lang.reflect.Modifier
				System.out.print(Modifier.toString(modifier)+"\t");
				System.out.print(f.getType().getSimpleName()+"\t"); // Field type
				System.out.println(f.getName());					// field 이름
			}
			
			// 생성자 정보
			System.out.println("Constructor=======================");
			// Constructor<?>[] 
			// 선언된 생성자 정보를 배열로 반환
			Constructor<?>[] cons = pClass3.getDeclaredConstructors();
			
			for(Constructor<?> c : cons) {
				// 생성자의 매개변수 타입
				Class<?>[] type = c.getParameterTypes();
				// 매개변수 목록
				Parameter[] names = c.getParameters();
				System.out.print(c.getName()+"(");
				// 생성자 정보를 순회하며 매개변수 타입 및 parameter 이름 출력
				for(int i = 0; i < type.length; i ++) {
					System.out.print(type[i].getName()+" "+names[i].getName()+"\t");
				}
				System.out.println(")");
			}
			
			// method 정보
			System.out.println("Methods ============================");
			// java.lang.reflect.Method
			Method[] methods = pClass3.getDeclaredMethods();
			// Person class 에 정의된 method 목록
			for(Method m : methods) {
				System.out.println(m);
				System.out.print(Modifier.toString(m.getModifiers())+"\t");
				System.out.print(m.getReturnType()+"\t"+m.getName());
				System.out.print("(");
				
				Parameter[] params = m.getParameters();
				// 해당 메소드에 지정된 parameter(매개변수) 순회
				for(Parameter p : params) {
					System.out.print("\t"+p.getType().getSimpleName()+" ");
					if(p.isNamePresent()) {	//파라미터 이름을 제공  : true, 아니면 false
						System.out.print(p.getName());
					}
				} // end parameter for
				System.out.println(")");
			} // end method for
			
			// Class 객체를 통해서 우리가 지정된 class 설계 정보
			// field, constructor, method 정보 확인
			System.out.println("============================================");
			
			System.err.println("Class를 이용하여 instance 생성");
			Class<Person> clazz = (Class<Person>)Class.forName("class_example.Person");
			// deprecated since 9
			// 어떤 기능이 아직까지 사용되고 있지만
			// 권장하는 새로운 기능이 나왔으므로 사용을 권장하지 않음.
			// 조만간 사라질 수도 있는 기능 임을 명시
			Person p = (Person)clazz.newInstance();
			p.setName("최기근");
			p.setAge(20);
			System.out.println(p);
			
			// java 9 이후 권장하는 기능
			// instance 생성 시 접근 할 생성자 지정
			Person p0 = clazz.getConstructor().newInstance(); // 기본생성자
			System.out.println(p0);
			// new Person(String);
			Person p1 = clazz.getConstructor(String.class).newInstance("김동하");
			p1.setAge(65);
			System.out.println(p1);
			
			Person p2 
				= clazz.getConstructor(String.class, int.class).newInstance("최수빈",67);
			System.out.println(p2);
			
		} catch (ClassNotFoundException e) {
			System.out.println("매개변수로 전달된 문자열 위치에 class정보가 존재하지 않음.");
		} catch (InstantiationException e) {
			// 객체 설계정보는 행당위치에 존재하지만 객체생성이 불가능할때 발생하는 오류
			// 추상 클래스, interface 이러한 설계 정보를 가진 class 파일은
			// 자체 만으로 객체 생성이 불가하니 생성 할 수 없다고 발생하는 예외
		} catch (IllegalAccessException e) {
			// class 정보도 존재하고 일반 class 이지만
			// 객체를 생성하기 위한 생성자를 호출 할 수 없음.
			// 접근 제한자.
		} catch (IllegalArgumentException e) {
			// 선언된 생성자와 다른 타입의 인자값이 전달되었을 때 발생되는 예외
		} catch (InvocationTargetException e) {
			// newInstance로 생성된 객체의 method 또는 생성자에서 예외가 발생되었을 때
			// 그 오류를 전달 - 생성자내부에서 발생된 NullPointerException 등등
		} catch (NoSuchMethodException e) {
			// 오버로딩된 생성자를 찾지 못함.
			// 동일한 개수와 매개변수 타입을 가진 생성자를 찾지 못함.
		} catch (SecurityException e) {
			// 접근 권한이 없을 때 - 파일이 접근할 수 없는 디렉토리에 존재할 때
		}
		
	}

}