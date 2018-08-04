package com.company;

public class NTileTest {
    public static void main(String[] args) {
        System.out.printf("===Start===\n");
        int result = solution( 5);
        System.out.printf("===Result : " + result + "===\n");
        int result2 = solution(6);
        System.out.printf("===Result1 : " + result2 + "===\n");
        System.out.printf("===End===\n");
    }

    /*
    가로 길이가 2이고 세로의 길이가 1인 직사각형모양의 타일이 있습니다. 이 직사각형 타일을 이용하여 세로의 길이가 2이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다. 타일을 채울 때는 다음과 같이 2가지 방법이 있습니다.

타일을 가로로 배치 하는 경우
타일을 세로로 배치 하는 경우
예를들어서 n이 7인 직사각형은 다음과 같이 채울 수 있습니다.

Imgur

직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를 완성해주세요.

제한사항
가로의 길이 n은 60,000이하의 자연수 입니다.
경우의 수가 많아 질 수 있으므로, 경우의 수를 1,000,000,007으로 나눈 나머지를 return해주세요.

입출력 예
n	result
4	5
입출력 예 설명
입출력 예 #1
다음과 같이 5가지 방법이 있다.

10 : 1+1+8+1+6+1+4+1+2 = 2
6: 1, 1+(n-2), 1+(n-4), 1+(n-6) = 1+5+3+1 = 13
5: 1, 5, 2 = 1+5+2 = 8
4: 1, 3, 1 = 1+3+1 = 5
3: 1, 2, 1+(n-2) = 3
2: 1, 1+(n-2) = 2
1: 1
     */

    public static int solution(int n) {
        int[] d = new int[n+1];
        for(int i=0; i<=n; i++) {
            if(i <= 2) d[i] = i;
            else {
                d[i] = (d[i-1] + d[i-2]) % 1000000007;
            }
        }
        return d[n];
    }
}

