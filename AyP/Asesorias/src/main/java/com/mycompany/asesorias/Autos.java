
package com.mycompany.asesorias;

public class Autos {
    private int clave;
    private String marca;
    private int anio;
    private int kilometraje;
    private String nombreCliente;
    private int claveCliente;
    private static int contador=0;

 //Constructor vacío
    public Autos()
    {
        clave=contador;
        contador++;
    }
    
//Constructor con parametros     
    public Autos(String marca, int anio, int kilometraje)
    {
        this.marca=marca;
        this.anio= anio;
        this.kilometraje= kilometraje;
        
        clave=contador;
        contador++;
    }

    public int getAnio() {
        return anio;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setClaveCliente(int claveCliente) {
        this.claveCliente = claveCliente;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    
    public boolean equals(Autos otroAuto) {
        return clave==otroAuto.clave;
    }
    
    public int compareTo(Autos otroAuto)
    {
        int respuesta;
        
        respuesta=0;
        if(clave<otroAuto.clave)
        {
            respuesta=-1;
        }
        else
        {
            if(clave>otroAuto.clave)
            {
                respuesta=1;
            }
        }
        return respuesta;
    }
    
    
    public double rentaAuto(String nombre, int licencia, int dias)
    {
        double respuesta;
        
        
        if(this.anio<2005)
        {
            respuesta= dias*200;
        }
        else
        {
            respuesta=dias*300;
        }
        
        if(kilometraje<20000)
        {
            respuesta+= 20*dias;
        }
        this.nombreCliente= nombre;
        this.claveCliente= licencia;
        
        return respuesta;
    }
    
    public boolean devolucion(int nuevoKilometraje)
    {
        boolean respuesta;
        
        respuesta=false;
        if(nuevoKilometraje>0)
        {
           this.nombreCliente= "";
           // "" es parecido a null
           this.claveCliente= 0;
           this.kilometraje+= nuevoKilometraje; 
           respuesta=true;
        }
        
        return respuesta;
    }
    
}
