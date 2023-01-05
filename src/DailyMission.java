/**
 * 2023.01.05 임홍담 데일리 미션작업
 */
public class DailyMission {

    public static void main(String[] args) {

        // 주어진 배열
        int givenArr[] = {1000, 1, -3000, 9, 0, -10, -1, 2, 4, 10000, -12345};
        int temp = 0;

        // 배열 오름차순정렬
        for (int i = 1; i < givenArr.length; i++) {
            for (int j = 0; j < givenArr.length - i; j++) {
                // 왼쪽 값이 오른 쪽 값보다 크다면 서로 위치교환
                if (givenArr[j] > givenArr[j + 1]) {
                    temp = givenArr[j];
                    givenArr[j] = givenArr[j + 1];
                    givenArr[j + 1] = temp;
                }
            }
        }

        // 정렬된 배열 출력
        for (Integer i : givenArr) {
            System.out.print(i + " ");
        }

        // 결과값 출력
        int result = smallestInteger(givenArr);
        System.out.println("\nSmallest positive Integer = " + result);
    }

    // 문제의 알고리즘
    static int smallestInteger(int arr[]) {
        int max = arr[arr.length - 1]; // 배열의 마지막 값

        // 배열의 크기만큼 반복
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                // 가장작은 정수인 1부터 max까지 반복
                for (int j = 1; j <= max; j++) {
                    // j값이 배열에 없을 때의 j값이 목표값
                    if (arr[i] != j) {
                        return j;
                    }
                    i++;
                }
            }
        }
        // 배열 파라미터 중 가장 큰 값 +1
        return max+1;
    }

}
