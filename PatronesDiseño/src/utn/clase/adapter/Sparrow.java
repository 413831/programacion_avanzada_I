package utn.clase.adapter;

import utn.clase.adapter.Bird;

public class Sparrow implements Bird
{
    @Override
    public void fly()
    {
        System.out.println("Sparrow flying");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Sparrow singing");
    }
}
