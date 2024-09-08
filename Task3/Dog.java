public class Dog extends Animal implements Sound{

    @Override
    void move() {
        System.out.println("Dog is very loyal animal..");
    }

    @Override
    public void singSong() {
        System.out.println(".Owner of Dog Singing a song and also dog barks Woof! Woof!.");
    }
    
}
