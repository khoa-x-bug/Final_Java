
class SinhVien {
    private String id;
    private String name;

    public SinhVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("DCVT099", "Nguyen Nam");
        System.out.println(sv);
    }
}
