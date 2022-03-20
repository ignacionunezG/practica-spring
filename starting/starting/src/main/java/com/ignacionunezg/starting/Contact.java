package com.ignacionunezg.starting;
import java.io.Serializable;

public class Contact implements Serializable{
    private String nombre;
    private String apellido;
    private String segundoApellido;
    private String fecha;
    private String dni;
    private long tlf;
    private String email;
    private String direccion;
    private String pais;
    private String ciudad;
    private int cp;
    private String titular;
    private long numTarj;
    private String expiration;
    private int cvv;
    private String promo;

    public Contact(String nombre, String apellido, String segundoApellido, String fecha, String dni, long tlf,
            String email, String direccion, String pais, String ciudad, int cp, String titular, long numTarj,
            String expiration, int cvv, String promo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSegundoApellido(segundoApellido);
        this.setFecha(fecha);
        this.setDni(dni);
        this.setTlf(tlf);
        this.setEmail(email);
        this.setDireccion(direccion);
        this.setPais(pais);
        this.setCiudad(ciudad);
        this.setCp(cp);
        this.setTitular(titular);
        this.setNumTarj(numTarj);
        this.setExpiration(expiration);
        this.setCvv(cvv);
        this.setPromo(promo);
    }

    public Contact(String dni) {
        
        this.setDni(dni);
        
    }


    public String getPromo() {
        return promo;
    }


    public void setPromo(String promo) {
        this.promo = promo;
    }


    public int getCvv() {
        return cvv;
    }


    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


    public String getExpiration() {
        return expiration;
    }


    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }


    public long getNumTarj() {
        return numTarj;
    }


    public void setNumTarj(long numTarj) {
        this.numTarj = numTarj;
    }


    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public int getCp() {
        return cp;
    }


    public void setCp(int cp) {
        this.cp = cp;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public long getTlf() {
        return tlf;
    }


    public void setTlf(long tlf) {
        this.tlf = tlf;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getSegundoApellido() {
        return segundoApellido;
    }


    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public boolean equals(Object obj){
        if (obj instanceof Contact)
        {
            Contact contacto = (Contact) obj;
            if(contacto.dni == this.getDni()){
                return true;
            }
        }
        return false;
    }

}
