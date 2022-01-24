import org.junit.Test;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class CohortsTest {
/*
    Cohort instance can add a Student to the List of students.
    A Cohort instance can get the current List of students.
    A Cohort instance can get the average, and it's being calculated correctly. */

    @Test
    public void testAddToCohort(){
        Student fergie = new Student(1L, "Fergie");
        Student ryan = new Student(2L, "Steve");
        Cohort regulus = new Cohort();
        Cohort titan = null;
        regulus.addStudent(ryan);
        regulus.addStudent(fergie);
        Assert.assertNull(titan);
        Assert.assertNotNull(regulus);
        List<Student> regulusStudents = regulus.getStudents();
        Student testRyan = regulusStudents.get(0);
        Assert.assertSame(testRyan, ryan);
    }
    @Test
    public void testStudentList(){
        Cohort studentCohort = new Cohort();
        Student student1 = new Student(3, "Stu1");
        Student student2 = new Student(4, "Stu2");
        Student student3 = new Student(5, "Stu3");
        studentCohort.addStudent(student1);
        studentCohort.addStudent(student2);
        studentCohort.addStudent(student3);
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(student1);
        myStudents.add(student2);
        myStudents.add(student3);
        Assert.assertSame(myStudents, studentCohort.getStudents());

    }
    @Test
    public void testGetAverage(){
        Cohort averageCohort = new Cohort();
        Student student1 = new Student(3, "Stu1");
        Student student2 = new Student(4, "Stu2");
        Student student3 = new Student(5, "Stu3");
        averageCohort.addStudent(student1);
        averageCohort.addStudent(student2);
        averageCohort.addStudent(student3);
        student1.addGrade(99);
        student1.addGrade(50);
        student1.addGrade(1);
        student2.addGrade(70);
        student2.addGrade(70);
        student2.addGrade(70);
        student3.addGrade(85);
        student3.addGrade(90);
        student3.addGrade(95);
        Assert.assertEquals(70, averageCohort.getCohortAverage(),0.1);
    }

}
