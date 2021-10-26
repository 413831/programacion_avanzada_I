package utn.clase.adapter;

import utn.clase.adapter.ToyDuck;

public class PlasticToyDuck implements ToyDuck
{
    @Override
    public void squeak()
    {
        System.out.println("Squeak!!!");
    }
}
