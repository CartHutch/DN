public class Course implements Comparable<Course>
{
	
	private String name;
    private String subject;
    private String code;
    private int grade;
    private String level;
    private String description;

 
    public Course() 
    {
		
    }

    public Course(String name, String subject, String code, int grade, String level, String description) 
    {
        this.name = name;
        this.subject = subject;
        this.code = code;
        this.grade = grade;
        this.level = level;
        this.description = description;
    }

	 public String getName()
	 {
		return name;
	 }
	 
	 public String getSubject()
	 {
		return subject;
	 }
	 
	 public String getCode()
	 {
		return code;
	 }
	 
	 public int getGrade()
	 {
		return grade;
	 }
	 
	 public String getLevel()
	 {
		return level;
	 }
	 
	 public String getDescription()
	 {
		return description;
	 }
	 
	 public void setName(String Name)
	 {
		this.name = name;
	 }
	 
	 public void setSubject(String Subject)
	 {
		this.subject = subject;
	 }
	 
	 public void setDescription(String Description)
	 {
	
		this.description = description;
	 }
	 
	@Override
    public String toString() 
    {
        return "Course Name: " + name + "Subject: " + subject + "Grade: " + grade + "Course Level: " + level + "Course Code: " + code + "Overview of the course: " +  description;
    }
	
	public boolean equals(Object obj)
	{
		
			if(this == obj)
				return true;
			if(obj == null)
				return false;
					
			if(obj.getClass() != this.getClass())
				return false;
					
			Course course = (Course)obj;
				
			if(getName() == course.getName() && getSubject() == course.getSubject() && getGrade() == course.getGrade() && getLevel() == course.getLevel() && getCode() == course.getCode() && getDescription() == course.getDescription())
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	
	@Override
    public int compareTo(Course otherCourse) 
    {
		
        return this.code.compareTo(otherCourse.getCode());
        
    }
}
