package human;

class Female extends Human {
    public Female(String name, int age) {
        super(name, age);
    }


    @Override
    public void introduce() {
        System.out.println("Name:  Mrs." +  getName()+ " and age: " + getAge() );
    }
}
