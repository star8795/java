package guide_answer.practice03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PracticeMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Location> manage = new HashMap<>();
		System.out.println("도시, 경도, 위도를 한번에 입력해주세요. (q는 입력완료)");

		// 도시, 경도, 위도 정보 입력받기
		while (true) {
			System.out.print("입력: ");
			String input = sc.nextLine();
			
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(input, ",");
			if (st.countTokens() == 3) {
				try {
					String city = st.nextToken().trim();
					double longitude = Double.parseDouble(st.nextToken().trim());
					double latitude = Double.parseDouble(st.nextToken().trim());
					
					manage.put(city, new Location(longitude, latitude));
					System.out.println(city + " 정보가 저장되었습니다.");
				} catch (NumberFormatException e) {
					System.out.println("경도와 위도는 숫자여야 합니다. 다시 입력해주세요.");
				}
			} else {
				System.out.println("입력 형식이 잘못되었습니다. 다시 입력해주세요.");
			}
		}

		// 도시 이름으로 검색하기
		System.out.println("도시 이름으로 검색을 시작합니다. (q는 검색 완료)");
		while (true) {
			System.out.print("도시 이름 입력: ");
			String city = sc.nextLine();
			
			if (city.equalsIgnoreCase("q")) {
				break;
			}
			
			Location location = manage.get(city);
			if (location != null) {
				System.out.println(city + "의 위치: " + location);
			} else {
				System.out.println(city + "의 정보를 찾을 수 없습니다.");
			}
		}

		System.out.println("시스템 종료");
		sc.close();
	}

	// Location 클래스는 PracticeMap 클래스의 내부 클래스로 정의합니다.
	static class Location {
		private double longitude;	// 경도
		private double latitude;	// 위도
		
		public Location(double longitude, double latitude) {
			this.longitude = longitude;
			this.latitude = latitude;
		}
		
		public double getLongitude() {
			return longitude;
		}
		
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
		
		public double getLatitude() {
			return latitude;
		}
		
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
		
		@Override
		public String toString() {
			return "Location [longitude=" + longitude + ", latitude=" + latitude + "]";
		}
	}
}
