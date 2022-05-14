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
}
