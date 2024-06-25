package practice_07.member;


public class Member {
	
	// 회원관리번호
	private int num;
	// 회원 이름
	private String name;
	// 회원 아이디
	private String id;
	// 회원 비밀번호
	private String pw;
	
	public Member() {}

	// 회원 로그인 및 정보 검색용 생성자
	public Member(String id, String pw) {
		setId(id);
		setPw(pw);
	}

	// 회원가입 용
	public Member(int num, String name, String id, String pw) {
		this(id, pw);
		setNum(num);
		setName(name);
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num < 1){
			System.out.println("회원 번호는 1보다 작을 수 없습니다.");
			return;
		}
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.equals("")) {
			System.out.println("정상적인 이름이 아닙니다.");
			return;
		}
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id == null || id.equals("")) {
			System.out.println("정상적인 id가 아닙니다.");
			return;
		}
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		if(pw == null || pw.equals("")) {
			System.out.println("정상적인 비밀번호가 아닙니다.");
			return;
		}
		this.pw = pw;
	}
	
	public boolean equals(Member member) {
		if(member == null) return false;
		if(this.id.equals(member.getId()) && this.pw.equals(member.getPw())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", id=" + id + ", pw=" + pw + "]";
	}

}
