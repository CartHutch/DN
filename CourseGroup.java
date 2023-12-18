import java.util.ArrayList;
import java.util.List;

public class CourseGroup
{
	
	private ArrayList<Course> courses;
	
	public CourseGroup()
	{
		this.courses = new ArrayList<>();
	}
	
	
	public void add(Course c) 
	{
        courses.add(c);
    }

    public void remove(Course c) 
    {
        courses.remove(c);
    }
    
    public Course get(Course c) 
    {
        int index = courses.indexOf(c);
        
        if (index != -1) 
        {
            return courses.get(index);
        }
         else 
         {
            return null; 
        }
    }

    public Course get(int index) 
    {
        if (index >= 0 && index < courses.size()) 
        {
            return courses.get(index);
        } 
        else 
        {
            return null; 
        }
    }

    public int size() 
    {
        return courses.size();
    }

    public String toString() 
    {
         StringBuilder result = new StringBuilder("Courses: ");
        
        for (Course c : courses) 
        {
            System.out.println(courses);
            
            System.out.println(", ");
        }
        return result.toString();
    }
}

