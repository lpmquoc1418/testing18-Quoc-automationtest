import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Ctrl + / ; Cmd + /
//        1. Câu lệnh nhập/xuất dữ liệu
        System.out.println("Hello World!");
//        biến (variable)
//        <kiểu dữ liệu> <tên hiến>;
//        <kiểu dữ liệu> <tên biến> = <giá trị mặc đinh>;
//        quy tắc đặt tên biến: camel case
//        VD: soNguyen, hocSinh,
        int num1 = 10;
        System.out.println(num1);

        float num2 = 10.5f;

        boolean isActive = true;
        System.out.println(isActive);
        char ch = 'a';
        String str = "Hello World!";
        System.out.println(str);

//        2. các toán tử
//        2.1. phép toán: +, -, *, / (chia lấy nguyên), % (lấy dư)
//        phén +
//        VD: công số nguyên, cộng số thực, nối chuỗi
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println("Tổng 2 số nguyên là: " + result);

//        ++ => tăng giá trị biến đó lên 1 đơn vị
//        number1 = number1 + 1 => number1++
//        gán giá trị number1 vào number3, sau đó tăng giá trị
//        của number1 lên 1 đơn vị
//        number3=10 ; number1=11
        int number3 = number1++;
        System.out.println("number3="+ number3);
        System.out.println("number1="+ number1);

//        tăng giá trị number2 lên 1 đơn vị
//        sau đó gán giá trị number2 vào number4
//        number2 = number4 = 21
        int number4 = ++number2;

//        phép trừ tương tự như phép
//        number --
//        -- number

        number1 += 10; //number1 = number1 + 10
        number1 -= 10; // number1 = number1 - 10
        number1 = number2 + 10; // ghi đầy đủ

//        phép nhân không có number1 ** và ** number1
        number1 *= 10;
//        phép chia không có number1// và //number1
        number1 /= 10;
        number1 %= 10;

//        hằng số (constant) -> biến lưu giá trị không đổi|
        final int TIMEOUT = 1000;
//        TIMEOUT=10 => SAI
//        => địa chỉ trang web, timeout, lưu locator

//        2.2. so sánh: >, >=, <, <= , == , != , ! (phủ định)
//        kết quả trả về -> boolean
        boolean isGreater = 10 > 5;
        boolean isEqual = 100 == 10;
//        => đi kèm với condition statement, loop statement

//        2.3. nối nhiều điều kiên: &&, | |
//        Kết qur trả về -> boolean
        boolean isCheck = (10 > 5) && (10 < 20);
//        true khi 2 hoặc nhiều đều kiện cùng true
//        true && true => true
//        true && false => false
//        false && true => false

        boolean isCheck2 = (10 > 5) || (10 < 20);
//        chỉ false khi 2 hoặc nhiều điều kiện cùng false
//        true || false => true
//        false || true => true
//        true || true => true
//        false || false => false

//        3. Nhập dữ Liệu -> nhận dữ liệu từ bàn phím
//        Scanner
        Scanner sc = new Scanner(System.in);
//        nhân số nguyên
//        bắt user nhập giá trị từ bàn phím và gõ Enter rồi mới xử lý

//        goi API -> bất đồng bộ
        System.out.println("Moi ban nhap so nguyen");
        int number5 =  sc.nextInt();

        System.out.println("So nguyen ban nhap la: " + number5);
        float number6 =   sc.nextFloat();
        System.out.println("So thuc ban nhap la: " + number6);

        System.out.println("Moi ban nhap chuoi: ");
        String str1 = sc.nextLine();
        System.out.println("Chuoi ban nhap la: " + str1) ;
//        vừa nhập số nguyên, vừa nhập chữ
//        nhập chữ -> convert số kiểu dữ liệu tưang ứng
        System.out.println("Moi ban nhap số nguyen: ");
        int number5 = Integer.parseInt(sc.nextLine());
        System.out.println("So nguyen ban nhap la: " + number5);

        System.out.println("Moi ban nhap so thuc: ");
        float number6 = Float.parseFloat(sc.nextLine());
    }
}