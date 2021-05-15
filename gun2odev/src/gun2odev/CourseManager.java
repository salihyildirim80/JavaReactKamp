package gun2odev;

public class CourseManager {
	
	public int getTeacherIdByCourse(Course course) {
		return course.teacher;
	}
	
	public void getCourseByTeacherId(int teacherId,Course[] courses) {
		for(Course course:courses) {
			if(course.teacher == teacherId) {
			System.out.println(course.name);
			}
		}
	}


}
