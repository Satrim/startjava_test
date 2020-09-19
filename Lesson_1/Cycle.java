public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int numbers1 = 6;
        while(numbers1 >= -6) {
            System.out.println(numbers1);
            numbers1 = numbers1 - 2;
        }

        int numbers2 = 11;
        int count = 0;
        do {
            count = count + numbers2;
            numbers2 = numbers2 + 2;
        } while (numbers2 < 20);
        System.out.println(count);
    }
}