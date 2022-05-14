package contacts;

/**
 * Created with IntelliJ IDEA.
 * $ Project: Contacts
 * User: rodrigotroy
 * Date: 14-05-22
 * Time: 17:49
 */
public class Contact {
    private final String name;
    private final String surname;
    private final String number;

    public Contact(String name,
                   String surname,
                   String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        System.out.println("A record created!");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }

    static final class Builder {
        private String name;
        private String surname;
        private String number;

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        Contact build() {
            return new Contact(name,
                               surname,
                               number);
        }
    }
}
