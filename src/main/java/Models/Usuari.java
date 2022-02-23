package Models;

public class Usuari {

    private int id;
    private String fullname;
    private String email;
    private boolean admin;
    private String password;
    private String token;

    public Usuari(int id, String fullname, String email, boolean admin, String password, String token) {
      
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.admin = admin;
        this.password = password;
        this.token = token;
    }


    public Usuari(int id, String fullname, String email, boolean admin, String password) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.admin = admin;
        this.password = password;
    }

    public Usuari() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuari{" + "id=" + id + ", fullname=" + fullname + ", email=" + email + ", admin=" + admin + ", password=" + password + ", token=" + token + '}';
    }
    
}
