package in.go2kart.model;

public class User {
    private String name;
    private Integer age;
    private Boolean isMale;

    public User(String name, Integer age, Boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    public User() {
        super();
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Boolean getIsMale() {
        return isMale;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age= "+ age + ", isMale="+ isMale + "]";
    }
}
