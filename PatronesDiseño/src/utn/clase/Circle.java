package utn.clase;

import utn.clase.facade.Shape;

public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Circle::draw()");
    }
}
