package practice_06;
//상위 클래스인 Bank 클래스의 getInterestRate 메서드를 오버라이딩하여
// 좋은 은행의 이자율을 반환하는 메서드
public class GoodBank extends Bank {
    @Override
    public double getInterestRate() {
        return 3.0;
    }
}