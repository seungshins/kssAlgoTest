package com.company;

public class FIFOTest {
    public static void main(String[] args) {
        System.out.printf("===Start===\n");
        int[] arr = {1,2,3};
        int result = solution(6, arr);
        System.out.printf("===Result : " + result + "===\n");
        System.out.printf("===End===\n");
    }

    /*
처리해야 할 동일한 작업이 n 개가 있고, 이를 처리하기 위한 CPU가 있습니다.

이 CPU는 다음과 같은 특징이 있습니다.

CPU에는 여러 개의 코어가 있고, 코어별로 한 작업을 처리하는 시간이 다릅니다.
한 코어에서 작업이 끝나면 작업이 없는 코어가 바로 다음 작업을 수행합니다.
2개 이상의 코어가 남을 경우 앞의 코어부터 작업을 처리 합니다.
처리해야 될 작업의 개수 n과, 각 코어의 처리시간이 담긴 배열 cores 가 매개변수로 주어질 때, 마지막 작업을 처리하는 코어의 번호를 return 하는 solution 함수를 완성해주세요.

제한 사항
코어의 수는 10,000 이하 2이상 입니다.
코어당 작업을 처리하는 시간은 10,000이하 입니다.
처리해야 하는 일의 개수는 50,000개를 넘기지 않습니다.
입출력 예
n	cores	result
6	[1,2,3]	2
입출력 예 설명
입출력 예 #1
처음 3개의 작업은 각각 1,2,3번에 들어가고, 1시간 뒤 1번 코어에 4번째 작업,다시 1시간 뒤 1,2번 코어에 5,6번째 작업이 들어가므로 2를 반환해주면 됩니다.
     */

    // 처음 작업은 core 수만큼 차감된다
    // 두번째 부터는 time count(1)만큼 core에서 뺀후 0인 경우 유휴로 잡는다.
    // 유휴인 경우 다시 core의 시간을 원래값으로 되돌려서 작업 할당하고 n-1을 한다.
    // 반복하고 마지막 할당되는 코어를 리턴

//    int answer = 0;
//
//    int[] workCores = cores.clone();
//
//    // 처음 할당하는 작업
//    n = n-workCores.length;
//
//        while( n > 0 ){
//        for( int i=0; i<workCores.length; i++ ) {
//            workCores[i]--;
//            if( workCores[i] == 0 ) {
//                workCores[i] = cores[i];
//                n--;
//                if(n==0) {
//                    answer=i+1;
//                }
//            }
//        }
//    }
//        return answer;

    public static int solution(int n, int[] cores) {
        int answer = 0;

        int[] workCores = cores.clone();

        // 처음 할당하는 작업
        n = n-workCores.length;

        while( n > 0 ){
            for( int i=0; i<workCores.length; i++ ) {
                if( workCores[i] > 1) {
                    workCores[i]--;
                    continue;
                }
                if( workCores[i]-1 == 0 ) {
                    workCores[i] = cores[i];
                    n--;
                    if(n==0) {
                        answer=i+1;
                    }
                }
            }
        }
        return answer;
    }
}

