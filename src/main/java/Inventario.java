
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ferna
 */
public class Inventario {
    static ArrayList<Producto> productos = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        leerProducto();
        mostrarProducto();
    }

    private static void leerProducto() {
        int contador, cantidadP;
        String nombreP, marcaP;
        double precioP;
        
        Producto aux;
        
        //Cantidad de productos
        do{
            System.out.print("Ingrese la cantidad de productos: ");
            contador = sc.nextInt();
        }while(contador <= 0);
        
        sc.nextLine();
        
        for (int i = 0; i < contador; i++) {
            //Obtener y guardar los atributos del produto
            System.out.println("Producto " + i);
            System.out.println("Nombre: ");
            nombreP = sc.nextLine();
            System.out.print("Marca: ");
            marcaP = sc.nextLine();
            System.out.print("Stock: ");
            cantidadP = sc.nextInt();
            System.out.print("Precio por unidad: ");
            precioP = sc.nextDouble();
            
            aux = new Producto();
            
            aux.setId(i);
            aux.setNombre(nombreP);
            aux.setMarca(marcaP);
            aux.setCantidad(cantidadP);
            aux.setPrecio(precioP);
            
            //Se agrega al arreglo de productos
            productos.add(aux);
        }
    }

    private static void mostrarProducto() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }
}
