package a_object.equals;

public class Member extends Object 
{

	String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			// equals method가 호출된 Member의 id 필드 값과
			// 매개변수로 전달된 Member의 id 필드값이 일치하면
			// 동일한 데이터를 저장한 객체
			if(this.id == member.id) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Member[ id = "+this.id+"]";
	}
	
}