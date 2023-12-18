public class Teacher implements Comparable<Teacher>
{
    private int teacherId;
    private String firstName;
    private String lastName;
    public static void main(String[] args) 
    {
        
    }
    public Teacher()
    {
        this.firstName = null;
        this.lastName = null;
        this.teacherId = 0;
    }
    public int getTeacherID()
    {
        return this.teacherId;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setFirstName(String newName)
    {
        this.firstName = newName;
    }
    public void setLastName(String newName)
    {
        this.lastName = newName;
    }
    @Override
    public String toString()
    {
        return getLastName() + ", " + getFirstName() + " id: " + getTeacherID();
    }

    @Override
    public boolean equals(Object other)
    {
        if(this == other){
            return true;
        }
        if(other == null || getClass() != other.getClass()){
            return false;
        }
        Teacher obj = (Teacher) other;

        if(this.getTeacherID() == obj.getTeacherID())
        {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Teacher o) 
    {
       return Integer.compare(this.teacherId, o.getTeacherID());
    }
}