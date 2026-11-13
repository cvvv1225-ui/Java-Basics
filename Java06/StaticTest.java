package chap00_00;

class Static {
    int i;                      // 일반 변수
    static String s;            // static 변수

    void imethod() { }          // 일반 메서드
    static void smethod() { }   // static 메서드
}

public class StaticTest {
    public static void main(String[] args) {

        // Static 클래스의 객체 생성
        Static st = new Static();
        
        System.out.println(st.i); // True

        System.out.println(st.s); // True

        st.imethod(); // True

        st.smethod(); // True

        // System.out.println(Static.i); False

        System.out.println(Static.s); // True

        // Static.imethod(); False

        Static.smethod(); // True
    }
}
