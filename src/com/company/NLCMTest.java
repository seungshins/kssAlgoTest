package com.company;

public class NLCMTest {
    public static void main(String[] args) {
        System.out.printf("===Start===\n");
        int[] arr1 = {2,6,8,14};
        int result = solution(arr1);
        System.out.printf("===Result : " + result + "===\n");
        int[] arr2 = {1,2,3};
        int result1 = solution(arr2);
        System.out.printf("===Result1 : " + result1 + "===\n");
        System.out.printf("===End===\n");
    }

    /*
 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

제한 사항
arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.     1 / 2  = r = 1  a=2 b =1 r=0 a=1 b=0   gcd =1 lcm = 1*2 / 1
입출력 예
arr	result
[2,6,8,14]	168   6       2*6/2 = 6*8/2=24  24*14/2 = 7*24  = 168
[1,2,3] 6  << 2*3 = 6     1, 2 = 2 -- 2, 3 = 6
     */

    public static int solution(int[] arr) {
        int answer = 0;
        int temp = arr[0];

        for( int i = 0; i<arr.length-1; i++ ) {
            int a = temp;
            int b = arr[i+1];

            while(b!=0){
                int r = a%b;
                a= b;
                b= r;
            }

            int gcd = a;
            answer = (temp * arr[i+1]) / gcd;
            temp = answer;
        }

        return answer;
    }
}

