public class Main {
    public static int next_perfect(int n) {
        int i = n + 1;
        while (true) {
            double result = Math.sqrt(i);
            int floored = (int) result;
            if (floored * floored == i) {
                return i;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(next_perfect(9));
    }

}