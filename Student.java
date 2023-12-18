import java.time.LocalDate;

public class Student implements Comparable<Student>
{
	private LocalDate birthDate;
	private int ID;
	private String firstName;
	private String lastName;
	
	
	public Student(int ID, String firstName, String lastName, LocalDate birthDate)
	{
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	public int getID()
	{
		return ID;
	}
	public LocalDate getBirthDate()
	{
		return birthDate;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	
	
	public void setID(int ID)
	{
		this.ID = ID;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}
	
	
	
	@Override
	public String toString()
	{
		return ID + ", " + firstName + ", " + lastName;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(this == other)
		{
			return true;
		}
		if(other == null)
		{
			return false;
		}
		if(other.getClass() != this.getClass())
		{
			return false;
		}
		
		Student x = (Student)other;
		
		
		if(x.ID == this.ID && x.firstName == this.firstName && x.lastName == this.lastName)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public int compareTo(Student other)
	{
		int comparing = Integer.compare(this.ID, other.getID());

       
        if(comparing == 0) 
        {
            return this.lastName.compareTo(other.getLastName());
        }

        return comparing;
	}
	
	
	
	
}

