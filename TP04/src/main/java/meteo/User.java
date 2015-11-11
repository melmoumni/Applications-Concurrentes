package meteo;

/**
 * Created by mohammed on 10/11/15.
 */
public class User {

    private String firstName;
    private String lastName;
    private String psswd;
    private int access;
    public User(String firstName, String lastName, String psswd){
        this.firstName = firstName;
        this.lastName = lastName;
        this.psswd = psswd;
        this.access = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPsswd() {
        return psswd;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public void setPsswd(String psswd) {

        this.psswd = psswd;
    }
}
