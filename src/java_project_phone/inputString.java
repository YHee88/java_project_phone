package Exam_variable;
import java.util.Scanner;
public class culcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;
        boolean first = true; // 첫 입력인지 판단
        String input;

        System.out.println("==== 자바 콘솔 계산기 ====");
        System.out.println("사용법: 숫자 연산자 숫자 ... (예: 5 + 3)");
        System.out.println("계속 연산하려면 연산자와 숫자만 입력하세요. 종료하려면 'exit' 입력");
        System.out.println();

        while (true) {
            if (first) {
                System.out.print("첫 번째 숫자 입력: ");
                input = sc.next();
                if (input.equalsIgnoreCase("exit")) break;
                result = Double.parseDouble(input);
                first = false;
            }

            System.out.print("연산자 입력 (+, -, *, /): ");
            String op = sc.next();
            if (op.equalsIgnoreCase("exit")) break;

            System.out.print("숫자 입력: ");
            input = sc.next();
            if (input.equalsIgnoreCase("exit")) break;
            double num = Double.parseDouble(input);

            switch (op) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    if (num == 0) {
                        System.out.println("0으로 나눌 수 없습니다!");
                        continue;
                    }
                    result /= num;
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    continue;
            }

            System.out.println("현재 결과: " + result);
        }

        System.out.println("계산기 종료. 최종 결과: " + result);
        sc.close();
    }
}

