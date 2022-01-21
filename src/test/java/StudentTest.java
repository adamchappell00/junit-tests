import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student testStudent;

    @Before
    public void setUp() {
        this.testStudent = new Student("Ace", 1000000001);

    }
    @Test
    public void testConstructorCreates() {
        Assert.assertNotNull(this.testStudent);
    }
    @Test
    public void testConstructorSetsName() {
        Assert.assertEquals("Ace", this.testStudent.getName());
    }
    @Test
    public void testInitializeGradesArray(){
        Assert.assertNotNull(this.testStudent.getGrades());
    }
}
