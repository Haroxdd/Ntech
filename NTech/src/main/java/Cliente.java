/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cloud
 */
public class Cliente {
    String NombreCliente, ApellidoCliente,Correo, FechaNa,Cel, calle, col, No, estado, Ciudad,Municipio;
    int ExtencionC;
    public Cliente(String NombreCliente,String ApellidoCliente, String Correo, String FechaNa,  String Cel, String calle, String col, String No, String Ciudad, String Municipio) {
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.Correo = Correo;
        this.FechaNa = FechaNa;
        this.Cel = Cel;
        this.calle = calle;
        this.col = col;
        this.No = No;
        this.Ciudad = Ciudad;
        this.Municipio = Municipio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre Cliente=" + NombreCliente + "Apellido Cliente=" + ApellidoCliente + ", Correo=" + Correo + ", Fecha Nacimiento=" + FechaNa + ", Cel=" + Cel + ", calle=" + calle + ", col=" + col + ", No=" + No +  ", Ciudad=" + Ciudad + ", Estado=" + Municipio + '}';
    }

    
    
    
    public String getNombreCliente() {
        return NombreCliente;
    }

    public Cliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }
    

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

     public String getFechaNa() {
        return FechaNa;
    }

    public void setFechaNa(String FechaNa) {
        this.FechaNa = FechaNa;
    }
    

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String No) {
        this.No = No;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

   

    
    
    
    
}
