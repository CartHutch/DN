import java.util.ArrayList;

public class CourseSectionGroup
{
	private ArrayList<CourseSection> section = new ArrayList<CourseSection>();
	
	public void add(CourseSection c)
	{
		section.add(c);
	}
	
	public void remove(CourseSection c)
	{
		section.remove(c);
	}
	
	public void remove(int index) 
	{
		if(index >= 0 && index > section.size())
		{
			section.remove(index);
		}
		else
		{
			System.out.println("invalid index");
		}
	}
	
	public CourseSection getCourseSection(CourseSection c)
	{
		return c;
	}
	
	public int getIndex(int i)
	{
		return i;
	}
	
	public int size()
	{
		section.size();
	}
	
	@Override
	public String toString()
	{
		return "sections" + section;
	}
}
