package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); // new로 생성하는 것들은 자바에서 인스턴스 값들을 알아서 초기화해줌
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
