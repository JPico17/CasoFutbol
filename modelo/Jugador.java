package modelo;

public class Jugador
{
    //Atributos
    private String nombre;
    private int goles;
    private int edad;
    private String codigo;
    

    //Métodos
    public Jugador()
    {
        nombre = "";
        goles = 0;
        goles = 0;
        codigo= "";
    }

    public Jugador(String n, int g, int e,String c)
    {
        nombre = n;
        goles = g;
        edad = e;
        codigo= c;
    }
    
    public void setGoles(int g)
    {
        goles = g;
    }

    public int getGoles()
    {
        return goles;
    }

    public void setNombre(String n)
    {
        nombre = n;
    }

    public String getNombre()
    {
        return nombre;
    }public void setEdad(int e)
    {
        edad = e;
    }
    public void setCodigo(String c)
    {
        codigo = c;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public int getEdad()
    {
        return edad;
    }

    public void Goles()
    {
        setGoles(getGoles()+5);
    }

    public String toString()
    {
        return nombre + " con " + goles + " goles. \nEn la posicion : " + codigo +" y edad de " + edad;
    }
} 