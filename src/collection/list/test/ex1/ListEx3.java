package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력해주세요. (종료 0)");
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }

        System.out.print("입력한 정수의 합계: ");
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        System.out.println(total);
        System.out.print("입력한 정수의 평균: ");
        double average = (double) total / numbers.size();
        System.out.println(average);
    }
}
