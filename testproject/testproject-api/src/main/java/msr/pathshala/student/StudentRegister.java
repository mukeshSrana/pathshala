package msr.pathshala.student;

import msr.pathshala.student.domain.Student;

import java.util.List;

public interface StudentRegister {

    public Long register(Student student);

    public void register(List<Student> students);

}
