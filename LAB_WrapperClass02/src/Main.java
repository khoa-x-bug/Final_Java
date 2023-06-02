import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < testcases; t++) {
            String[] input = scanner.nextLine().split(" ");
            ListNum listNum = new ListNum();

            for (String s : input) {
                if (s.endsWith("f")) {
                    float floatValue = Float.parseFloat(s.substring(0, s.length() - 1));
                    listNum.add(floatValue);
                } else {
                    try {
                        int intValue = Integer.parseInt(s);
                        listNum.add(intValue);
                    } catch (NumberFormatException e) {
                        double doubleValue = Double.parseDouble(s);
                        listNum.add(doubleValue);
                    }
                }
            }

            System.out.println(listNum);
        }
    }

    static class ListNum {
        private List<Number> numbers;

        public ListNum() {
            numbers = new ArrayList<>();
        }

        public void add(Number number) {
            numbers.add(number);
        }

        public List<Number> getMidItem() {
            int size = numbers.size();
            List<Number> midItems = new ArrayList<>();

            if (size % 2 == 0) {
                midItems.add(numbers.get(size / 2 - 1));
                midItems.add(numbers.get(size / 2));
            } else {
                midItems.add(numbers.get(size / 2));
            }

            return midItems;
        }

        @Override
        public String toString() {
            List<Number> midItems = getMidItem();
            StringBuilder sb = new StringBuilder();

            for (Number number : midItems) {
                sb.append(number.toString()).append(" ");
            }

            return sb.toString().trim();
        }
    }
}