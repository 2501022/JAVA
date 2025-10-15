//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int RADIUS = 6378137;
        final int KOREA = 99720;
        final double PI = 3.141592f;
        double surface;
        double result;

        surface = 4 * PI * RADIUS * RADIUS / 1000;
        result = KOREA / surface * 100;

        System.out.printf("대한민국 반지름은 %,dm \u3392 입니다.\n", RADIUS / 1000);
        System.out.printf("지구의 표면적은 약 %,.0f \u3392 입니다.\n", surface);
        System.out.printf("대한민국 면적은 %,d \u3392 입니다.\n", KOREA);
        System.out.printf("따라서 대한민국은 지구의 %.8f %% 를 차지합니다.\n", result);
    }
}