/**
 *
 * @author ferna
 */
public class Producto extends Inventario {
    int id, cantidad;
    double precio;
    String marca, nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Producto{" + "id: " + id + ", cantidad: " + cantidad + ", precio: " + precio + ", marca: " + marca + ", nombre: " + nombre + '}';
    }
    
}
