import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private long idNumber;
    private ArrayList<Integer> grades;

    public Student(String name, long idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public String getName(){
        return this.name;
    }
    public long getID(){
        return this.idNumber;
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    public double getGradeAverage(){
        double sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
    public void setName(String name){
        this.name = name;
    };
    public void setIdNumber(long idNumber){
        this.idNumber = idNumber;
    }
}
