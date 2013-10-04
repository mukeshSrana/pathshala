package msr.pathshala.student.domain.databuilder;

import msr.pathshala.student.domain.Address;

public class AddressTestdataBuilder {
    public static Address standardAddress() {
        return Address.address()
                .addresstext("Mortensrud veien 6")
                .postnumber("1268")
                .cityname("Oslo")
                .country("Norway")
                .build();
    }
}
