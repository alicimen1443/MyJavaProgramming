package day35_Encapsulation.encapsulation;


public class Credentials {

    private String username;
    private String password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username==null||username.isBlank()||username.isEmpty()){
            System.err.println("Invalid username");
            System.exit(1);
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(isStrongPAssWord(password)){
            this.password = password;
        }else{
            System.err.println("This is not a strong password");
            System.exit(1);
        }

    }

    public boolean isStrongPAssWord(String password){

        boolean r=false;
        if(password.length()>=8){
            r=true;
        }
        boolean r1=true;
        if(password.contains(" ")){
            r1=false;
        }
        boolean r2=false;
        for (char each : password.toCharArray()) {
            if(Character.isLetter(each)){
                r2=true;
            }
        }
        boolean r3 = false;
        for (char each : password.toCharArray()) {
            if(Character.isDigit(each)){
                r3=true;
            }
        }

        boolean r4= false;
        for (char each : password.toCharArray()) {
            if(  !(Character.isLetterOrDigit(each) ) ){
                r4=true;
            }
        }

        if(r&&r1&&r2&&r3&&r4){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
