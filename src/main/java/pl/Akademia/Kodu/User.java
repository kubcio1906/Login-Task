package pl.Akademia.Kodu;

public class User {
    private String login,name,surmane,password;
    private int id;

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getSurmane() {
        return surmane;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }
}
