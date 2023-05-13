import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
class User {
    //Khởi tạo các thuộc tính
    private int id;
    private String email;

    //Hàm khởi tạo mặc định chỉ khởi tạo id
    public User(int id) {
        this.id = id;
    }

    //Hàm get ID
    public int getId() {
        return id;
    }

    //Hàm set Email
    public void setEmail(String email) {
        this.email = email;
    }

    //Hàm get ID
    public String getEmail() {
        return email;
    }

    //Ghi đè phương thức toString để in ra các thuộc tính (id, email)
    @Override
    public String toString() {
        return String.format("%06d", id) + " " + email;
    }

}

public class Main {
    public static void main(String[] args) {
        //Đọc giá trị nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        //Mảng các đối tượng
        User[] users = new User[testCase + 1];
        int index = 1;
        while (testCase -- > 0) {

            //Chia dữ liệu thành mảng các chuỗi
            String[] input = sc.nextLine().trim().split("\\s+");

            switch (input[0].toUpperCase()) {
                //Tạo đối tượng mới và in ra id và email hiện tại
                case "C":
                    users[index] = new User(index);
                    System.out.println(users[index]);
                    index++;
                    break;
                //In ra id và email mới
                case "SET":
                    int id1 = Integer.parseInt(input[1]);
                    users[id1].setEmail(input[2]);
                    System.out.println(users[id1]);
                    break;
                //In ra id và email hiện tại
                default:
                    int id2 = Integer.parseInt(input[0]);
                    System.out.println(users[id2]);
                    break;
            }
        }
    }
}