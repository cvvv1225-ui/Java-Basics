package chap00_00;

public class MTtest {

    // 메인 메서드가 없어서 만듬
    public static void main(String[] args) {

        // 객체 생성
        MTtest test = new MTtest();

        // 메서드 호출 
        test.method1(10, 20);
    }

    // 두 정수를 전달받는 메서드
    public void method1(int n, int m) {

        n += m;

        System.out.println(xMethod(3.4));
    }

    // 실수를 전달받아 정수를 반환하는 메서드
    public static int xMethod(double d) {

        // 양수이면 1 반환
        if (d > 0)
            return 1;

        // 0이면 0 반환
        else if (d == 0)
            return 0;

        // 음수이면 -1 반환
        else
            return -1;
    }
}