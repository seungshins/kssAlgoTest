package com.company;

public class StrangeStringTest {
    public static void main(String[] args) {
        System.out.printf("===Start===\n");
        String result = solution("try hello world");
        System.out.printf("===Result : " + result + "===\n");
        System.out.printf("===End===\n");
    }

    /*
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
    제한 사항
    문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    s	            return
    try hello world	TrY HeLlO WoRlD
     */



    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String upS = s.toUpperCase();
        String lowS = s.toLowerCase();

        boolean isJJakSu = true;

        for( int i=0; i<s.length(); i++ ){
            char t = s.charAt(i);
            if( t != ' ') {
                if (isJJakSu) {
                    sb.append(upS.charAt(i));
                    isJJakSu = false;
                } else {
                    sb.append(lowS.charAt(i));
                    isJJakSu = true;
                }
            } else {
                sb.append(t);
                isJJakSu = true;
            }
        }

        return sb.toString();
    }

//    StringBuilder sb = new StringBuilder();
//
//    String upS = s.toUpperCase();
//    String lowS = s.toLowerCase();
//
//    String[] strArrUp = upS.split("\\s");
//    String[] strArrLow = lowS.split("\\s");
//
//        if( strArrUp != null && strArrUp.length > 0 ) {
//        for(int j = 0; j<strArrUp.length; j++ ) {
//            String upT = strArrUp[j];
//            String lowT = strArrLow[j];
//            for (int i = 0; i < upT.length(); i++) {
//                if( i % 2 == 0 ) {//짝수
//                    sb.append(upT.charAt(i));
//                } else {
//                    sb.append(lowT.charAt(i));
//                }
//            }
//            if( strArrUp.length > 1 && j < strArrUp.length-1 ) {
//                sb.append(" ");
//            }
//        }
//    }
//        return sb.toString();

    //    String answer = "";
//    StringBuilder sb = new StringBuilder();
//
//    String[] strArr = s.split("\\s");
//
//        if( strArr != null && strArr.length > 0 ) {
//        for(int j = 0; j<strArr.length; j++ ) {
//            String t = strArr[j];
//            for (int i = 0; i <t.length(); i++){
//                if (i % 2 == 0) {    // 짝수
//                    sb.append(Character.toUpperCase(t.charAt(i)));
//                } else {    // 홀수
//                    sb.append(Character.toLowerCase(t.charAt(i)));
//                }
//            }
//            if( j < strArr.length-1 ) {
//                sb.append(" ");
//            }
//        }
//    }
//    answer = sb.toString();
//        return answer;
}

