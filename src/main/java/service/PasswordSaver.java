package service;

public class PasswordSaver {
    private  Integer password = 1;
    private static final PasswordSaver instance = new PasswordSaver();

    private PasswordSaver() {
    }
    public static synchronized PasswordSaver getInstance(){
        if(instance == null){
            return new PasswordSaver();
        }
        return instance;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
