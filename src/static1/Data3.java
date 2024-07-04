package static1;

public class Data3 {
    public String name;
    public static int count; // static, 정적 변수 -> 메서드 영역에서 관리됨

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
