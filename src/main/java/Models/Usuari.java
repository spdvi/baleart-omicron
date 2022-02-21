package Models;

public class Usuari {

    private int id;
    private String fullname;
    private String email;
    private boolean admin;

    public Usuari(int id, String fullname, String email, boolean admin) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuari{" + "id=" + id + ", fullname=" + fullname + ", email=" + email + ", admin=" + admin + '}';
    }
    
}
