package msr.pathshala.student.domain;

import com.google.common.base.Joiner;
import org.joda.time.LocalDate;


import java.util.ArrayList;
import java.util.Collection;

public class Student extends Name {
    /*
    test
     */
    private Long studentnummer;
    private long id;
//    private String displayname;
//
//    private String firstname;
//    private String middlename;
//    private String lastname;
    private LocalDate dateofbirth;
    private Collection<Address> addresses = new ArrayList<Address>();
    private Collection<Contact> contacts = new ArrayList<Contact>();

//    public String getFirstname() {
//        return firstname;
//    }
//
//    public String getMiddlename() {
//        return middlename;
//    }
//
//    public Long getStudentnummer() {
//        return studentnummer;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

//    public String getDisplayname() {
//        return displayname;
//    }

    public static StudentBuilder student() {
        //StudentBuilder studentBuilder = new StudentBuilder(new Student());
        StudentBuilder studentBuilder = new StudentBuilder();
        return studentBuilder;
    }

    public static class StudentBuilder extends NameBuilder {
        protected final Student student;

        protected StudentBuilder() {
            student = new Student();
        }

        protected StudentBuilder(Student student) {
            this.student = student;
        }

        public Student build() {
//            createDisplayname();
            return student;
        }

//        private void createDisplayname() {
//            student.displayname = Joiner.on(" ").skipNulls().join(student.getFirstname(), student.getMiddlename(), student.getLastname()).trim();
//        }
//
//        public StudentBuilder firstname(String firstname) {
//            student.firstname = firstname;
//            return this;
//        }
//
//        public StudentBuilder middlename(String middlename) {
//            student.middlename = middlename;
//            return this;
//        }
//
//        public StudentBuilder lastname(String lastname) {
//            student.lastname = lastname;
//            return this;
//        }

        public StudentBuilder dateofbirth(LocalDate dateofbirth) {
            student.dateofbirth = dateofbirth;
            return this;
        }

        public StudentBuilder addresses(Collection<Address> addresses) {
            student.addresses = addresses;
            return this;
        }

        public StudentBuilder contacts(Collection<Contact> contacts) {
            student.contacts = contacts;
            return this;
        }
    }
}
