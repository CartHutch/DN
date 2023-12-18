import java.util.ArrayList;

public class CourseSection
{
	private Course course;
	private StudentGroup student;
	private Teacher teacher;
	private Location location;
	
	CourseSection()
	{
		this.course = "TBD";
		this.student = "TBD";
		this.teacher = "TBD";
		this.location = "TBD";
	}
	
	CourseSection getcourse()
	{
		return course;
	}

	CourseSection getTeacher()
	{
		return teacher;
	}
	
	CourseSection getLocation()
	{
		return location;
	}
	
	CourseSection setCourse(Course c)
	{
		this.course = c;
	}
	
	
	CourseSection setTeacher(Teacher t)
	{
		this.teacher = t;
	}
	
	CourseSection setLocation(Location l)
	{
		this.location = l;
	}
	
	CourseSection addStudent(Students s)
	{
		student.add(s);
	}
	
	CourseSection removeStudent(Students s)
	{
		student.remove(s);
	}
}


