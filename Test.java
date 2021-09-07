package Tarea8;

import java.util.Scanner;

public class Test {

    private static void menu(){
        System.out.println("Por favor ingrese el numero de la opcion que quiere realizar");
        System.out.println("1: Ingresar prducto");
        System.out.println("2: Ingresar alumno");
        System.out.println("3: Salir");
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String nombreP="", nombreA = "", carne = "";
        int id=0, edad=0, op = 0, edadA = 0;
        double precio = 0, precioC =0;
        
        Comparador c = new Comparador();
        
        do{
            
            menu();
            op = in.nextInt();
            
            switch(op){
                case 1:
                    
                    System.out.println("Por favor ingrese el ID del producto");
                    id = in.nextInt();
                    in.nextLine();
                    System.out.println("Por favor ingrese el nombre del producto");
                    nombreP = in.nextLine();
                    System.out.println("Por favor ingrese el precio del producto");
                    precio = in.nextDouble();
                    
                    System.out.println("Por favor ingrese otro precio para hacer la comparacion");
                    precioC = in.nextDouble();
                    
                    Producto p = new Producto(id, nombreP, precio);
                    
                    c.setPrecio(precioC);
                    
                    if(c.igualQueP(p) == true){
                        System.out.println("Los precios son iguales");
                    }
                    
                    if(c.menorQueP(p) == true){
                        System.out.println("El precio del producto es menor al segundo precio ingresado");
                    }
                    
                    if(c.mayorQueP(p) == true){
                        System.out.println("El precio del producto es mayor al segundo precio ingresado");
                    }
                    
                    if(c.mayorIgualQueP(p) == true){
                        System.out.println("El precio del producto es mayor o igual que el segundo precio ingresado");
                    }
                    
                    if (c.menorIgualQueP(p) == true){
                        System.out.println("El precio del producto es menor o igual al segundo precio ingresado");
                    }
                    
                    break;
                case 2:
                    
                    in.nextLine();
                    System.out.println("Por favor ingrese el carne del alumno");
                    carne = in.nextLine();
                    System.out.println("Por favor ingrese nombre del alumno");
                    nombreA = in.nextLine();
                    System.out.println("Por favor ingrese la edad del alumno");
                    edad = in.nextInt();
                    
                    System.out.println("Por favor ingrese otra edad para hacer la comparacion");
                    edadA = in.nextInt();
                    
                    Alumno a = new Alumno(carne, nombreA, edad);
                    
                    c.setEdad(edadA);
                    
                    if(c.igualQueA(a) == true){
                        System.out.println("Las edades son iguales");
                    }
                    
                    if(c.menorQueA(a) == true){
                        System.out.println("La edad del primer alumno es menor a la segunda edad ingresada");
                    }
                    
                    if(c.mayorQueA(a) == true){
                        System.out.println("La edad del primer alumno es mayor a la segunda edad ingresada");
                    }
                    
                    if(c.mayorIgualQueA(a) == true){
                        System.out.println("La edad del primer alumno es mayor o igual a la segunda edad ingresada");
                    }
                    
                    if (c.menorIgualQueA(a) == true){
                        System.out.println("La edad del primer alumno es menor o igual a la segunda edad ingresada");
                    }
                    
                    break;
                case 3:
                    break;
        }
            
        }while(!(op == 3));
        
}
}
