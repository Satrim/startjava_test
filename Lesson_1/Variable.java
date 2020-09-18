public class Variable {
	public static void main(String[] args) {
		byte core = 2;
		short hdd = 1000;
		int videoRAM = 8000;
		long ram = 32536;
		float speedGPU = 1036;
		double speedCPU = 2.5;
		char name = 'A';
		boolean isWork = true;

		System.out.println("Количество ядер - " + core);
		System.out.println("Частота процессора - " + speedCPU);
		System.out.println("Оперативная память - " + ram);
		System.out.println("Частота графического процессора - " + speedGPU);
		System.out.println("Видео память - " + videoRAM);
		System.out.println("Объем жесткого диска - " + hdd);
		System.out.println("Name " + name);
		System.out.println("Рабочее состояние - " + isWork);
		
	}
}