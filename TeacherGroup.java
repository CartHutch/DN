import java.util.ArrayList;

public class TeacherGroup 
{
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) 
    {
        
    }
    public void add(Teacher t)
    {
        if(teachers.contains(t) == true){
            return;
        }
        else 
            teachers.add(t);

    }
    public void remove(Teacher t)
    {
        if(teachers.contains(t))
            teachers.remove(t);
        else
            return;
    }
    public void remove(int index)
    {
        teachers.remove(index);
    }

    public Teacher getTeacher(Teacher T)
    {
       return T;
    }
    public Teacher getTeacherById(int teacherId) 
    {
        for (Teacher t : teachers) 
        {
            if (t.getTeacherID() == teacherId) 
            {
                return t;
            }
        }
        return null;
    }
    public Teacher getTeacherByIndex(int index) 
    {
        if (index >= 0 && index < teachers.size()) 
        {
            return teachers.get(index);
        } 
        else 
        {
            return null; 
        }
    }
    public int size() 
    {
        return teachers.size();
    }
    @Override
    public String toString()
    {
        String result = "TeacherGroup:\n";
        for (Teacher teacher : teachers) 
        {
            result += teacher.getLastName() + ", " + teacher.getFirstName() + " id: " + teacher.getTeacherID() + "\n";
        }
        return result;
    }
}

