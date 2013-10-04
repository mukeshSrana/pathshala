package msr.pathshala.student.domain;

public class Contact {
    public static final String STANDARD_CONTACTTYPE = "STANDARD";

    private String type;
    private String name;
    private String epost;
    private String telephone;
    private String sms;

    public String getSms() {
        return sms;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEpost() {
        return epost;
    }

    public String getTelephone() {
        return telephone;
    }

    public static ContactBuilder contact() {
        return new ContactBuilder(new Contact());
    }

    public static class ContactBuilder {

        protected final Contact contact;

        protected ContactBuilder(Contact contact) {
            this.contact = contact;
        }

        public Contact build() {
            return contact;
        }

        public ContactBuilder type(String type) {
            contact.type = type;
            return this;
        }

        public ContactBuilder name(String name) {
            contact.name = name;
            return this;
        }

        public ContactBuilder epost(String epost) {
            contact.epost = epost;
            return this;
        }

        public ContactBuilder telephone(String telephone) {
            contact.telephone = telephone;
            return this;
        }

        public ContactBuilder sms(String sms) {
            contact.sms = sms;
            return this;
        }
    }
}
