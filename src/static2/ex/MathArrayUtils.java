package static2.ex;

public class MathArrayUtils {
    private static int sum;
    private static float average;
    private static int min = 999;
    private static int max = 0;

    private MathArrayUtils() {
        // private -> 인스턴스 생성을 막을 수 있음
    }

    public static int sum(int[] values) {
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static float average(int[] values) {
        average = (float) sum / values.length;
        return average;
    }

    public static int min(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
