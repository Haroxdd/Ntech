/**
 *
 * @author ferna
 */
public class Producto {
    String ID,nombre,marca,proveedor;
    double precio;
    int stock;

    public Producto() {
    }

    public Producto(String ID, String nombre, String marca, String proveedor, double precio, int stock) {
        this.ID = ID;
        this.nombre = nombre;
        this.marca = marca;
        this.proveedor = proveedor;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", nombre=" + nombre + ", marca=" + marca + ", proveedor=" + proveedor + ", precio=" + precio + ", stock=" + stock + '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
