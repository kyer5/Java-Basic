package poly.ex.pay0;

public class PayService {

    public void processPay(String option, int amount) {

        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 문제점 2. if문에서 두 가지 기능을 동시에 하고 있다
        // 1) 결제수단 선택
        // 2) 실제 pay를 실행
        // -> 각 기능을 쪼개라 !
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay(); // 문제점 1. 각각의 KakaoPay, NaverPay들을 직접적으로 의존하는 것 -> 다형성으로 풀어라 !
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}