package test03;

public class Member {
    // 인스턴스 변수 선언
    private String id;        // 회원 아이디
    private String password;  // 회원 비밀번호
    private String name;      // 회원 이름

    // id의 Getter 메서드
    public String getId() {
        return id;
    }

    // id의 Setter 메서드
    public void setId(String id) {
        this.id = id;
    }

    // password의 Getter 메서드
    public String getPassword() {
        return password;
    }

    // password의 Setter 메서드
    public void setPassword(String password) {
        this.password = password;
    }

    // name의 Getter 메서드
    public String getName() {
        return name;
    }

    // name의 Setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    // equals 메서드 재정의: 두 Member 객체가 동일한지 비교
    // id와 password가 동일하면 두 객체는 동일한 것으로 간주
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // 같은 객체를 비교하는 경우
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { // null이거나 클래스 타입이 다른 경우
            return false;
        }
        Member member = (Member) obj; // obj를 Member 타입으로 캐스팅
        return id.equals(member.id) && password.equals(member.password); // id와 password가 동일한지 비교
    }

    // toString 메서드 재정의: Member 객체의 문자열 표현 반환
    @Override
    public String toString() {
        return "Member{id=" + id + ", password=" + password + ", name=" + name + "}"; // 객체의 id, password, name 정보를 포함한 문자열 반환
    }
}
