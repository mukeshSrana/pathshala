package msr.pathshala.student.domain;

import com.google.common.base.Joiner;

public class Name {
    private String firstname;
    private String middlename;
    private String lastname;

    private String displayname;

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDisplayname() {
        return displayname;
    }


    public static NameBuilder name() {
        return new NameBuilder(new Name());
    }

    public static NameBuilder name(Name name) {
        return new NameBuilder(name);
    }

    public static class NameBuilder {
        protected final Name name;

        protected NameBuilder() {
            this.name = new Name();
        }

        protected NameBuilder(Name name) {
            this.name = name;
        }

        public Name build() {
            createDisplayname();
            return name;
        }

        public NameBuilder firstname(String firstname) {
            name.firstname = firstname;
            return this;
        }

        public NameBuilder middlename(String middlename) {
            name.middlename = middlename;
            return this;
        }

        public NameBuilder lastname(String lastname) {
            name.lastname = lastname;
            return this;
        }

        private void createDisplayname() {
            name.displayname = Joiner.on(" ").skipNulls().join(name.getFirstname(), name.getMiddlename(), name.getLastname()).trim();
        }
    }
}
