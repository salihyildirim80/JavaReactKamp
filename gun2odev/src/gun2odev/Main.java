package gun2odev;

public class Main {

	public static void main(String[] args) {
		int whoIsTeacherId;
		String whoIsTeacherName="";
		
		
	    User teacher1 = new User(1,"Engin Demirog","sadasdf".getBytes(),true);
	    User salih = new User(10,"Salih YILDIRIM","asdassd".getBytes(),false);
	    User userList[]= {teacher1,salih};
				
		Course course1 = new Course(1,"Java Giriþ Seviye",teacher1.id);
		Course course2 = new Course(2,"Java Ýleri Seviye",teacher1.id);
		Course course3 = new Course(3,"Java ile React",teacher1.id);
		
		Course[] courses = {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.name);
		}
		
		CourseManager courseManager= new CourseManager();
		whoIsTeacherId = courseManager.getTeacherIdByCourse(course3);
		
		for(User user:userList) {
			if (user.id == whoIsTeacherId ) {
				whoIsTeacherName = user.name;
			}
				
		}
		 
		System.out.println(course3.name + " dersinin hocasýnýn adý :" + whoIsTeacherName.toString());
		
		System.out.println( whoIsTeacherName.toString() + " hocamýzýn verdiði diðer dersler");
		courseManager.getCourseByTeacherId(whoIsTeacherId, courses);
		

	}

}
