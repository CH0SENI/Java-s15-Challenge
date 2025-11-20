package Library.model;

public class Librarian extends Person {

    public Librarian(int id, String name) {
        super(id, name);
    }

    @Override
    public String whoYouAre() {
        return "Librarian: " + getName();
    }

}
