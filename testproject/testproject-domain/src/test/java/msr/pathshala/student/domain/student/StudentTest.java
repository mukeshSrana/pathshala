package msr.pathshala.student.domain.student;

import msr.pathshala.student.domain.Student;
import msr.pathshala.student.domain.databuilder.StudentTestdataBuilder;
import org.fest.assertions.Assertions;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudent() {
        Student student = StudentTestdataBuilder.standardStudent(1L);
        Assertions.assertThat(student.getDisplayname()).isEqualTo("Sanjana Kaur Gill");
    }
}
