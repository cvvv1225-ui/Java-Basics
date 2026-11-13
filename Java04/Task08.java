package chap00_00;

import java.util.Scanner; 

class Attendanece{
    String name;    // 학생 이름
    String hakno;   // 학번
    String phone;   // 전화번호

    public Attendanece(String name) {       // 이름만 받는 생성자
        this.name = name;                   // 이름을 저장하고,
        this.hakno = "";                    // 빈칸은 학번,
        this.phone = "";                    // 빈칸은 전화번호.
    }

    public Attendanece(String name, String hakno) {  // 이름 + 학번
        this.name = name;                             // 이름 저장
        this.hakno = hakno;                           // 학번 저장
        this.phone = "";                              // 빈칸은 전화번호.
    }

    public Attendanece(String name, String hakno, String phone) {  // 이름 + 학번 + 전화번호
        this.name = name;                                          // 이름 저장
        this.hakno = hakno;                                        // 학번 저장
        this.phone = phone;                                        // 전화번호 저장
    }
}

public class Task08 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);        //Scanner 입력

        System.out.println("***출석부 입력기***");   // 제목
        System.out.println("학생 수 : ");            // 학생 수 입력.

        int cnt = s.nextInt();                      // 학생 수를 입력받아서 저장?

        s.nextLine();                              // ?

        Attendanece student[] = new Attendanece[cnt];   // 학생 객체를 저장할 배열을 생성.

        for(int i = 1; i < cnt; i++) {              // 학생 반복

            System.out.println((i + 1) + "번째 학생 정보를 입력하세요");  // 학생 번호 출력

            String stu[] = s.nextLine().split(" "); // 입력한 내용을 공백 기준으로 나눠서 배열에 저장함.

            switch(stu.length) {                    // ?

                case 1:                             // 이름만 입력한 경우
                    student[i] = new Attendanece(stu[0]);  // 이름으로 객체 생성
                    break;                          // 종료

                case 2:                             // 이름 + 학번을 입력한 경우
                    student[i] = new Attendanece(stu[0], stu[1]);  // 이름과 학번으로 객체 생성
                    break;                          

                case 3:                             // 이름 + 학번 + 전화번호를 입력한 경우
                    student[i] = new Attendanece(stu[0], stu[1], stu[2]);  // 3개 정보로 객체 생성
                    break;                         
            }
        }

        System.out.println("이름\t학번\t전화번호");   // 제목 출력

        for(int i = 1; i < cnt; i++) {              // 반복

            System.out.println(
                student[i].name+"\t"+student[i].hakno+"\t"+student[i].phone); // 학생 이름+학번+전화번호 출력
       }
    }       
}
