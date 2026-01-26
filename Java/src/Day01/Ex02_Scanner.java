package Day01;

import java.util.Scanner;

// import : 외부 클래스를 포함시키기
// import 패키지명.클래스명;

public class Ex02_Scanner {
    // main : ctrl + space(이클립스)
    // main : main(vscode) 
    public static void main(String[] args) {
        // 객체 생성 키워드 : new
        // 클래스타입 객체명 = new  클래스명();
        // Scanner : 표준 입력 객체
        Scanner sc = new Scanner(System.in);

        System.out.println("a : ");
        int a = sc.nextInt();           // nextInt() : 정수 하나를 입력받는 메소드
        System.out.println("a : " + a);

        // close() : Scanner 객체를 메모리에서 해제하는 메소드
        sc.close();

        // sc.nextInt();
        // Scanner 객체를 해제한 후에는 더 이상 입력을 받을 수 없다.
    }
}
