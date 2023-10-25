package human;

class Male extends Human {
    public Male(String name, int age) {
        super(name, age);
    }


    @Override
    public void introduce() {
        System.out.println("Name: Mr. "  + getName() + " and age: " + getAge() );;
    }
}
