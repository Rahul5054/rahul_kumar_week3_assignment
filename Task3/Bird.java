public class Bird extends Animal implements Sound {

    @Override
    void move() {
        System.out.println("bird fly in the sky.");
    }

    @Override
    public void singSong() {
        System.out.println("The bird's voice is very melodious");
    }
    
}
