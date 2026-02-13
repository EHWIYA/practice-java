package Day03;

public class Ex15_GuguAll {

    public static void main(String[] args) {
        // (단) X (1 ~ 9)
        // 단에 대한 반복 : 1 ~ 9  : j
        // 각 단의 곱 : 1 ~ 9     : i

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " X " + i + " = " + (i * j));
                System.out.print("\t");          // 탭(공백)
            }
            System.out.println();
        }
    }

}
