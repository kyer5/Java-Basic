package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = sc.nextInt();
        sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

        ProductOrder[] productOrders = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            productOrders[i] = inputProduct();
        }

        printProduct(productOrders);
        System.out.println("총 결제 금액: " + totalPrice(productOrders));
    }

    static ProductOrder inputProduct() {
        Scanner sc = new Scanner(System.in);
        ProductOrder productOrder = new ProductOrder();
        System.out.print("상품명: ");
        productOrder.productName = sc.nextLine();
        System.out.print("가격: ");
        productOrder.price = sc.nextInt();
        System.out.print("수량: ");
        productOrder.quantity = sc.nextInt();
        sc.nextLine(); // 입력 버퍼를 비우기 위한 코드
        return productOrder;
    }

    static void printProduct(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    static int totalPrice(ProductOrder[] productOrders) {
        int sum = 0;
        for (ProductOrder productOrder : productOrders) {
            sum += productOrder.price * productOrder.quantity;
        }
        return sum;
    }
}
