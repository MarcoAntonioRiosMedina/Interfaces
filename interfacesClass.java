public class interfacesClass implements aritmeticos{

    public static void main(String[] args) {
       
        System.out.println("El resultado de la suma es: " + new interfacesClass().suma(1,7));

        System.out.println("El resultado de la resta es: " + new interfacesClass().resta(1,7));

        System.out.println("El resultado de la multiplicacion es: " + new interfacesClass().multiplicacion(3,7));

        System.out.println("El resultado de la division es: " + new interfacesClass().division(8,2));
    
}
    public int suma(int x, int y){
        return x+y;
    }

    public int resta(int x, int y){
        return x-y;
    }

    public int multiplicacion(int x, int y){
        return x*y;
    }

    public int division(int x, int y){
        return x/y;
    }
}

interface aritmeticos {

    public int suma(int x, int y);

    public int resta(int x, int y);

    public int multiplicacion(int x, int y);

    public int division(int x, int y);

}
