package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CodigosPaisModel {

    public void setId(int id) {
        this.model.setId(id);
    }

    @XmlElement
    public int getId() {
        return this.model.getId();
    }

    public void setContiene(String contiene) {
        this.model.setContiene(contiene);
    }

    @XmlElement
    public String getContiene() {
        return this.model.getContiene();
    }

    public void setImageicon(String imageicon) {
        this.model.setImageicon(imageicon);
    }

    @XmlElement
    public String getImageicon() {
        return this.model.getImageicon();
    }

    public void setNombre(String nombre) {
        this.model.setNombre(nombre);
    }

    @XmlElement
    public String getNombre() {
        return this.model.getNombre();
    }

    public void setIso2(String iso2) {
        this.model.setIso2(iso2);
    }

    @XmlElement
    public String getIso2() {
        return this.model.getIso2();
    }

    public void setIso3(String iso3) {
        this.model.setIso3(iso3);
    }

    @XmlElement
    public String getIso3() {
        return this.model.getIso3();
    }

    public void setCia(String cia) {
        this.model.setCia(cia);
    }

    @XmlElement
    public String getCia() {
        return this.model.getCia();
    }

    public void setTelefono(String telefono) {
        this.model.setTelefono(telefono);
    }

    @XmlElement
    public String getTelefono() {
        return this.model.getTelefono();
    }

    public void setInternet(String internet) {
        this.model.setInternet(internet);
    }

    @XmlElement
    public String getInternet() {
        return this.model.getInternet();
    }

    public void setVehiculo(String vehiculo) {
        this.model.setVehiculo(vehiculo);
    }

    @XmlElement
    public String getVehiculo() {
        return this.model.getVehiculo();
    }

    public void setEstado(String estado) {
        this.model.setEstado(estado);
    }

    @XmlElement
    public String getEstado() {
        return this.model.getEstado();
    }

    public void setClienteId(int clienteId) {
        this.model.setClienteId(clienteId);
    }

    @XmlElement
    public int getClienteId() {
        return this.model.getClienteId();
    }

    private String errorRegistro ="";

    public void setErrorRegistro(String errorRegistro) {
        this.errorRegistro = errorRegistro;
    }

    @XmlElement
    public String getErrorRegistro() {
        return this.errorRegistro;
    }
    private CodigosPais model = new CodigosPais();

    public CodigosPaisModel(CodigosPais model) {
        this.model = model;
    }

    public CodigosPaisModel() {

    }

    @XmlElement
    public CodigosPais getModel() {
        return this.model;
    }
}
