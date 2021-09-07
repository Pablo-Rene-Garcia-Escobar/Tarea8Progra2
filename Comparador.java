package Tarea8;

public class Comparador {

    private int edad;
    private double precio;

    public Comparador() {
        this.edad = 0;
        this.precio = 0;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    //Comparador para producto
    public boolean igualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return this.precio == pro.getPrecio();
    }

    public boolean menorQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() < this.precio;
    }

    public boolean mayorQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() > this.precio;
    }

    public boolean mayorIgualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() >= this.precio;
    }
    
    public boolean menorIgualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() <= this.precio;
    }
    
    //Comparador para alumno
    public boolean igualQueA(Object al) {
        Alumno a = (Alumno) al;
        return this.edad == a.getEdad();
    }

    public boolean menorQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() < this.edad;
    }

    public boolean mayorQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() > this.edad;
    }
    
    public boolean mayorIgualQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() >= this.edad;
    }  

    public boolean menorIgualQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() <= this.edad;
    }

      

}
