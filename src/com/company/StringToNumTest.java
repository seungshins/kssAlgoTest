package com.company;

public class StringToNumTest {
    public static void main(String[] args) {
        System.out.printf("===Start===\n");
        int result = solution("1234");
        System.out.printf("===Result : " + result + "===\n");
        int result2 = solution("+5432");
        System.out.printf("===Result1 : " + result2 + "===\n");
        int result1 = solution("-1234");
        System.out.printf("===Result1 : " + result1 + "===\n");
        System.out.printf("===End===\n");
    }

    /*
    문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

    제한 조건
    s의 길이는 1 이상 5이하입니다.
    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    s는 부호와 숫자로만 이루어져있습니다.
    s는 0으로 시작하지 않습니다.
    입출력 예
    예를들어 str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
    str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
     */

    public static int solution(String s) {
        int answer = 0;

        if( s.length() >= 1 && s.length() <= 5 ) {
            char op = s.charAt(0);
            try {
                answer = Integer.parseInt(s);
            } catch (NumberFormatException ne ) {
                ne.printStackTrace();
            }

        }

        return answer;
    }
}

