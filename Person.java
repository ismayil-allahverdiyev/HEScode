public class Person {



    private String name;
    private String lastName;
    private int age;
    private String hesCode;

    public Person(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String hesCode) {
        this.hesCode = hesCode;
    }

    public Person(String name, String lastName, String hesCode) {
        this.name = name;
        this.lastName = lastName;
        this.hesCode = hesCode;
    }

    public Person(String name, String lastName, int age, String hesCode){
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.hesCode = hesCode;
    }

    public Person(String name, String lastName, int age){
        this.name = name;
        this.age = age;
        this.lastName = lastName;

    }


}