package chap00_00;   // 이 파일이 속한 폴더 이름

// 삼각형을 계산하는 클래스
class PlaneFigure {

    // 멤버 변수(객체가 가지고 있는 값)
    double base = 5.0;     // 밑변
    double height = 3.5;   // 높이

    // 메소드(기능)

    // 삼각형의 넓이를 구하는 메소드
    double getArea() {
        return (base * height / 2);   // 밑변 × 높이 ÷ 2
    }

    // 삼각형의 빗변을 구하는 메소드
    double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
        // Math.sqrt()는 제곱근을 구하는 함수
    }

    // 삼각형의 둘레를 구하는 메소드
    double getPerimeter() {
        return (base + height + (Math.sqrt(base * base + height * height)));
        // 밑변 + 높이 + 빗변
    }
}

// 실행하는 클래스
public class Task1 {

    public static void main(String[] args) {

        // PlaneFigure 설계도로 삼각형 객체 한개 만들기
        PlaneFigure f = new PlaneFigure();

        // 넓이 출력 (소수점까지)   %출력 형식, .2소수점 자리, f실수, %n줄바꿈
        System.out.printf("삼각형의 넓이 : %.2f%n", f.getArea());

        // 빗변 출력 (")
        System.out.printf("삼각형의 빗변길이 : %.2f%n", f.getHypotenuse());

        // 둘레 출력 (")
        System.out.printf("삼각형의 둘레길이 : %.2f%n", f.getPerimeter());

    }
}
