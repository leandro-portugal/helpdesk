package tech.leandroportugal.helpdesk.domain.dtos;

public class CredentialsDTO {
    
    private String email;
    private String password;

    

    public CredentialsDTO() {
        super();
    
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
