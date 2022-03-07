package edu.hawaii.its.casdemo.access;

public class Authorization {

    private String uHuuuid;
    private String role;

    public String getuHuuuid() {
        return uHuuuid;
    }

    public void setuHuuuid(String uHuuuid) {
        this.uHuuuid = uHuuuid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
