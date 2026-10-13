public class Emp {
    private String name;
    private Integer age;
    private String city;

    public Emp(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Emp{name='" + name + "', age=" + age + ", city='" + city + "'}";
    }
}
