package human;

public class Main {
    public static void main(String[] args) {
        Human human = new Female("Megha", 24);
        human.introduce();
        human = new Male("Deepak", 23);
        human.introduce();

    }
    
}
