package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.printf("===Start===\n");
        boolean result = solution("a234");
        System.out.printf("===Result : " + result + "===\n");
        boolean result1 = solution("1234");
        System.out.printf("===Result1 : " + result1 + "===\n");
        System.out.printf("===End===\n");
    }

    /*
    문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
    예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
     */

    public static boolean solution(String s) {
        boolean answer = false;

        String regEx = "^[0-9]+$";

        if( s.length() == 4 || s.length() == 6 ) {
            answer = s.matches(regEx);
        }

        return answer;
    }
}
