package prototype;

public class JobApplication implements Cloneable {

	private String role;
	private String company;
	private String resume;
	private String coverLetter;

	JobApplication(String role, String company, String resume, String coverLetter) {
		this.role = role;
		this.company = company;
		this.resume = resume;
		this.coverLetter = coverLetter;
	}

	@Override
	public JobApplication clone() {
		try {
			return (JobApplication) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	@Override
	public String toString() {
		return "JobApplication{role: " + role + ", company: " + company + ", resume: " + resume + ", coverLetter: "
				+ coverLetter + "}";
	}

}
