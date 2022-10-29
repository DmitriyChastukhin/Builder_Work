public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public String getName() {
        return name;
    }

    public  PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
        public String setSurname() {
            return surname;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150)
            throw new IllegalArgumentException("Возраст должен быть от 0 до 100");
        this.age = age;
        return this;
    }

    public String getAddress() {
    return address;
    }

    public PersonBuilder setAddress(String address){
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Имя обязательно к заполнению");
        }
        if (surname == null) {
            throw new IllegalStateException("Фамилия обязательна к заполнению");
        }
        Person person = new Person(name, surname);
        person.setAge(age);
        person.setAddress(address);
        return person;
    }
}

