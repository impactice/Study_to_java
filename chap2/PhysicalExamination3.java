import java.time.LocalDate;
import java.util.Scanner;

// 👉 년월일 필드와 요청된 메소드를 모두 갖춘 클래스
class YMD {
    int y;  // 년
    int m;  // 월(1~12)
    int d;  // 일(1~31)

    // 생성자: 주어진 날짜로 설정
    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
     * n일 뒤의 날짜를 계산해서 새로운 YMD 객체로 반환합니다.
     * @param n 더할 일수
     * @return n일 뒤 날짜 정보를 가진 YMD 객체
     */
    YMD after(int n) {
        // 1. 현재 YMD 객체의 날짜로 LocalDate 객체를 생성
        LocalDate currentDate = LocalDate.of(this.y, this.m, this.d);
        // 2. n일 뒤 날짜를 계산
        LocalDate futureDate = currentDate.plusDays(n);
        // 3. 계산된 날짜 정보로 새로운 YMD 객체를 만들어 반환
        return new YMD(futureDate.getYear(), futureDate.getMonthValue(), futureDate.getDayOfMonth());
    }

    /**
     * n일 앞의 날짜를 계산해서 새로운 YMD 객체로 반환합니다.
     * @param n 뺄 일수
     * @return n일 이전 날짜 정보를 가진 YMD 객체
     */
    YMD before(int n) {
        // 1. 현재 YMD 객체의 날짜로 LocalDate 객체를 생성
        LocalDate currentDate = LocalDate.of(this.y, this.m, this.d);
        // 2. n일 이전 날짜를 계산
        LocalDate pastDate = currentDate.minusDays(n);
        // 3. 계산된 날짜 정보로 새로운 YMD 객체를 만들어 반환
        return new YMD(pastDate.getYear(), pastDate.getMonthValue(), pastDate.getDayOfMonth());
    }
    
    // 객체를 편하게 출력하기 위한 toString() 메소드 (문제 요구사항 외 추가 기능)
    @Override
    public String toString() {
        return y + "년 " + m + "월 " + d + "일";
    }
}

// --- 아래는 테스트를 위한 실행용 클래스입니다 ---
public class PhysicalExamination3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = stdIn.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = stdIn.nextInt();
        System.out.print("일을 입력하세요: ");
        int day = stdIn.nextInt();

        // 1. 입력받은 날짜로 YMD 객체 생성
        YMD today = new YMD(year, month, day);
        System.out.println("입력된 날짜: " + today);
        System.out.println("--------------------");

        // 2. after 메소드 테스트
        System.out.print("며칠 뒤의 날짜를 계산할까요? ");
        int nAfter = stdIn.nextInt();
        YMD futureDay = today.after(nAfter);
        System.out.println(nAfter + "일 뒤는 " + futureDay + " 입니다.");
        
        System.out.println("--------------------");

        // 3. before 메소드 테스트
        System.out.print("며칠 전의 날짜를 계산할까요? ");
        int nBefore = stdIn.nextInt();
        YMD pastDay = today.before(nBefore);
        System.out.println(nBefore + "일 전은 " + pastDay + " 입니다.");
        
        stdIn.close();
    }
}