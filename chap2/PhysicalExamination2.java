import java.util.Scanner;

class PhysicalExamination2 {

    static final int VMAX = 21; // 시력 분포(0.0부터 0.1 단위로 21개)

    // 신체검사 데이터를 저장하기 위한 클래스
    static class PhyscData {
        String name;   // 이름
        int height;    // 키
        double vision; // 시력

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값을 계산함
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    // 시력 분포를 계산함
    static void distVision(PhyscData[] dat, int[] dist) {
        // 분포 배열을 초기화함
        for (int i = 0; i < VMAX; i++) {
            dist[i] = 0;
        }

        // 데이터로부터 분포를 집계함
        for (int i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        // 예시 데이터
        PhyscData[] x = {
            new PhyscData("강민하", 162, 0.3),
            new PhyscData("김찬우", 173, 0.7),
            new PhyscData("박준서", 175, 2.0),
            new PhyscData("유사범", 171, 1.5),
            new PhyscData("이사연", 168, 0.4),
            new PhyscData("장경오", 174, 1.2),
            new PhyscData("강민하", 169, 0.8), // 참고: 이름이 중복되지만 이 코드에서는 다른 사람으로 취급
        };
        int[] vdist = new int[VMAX]; // 시력 분포 수를 저장할 배열

        // 데이터로부터 시력 분포를 계산함
        distVision(x, vdist);

        System.out.println("## 시력 분포 ##");

        // --- 그래프 출력 반복문 ---
        // 이 반복문은 각 시력 단계(0.0, 0.1, ..., 2.0)를 순회합니다.
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: ", i / 10.0);
            
            // 해당 시력의 사람 수(vdist[i]에 저장된 값)만큼 '*'를 반복해서 출력합니다.
            for (int j = 0; j < vdist[i]; j++) {
                System.out.print("*");
            }
            // 다음 시력의 그래프를 위해 줄을 바꿉니다.
            System.out.println();
        }
    }
}