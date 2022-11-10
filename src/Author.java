import java.util.Objects;

public class Author {
    private String firstname;
    private String surname;

    public Author(String imya, String familiya) {
        firstname = imya;
        surname = familiya;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Имя автора: " + firstname + ", Фамилия автора: " + surname;
    }
}
