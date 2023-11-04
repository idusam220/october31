public class MainTwo 
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Trainer          t1 = new Trainer();
		SoftwareTrainer  st = new SoftwareTrainer();
		FrenchTrainer    ft = new FrenchTrainer();
		EnglishTrainer   et = new EnglishTrainer();
		double trainerHours = t1.train(10);
		t1.giveTasks();
		t1.markAttendance();
		System.out.println("Trainer number of hours is : "+trainerHours);
		System.out.println("===========================================");
		st.name   = "Sam";
		st.age    = 34;
		st.income = 10000;
		System.out.println("The software trainer name is : "+st.name);
		System.out.println("Software trainer age is "+st.age);
		System.out.println("Software trainer income is "+st.income);
		double softwareTrainerHours = st.train(4);
		System.out.println("Software trainer hours are :"+softwareTrainerHours);
		st.giveTasks();
		st.markAttendance();
		System.out.println("=============================================");
		ft.name   = "Jacob";
		ft.age    = 36;
		ft.income = 9000;
		System.out.println("The French trainer name is : "+ft.name);
		System.out.println("French trainer age is "+ft.age);
		System.out.println("French trainer income is "+ft.income);
		double frenchTrainerHours = ft.train(4);
		System.out.println("French trainer hours are "+frenchTrainerHours);
		ft.giveTasks();
		ft.markAttendance();
		System.out.println("============================================");
		et.name   = "Mary";
		et.age    = 40;
		et.income = 9000;
		System.out.println("The english trainer name is : "+et.name);
		System.out.println("English trainer age is "+et.age);
		System.out.println("English trainer income is "+et.income);
		double englishTrainerHours = et.train(2);
		System.out.println("English trainer hours are "+englishTrainerHours);
		et.giveTasks();
		et.markAttendance();
		System.out.println("End of Main Method");



	}
}