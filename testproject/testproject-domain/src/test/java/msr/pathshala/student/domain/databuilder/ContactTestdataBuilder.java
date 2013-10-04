package msr.pathshala.student.domain.databuilder;

import msr.pathshala.student.domain.Contact;

public class ContactTestdataBuilder {
    public static Contact stndartContact() {
        return Contact.contact()
                .type(Contact.STANDARD_CONTACTTYPE)
                .name("Surjan Singh")
                .epost("test@test.no")
                .telephone("87654321")
                .sms("12345678")
                .build();
    }
}
