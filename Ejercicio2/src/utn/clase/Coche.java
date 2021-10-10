package utn.clase;

public class Coche
{
    private Motor motor;
    private Rueda rueda1;
    private Rueda rueda2;
    private Rueda rueda3;
    private Rueda rueda4;
    private Puerta puerta1;
    private Puerta puerta2;

    public Coche(Motor motor, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4,
                Puerta puerta1, Puerta puerta2)
    {
        this.motor = motor;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
        this.puerta1 = puerta1;
        this.puerta2 = puerta2;
    }

    public void arrancar()
    {
        if(this.puerta1.isPuertaCerrada() && this.puerta2.isPuertaCerrada() &&
            this.rueda1.isRuedaInflada() && this.rueda2.isRuedaInflada() &&
            this.rueda3.isRuedaInflada() && this.rueda4.isRuedaInflada())
        {
            this.motor.arrancar();
            System.out.println("El vehiculo ha arrancado");
        }
        else
        {
            System.out.println("Verifique que todas las puertas esten cerradas y ruedas infladas");
        }
    }

    public void parar()
    {
        if(this.motor.isMotorEncendido())
        {
            this.motor.detener();
            this.puerta1.abrir();
            this.puerta2.abrir();
            this.puerta1.getVentana().cerrar();
            this.puerta2.getVentana().cerrar();
        }
        else
        {
            System.out.println("No se pudo detener el vehiculo");
            System.out.println(this.rueda1.toString());
            System.out.println(this.rueda2.toString());
            System.out.println(this.rueda3.toString());
            System.out.println(this.rueda4.toString());
        }
    }

    public Motor getMotor()
    {
        return motor;
    }

    public void setMotor(Motor motor)
    {
        this.motor = motor;
    }

    public Rueda getRueda1()
    {
        return rueda1;
    }

    public void setRueda1(Rueda rueda1)
    {
        this.rueda1 = rueda1;
    }

    public Rueda getRueda2()
    {
        return rueda2;
    }

    public void setRueda2(Rueda rueda2)
    {
        this.rueda2 = rueda2;
    }

    public Rueda getRueda3()
    {
        return rueda3;
    }

    public void setRueda3(Rueda rueda3)
    {
        this.rueda3 = rueda3;
    }

    public Rueda getRueda4()
    {
        return rueda4;
    }

    public void setRueda4(Rueda rueda4)
    {
        this.rueda4 = rueda4;
    }

    public Puerta getPuerta1()
    {
        return puerta1;
    }

    public void setPuerta1(Puerta puerta1)
    {
        this.puerta1 = puerta1;
    }

    public Puerta getPuerta2()
    {
        return puerta2;
    }

    public void setPuerta2(Puerta puerta2)
    {
        this.puerta2 = puerta2;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Coche{");
        sb.append("motor=").append(motor);
        sb.append(", rueda1=").append(rueda1);
        sb.append(", rueda2=").append(rueda2);
        sb.append(", rueda3=").append(rueda3);
        sb.append(", rueda4=").append(rueda4);
        sb.append(", puerta1=").append(puerta1);
        sb.append(", puerta2=").append(puerta2);
        sb.append('}');
        return sb.toString();
    }
}
