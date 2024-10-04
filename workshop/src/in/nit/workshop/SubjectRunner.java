package in.nit.workshop;

public class SubjectRunner {

	public static void main(String[] args) {
		Subject subject1 = new Subject();
		subject1.getSubjectDetails();
		subject1.getSubjectDetails(null);
		subject1.getNumberOfChar("computer");
		}

}
