public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("Доступ разрешён!");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Пол мужской");
        }
        if (!isMale) {
            System.out.println("Пол жетский");
        }

        double height = 1.9;
        if (height < 1.80) {
            System.out.println("Ниже нормы");
        } else {
            System.out.println("Выше нормы");
        }

        int firstNameLetter = 'I';
        if (firstNameLetter == 'M') {
            System.out.println("Maria");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ivan");
        }
    }
}