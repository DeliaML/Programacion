package Tema8;

public class Piloto {

    private int driverid;
    private String code;
    private String forename;
    private String surname;
    private String dob;
    private String nationality;
    private String url;

    public Piloto(int driverid, String code, String forename, String surname, String dob, String nationality, String url) {
        this.driverid = driverid;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationality = nationality;
        this.url = url;
    }

    public int getDriverid() {
        return driverid;
    }

    public String getCode() {
        return code;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getDob() {
        return dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public void setCode(String code) {
        if (code.length() == 3) this.code = code;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "driverid=" + driverid +
                ", code='" + code + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob='" + dob + '\'' +
                ", nationality='" + nationality + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
