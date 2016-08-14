package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CodigosPais {

    private int id = 0;

    public void setId(int id) {
        this.id = id;
    }
    @XmlElement
    public int getId() {
        return this.id;
    }

    private String contiene = "";

    public void setContiene(String contiene) {
        this.contiene = contiene;
    }
    @XmlElement
    public String getContiene() {
        return this.contiene;
    }

    private String imageicon = "";

    public void setImageicon(String imageicon) {
        this.imageicon = imageicon;
    }
    @XmlElement
    public String getImageicon() {
        return this.imageicon;
    }

    private String nombre = "";

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElement
    public String getNombre() {
        return this.nombre;
    }

    private String iso2 = "";

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }
    @XmlElement
    public String getIso2() {
        return this.iso2;
    }

    private String iso3 = "";

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }
    @XmlElement
    public String getIso3() {
        return this.iso3;
    }

    private String cia = "";

    public void setCia(String cia) {
        this.cia = cia;
    }
    @XmlElement
    public String getCia() {
        return this.cia;
    }

    private String telefono = "";

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @XmlElement
    public String getTelefono() {
        return this.telefono;
    }

    private String internet = "";

    public void setInternet(String internet) {
        this.internet = internet;
    }
    @XmlElement
    public String getInternet() {
        return this.internet;
    }

    private String vehiculo = "";

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    @XmlElement
    public String getVehiculo() {
        return this.vehiculo;
    }

    private String estado = "";

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @XmlElement
    public String getEstado() {
        return this.estado;
    }

    private int clienteId = 0;

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    @XmlElement
    public int getClienteId() {
        return this.clienteId;
    }

}
