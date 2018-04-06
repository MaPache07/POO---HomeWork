
package tarealabo2.poo;

/**
 *
 * @author Mauricio Pacheco 00170517
 */

class Producto {
    //Atributos
    
    private String nombre;
    private int precio;
    
    //Metodos
    
    public Producto(){}
    
    public String GetNombre(){
        return this.nombre;
    }
    public int GetPrecio(){
        return this.precio;
    }
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public void SetPrecio(int precio){
        this.precio = precio;
    }
} 

class Factura {
    //Atributos
    
    private Producto product;
    private int cant;
    
    //Metodos
    
    public Factura(){}
    
    public void GetProducto(){
        product.GetNombre();
        product.GetPrecio();
    }
    public int GetCantidad(){
        return this.cant;
    }
    public void SetCantidad(int cant){
        this.cant = cant;
    }
}

class Proveedor {
    //Atributos
    
    private String NomProb, NomEmp;
    private Producto producto;
    
    //Metodos
    
    public Proveedor(){};
    
    public String GetProveedor(){
        return this.NomProb;
    }
    public String GetEmpresa(){
        return this.NomEmp;
    }
    public void GetProducto(){
        this.producto.GetNombre();
        this.producto.GetPrecio();
    }
    public void SetProveedor(String nom){
        this.NomProb = nom;
    }
    public void SetEmpresa(String nom){
        this.NomEmp = nom;
    }
}

class Admins {
    //Atributos
    
    private String username, password;
    
    //Metodos
    
    public Admins(){}
    
    public String GetUserName(){
        return this.username;
    }
    public String GetPassword(){
        return this.password;
    }
    public void SetUserName(String user){
        this.username = user;
    }
    public void SetPassword(String pass){
        this.password = pass;
    }
}

public class TareaLabo2POO {

    public static void main(String[] args) {
        
    }
    
}
