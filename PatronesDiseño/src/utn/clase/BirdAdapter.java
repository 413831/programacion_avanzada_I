package utn.clase;

public class BirdAdapter implements ToyDuck
{
    private Bird bird;

    public BirdAdapter(Bird bird)
    {
        this.bird = bird;
    }

    @Override
    public void squeak()
    {
        this.bird.makeSound();
    }
}
