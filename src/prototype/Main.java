package prototype;

public class Main {

	public static void main(String[] args) {
		JobApplication jobApplication1 = new JobApplication("developer", "Accenture", "resume",
				"Accenture coverLetter");

		JobApplication jobApplication2 = jobApplication1.clone();
		jobApplication2.setCompany("TCS");
		jobApplication2.setCoverLetter("TCS coverLetter");

		System.out.println(jobApplication1);
		System.out.println(jobApplication2);
		System.out.println(jobApplication1 == jobApplication2);
	}

}
