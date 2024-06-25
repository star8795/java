package c_method;

// 사각형이 넓이를 계산
public class AreaCalculator {
	// 정사각형의 넓이를 계산
	int areaRectangle(int x) {
		return x * x;
	}
	// 너비와 높이를 매개변수로 전달받아 직사각형의 넓이를 반환
	int areaRectangle(int width, int height) {
		return width * height;
	}
	// 반환타입은 무관
	// 정밀도를 향상
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
