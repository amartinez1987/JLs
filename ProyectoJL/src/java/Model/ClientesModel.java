
package Model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class ClientesModel {

    public void setId(int id) {
        this.model.setId(id);
    }
@XmlElement
    public int getId() {
        return this.model.getId();
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.model.setTipoIdentificacion(tipoIdentificacion);
    }
@XmlElement
    public String getTipoIdentificacion() {
        return this.model.getTipoIdentificacion();
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.model.setNumeroIdentificacion(numeroIdentificacion);
    }
@XmlElement
    public String getNumeroIdentificacion() {
        return this.model.getNumeroIdentificacion();
    }

    public void setPrimerNombre(String primerNombre) {
        this.model.setPrimerNombre(primerNombre);
    }
@XmlElement
    public String getPrimerNombre() {
        return this.model.getPrimerNombre();
    }

    public void setSegundoNombre(String segundoNombre) {
        this.model.setSegundoNombre(segundoNombre);
    }
@XmlElement
    public String getSegundoNombre() {
        return this.model.getSegundoNombre();
    }

    public void setPrimerApellido(String primerApellido) {
        this.model.setPrimerApellido(primerApellido);
    }
@XmlElement
    public String getPrimerApellido() {
        return this.model.getPrimerApellido();
    }

    public void setSegundoApellido(String segundoApellido) {
        this.model.setSegundoApellido(segundoApellido);
    }
@XmlElement
    public String getSegundoApellido() {
        return this.model.getSegundoApellido();
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.model.setFechaNacimiento(fechaNacimiento);
    }
@XmlElement
    public Date getFechaNacimiento() {
        return this.model.getFechaNacimiento();
    }

    public void setSexo(String sexo) {
        this.model.setSexo(sexo);
    }
@XmlElement
    public String getSexo() {
        return this.model.getSexo();
    }

    public void setDireccion(String direccion) {
        this.model.setDireccion(direccion);
    }
@XmlElement
    public String getDireccion() {
        return this.model.getDireccion();
    }

    public void setCelular(String celular) {
        this.model.setCelular(celular);
    }
@XmlElement
    public String getCelular() {
        return this.model.getCelular();
    }

    public void setCorreo(String correo) {
        this.model.setCorreo(correo);
    }
@XmlElement
    public String getCorreo() {
        return this.model.getCorreo();
    }

    public void setPassword(String password) {
        this.model.setPassword(password);
    }
@XmlElement
    public String getPassword() {
        return this.model.getPassword();
    }

    public void setCodigoPaisId(int codigoPaisId) {
        this.model.setCodigoPaisId(codigoPaisId);
    }
@XmlElement
    public int getCodigoPaisId() {
        return this.model.getCodigoPaisId();
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

    private String errorRegistro;

    public void setErrorRegistro(String errorRegistro) {
        this.errorRegistro = errorRegistro;
    }
@XmlElement
    public String getErrorRegistro() {
        return this.errorRegistro;
    }
    
    public void setCodigosPais(CodigosPais codigosPais)
    {
        model.setCodigosPais(codigosPais);
    }
@XmlElement    
    public CodigosPais getCodigosPais()
    {
        return model.getCodigosPais();
    }
    
    private Clientes model = new Clientes();

    public ClientesModel(Clientes model) {
        this.model = model;
    }
     public ClientesModel() {
        
    }
@XmlElement
    public Clientes getModel() {
        return this.model;
    }
}
