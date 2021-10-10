package utn.clase;

public class Motor
{
    private boolean motorEncendido;

    public void arrancar()
    {
        if(!this.motorEncendido)
        {
            this.motorEncendido = !this.motorEncendido;
        }
    }

    public void detener()
    {
        if(this.motorEncendido)
        {
            this.motorEncendido = !this.motorEncendido;
        }
    }

    public boolean isMotorEncendido()
    {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido)
    {
        this.motorEncendido = motorEncendido;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Motor{");
        sb.append("motorEncendido=").append(motorEncendido);
        sb.append('}');
        return sb.toString();
    }
}
