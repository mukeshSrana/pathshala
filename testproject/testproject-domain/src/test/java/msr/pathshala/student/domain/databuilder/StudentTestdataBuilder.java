package msr.pathshala.student.domain.databuilder;

import msr.pathshala.student.domain.Student;
import org.joda.time.LocalDate;

import static com.google.common.collect.Lists.newArrayList;

public class StudentTestdataBuilder {

    public static Student standardStudent (Long studentnummer) {
        return Student.student()
                .dateofbirth(new LocalDate(2002, 9, 16))
                .addresses(newArrayList(AddressTestdataBuilder.standardAddress()))
                .contacts(newArrayList(ContactTestdataBuilder.stndartContact()))
//                .firstname("Sanjana")
//                .middlename("Kaur")
//                .lastname("Gill")
                .build();

    }
}
