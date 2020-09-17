public class ConditionalStatement {
	public static void main(String[] args) {
        int age1 = 21;
        int age2 = 15;
        int name1 = 73;
        int name2 = 77;
        boolean isMale1 = true;
        boolean isMale2 = false;
        double height1 = 1.9;
        double height2 = 1.7;

        if (age1 > 20) {
            System.out.println("Доступ разрешён!");
        }

        if (age2 > 20) {
            System.out.println("Доступ разрешёт!");
        }

        if (isMale1) {
            System.out.println("Пол мужской");
        } 
        if (!isMale1) {
            System.out.println("Пол жетский");
        }

        if (isMale2) {
            System.out.println("Пол мужской");
        } 
        if (!isMale2) {
            System.out.println("Пол жетский");
        }
       
        if (height1 < 1.80) {
            System.out.println("Ниже нормы");
        } else {
            System.out.println("Выше нормы");
        }

        if (height2 < 1.80) {
            System.out.println("Ниже нормы");
        } else {
            System.out.println("Выше нормы");
        }

        if (name1 == 'M') {
            System.out.println("Maria");
        }
        else if (name2 == 'I') {
            System.out.println("Ivan");
        }
	}
}