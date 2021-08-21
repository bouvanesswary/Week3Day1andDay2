package overload;

public class Students {

	public void getStudentInfo(int Id) {
		// TODO Auto-generated method stub
		System.out.println("Student ID :" + Id);
	}

	public void getStudentInfo(int Id, String name) {
		// TODO Auto-generated method stub
		System.out.println("Student ID: " + Id + " and Name :" + name);
	}

	public void getStudentInfo(String email, long phone) {
		// TODO Auto-generated method stub
		System.out.println("Student email: " + email + " and phone :" + phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students S = new Students();
		S.getStudentInfo(51380501);
		S.getStudentInfo(51380501, "Bouvanesswary");
		S.getStudentInfo("bouvanaa@gmail.com",9840420842l);
	}

}
