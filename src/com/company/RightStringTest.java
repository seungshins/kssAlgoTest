package com.company;

public class RightStringTest {
    public static void main(String[] args) {
        System.out.printf("===Start===\n");
        boolean result = solution("()()");
        System.out.printf("===Result : " + result + "===\n");
        boolean result1 = solution("(())()");
        System.out.printf("===Result1 : " + result1 + "===\n");
        boolean result2 = solution(")()(");
        System.out.printf("===Result2 : " + result2 + "===\n");
        boolean result3 = solution("(()(");
        System.out.printf("===Result3 : " + result3 + "===\n");
        System.out.printf("===End===\n");
    }

    /*
    올바른 괄호란 두 개의 괄호 '(' 와 ')' 만으로 구성되어 있고, 괄호가 올바르게 짝지어진 문자열입니다. 괄호가 올바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 합니다.
예를들어

()() 또는 (())() 는 올바른 괄호입니다.
)()( 또는 (()( 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

입출력 예
s	answer
()()	true
(())()	true
)()(	false
(()(	false

     */

    public static boolean solution(String s) {
        int cnt = 0;

        if( s.charAt(0) != '(' ) {
            return false;
        }

        for( int i=0; i<s.length(); i++ ) {
            char indexChar = s.charAt(i);
            if( indexChar == '(' ) {
                cnt++;
            } else {
                cnt--;
            }
            if( cnt < 0 ) {
                return false;
            }
        }

        if( cnt != 0 ) {
            return false;
        }

        return true;
    }
}

