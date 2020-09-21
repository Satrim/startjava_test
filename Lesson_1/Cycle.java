public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int counter1 = 6;
        while(counter1 >= -6) {
            System.out.println(counter1);
            counter1 -= 2;
        }

        int counter2 = 11;
        int sumOdd = 0;
        do {
            sumOdd += counter2;
            counter2 += 2;
        } while (counter2 < 20);
        System.out.println(sumOdd);
    }
}