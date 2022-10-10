package week3.polymorphism;
public class Main {

	public static void main(String[] args) {

		BaseLogger[] loggers = { new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
		{
			for (BaseLogger logger : loggers) {
				logger.log("Log message ");

			}

		}
		System.out.println("*********************");
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
