package restAssured.pojoClassExample;

import java.util.List;

public class UserProfile {

    private String name;
    private String email;
    private Address address;
    private List<String> skills;

    public UserProfile(String name, String email, Address address, List<String> skills) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.skills = skills;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
