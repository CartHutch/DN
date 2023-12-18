import java.util.ArrayList;
import java.util.Collections;


public class StudentGroup
{
	private ArrayList<Student> students;
	
	public StudentGroup()
	{
		students = new ArrayList<Student>();
	}
	
	
	
	public void add(Student s)
	{
		students.add(s);
	}
	public void remove(Student s)
	{
		students.remove(s);
	}
	public void remove(int index)
	{
		students.remove(index);
	}
	public Student get(int index)
	{
		return students.get(index);
	}
	public int getSize()
	{
		return students.size();
	}
	public Student get(Student s)
	{
		for(Student c: students)
		{
			if(c.equals(s))
			{
				return c;
			}
		}
			return null;
	}
	
	
	
	@Override
	public String toString()
	{
		Collections.sort(students);
		StringBuilder studentList = new StringBuilder();
		
		for(Student s: students)
		{
			studentList.append(s);
			studentList.append("\n");
			
		}
		return studentList.toString();
	}
	
	
}
