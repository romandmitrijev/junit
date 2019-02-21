package real.invoice;

public class Customer {
    private int id;
    private String name;
    private String email;
    private boolean prefersEmails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrefersEmails() {
        return prefersEmails;
    }

    public void setPrefersEmails(boolean prefersEmails) {
        this.prefersEmails = prefersEmails;
    }
}
