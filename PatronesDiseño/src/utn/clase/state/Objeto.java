package utn.clase.state;

public class Objeto
{
    private int attribute;
    private IState state;

    public int getAttribute()
    {
        return attribute;
    }

    public void setAttribute(int attribute)
    {
        this.attribute = attribute;
    }

    public IState getState()
    {
        return state;
    }

    public void setState(IState state)
    {
        this.state = state;
    }
}
