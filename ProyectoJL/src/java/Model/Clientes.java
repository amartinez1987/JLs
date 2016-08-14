package Model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Clientes {

    private int id = 0;

    public void setId(int id) {
        this.id = id;
    }
@XmlElement
    public int getId() {
        return this.id;
    }

    private String tipoIdentificacion = "";

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
@XmlElement
    public String getTipoIdentificacion() {
        return this.tipoIdentificacion;
    }

    private String numeroIdentificacion = "";

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
@XmlElement
    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }

    private String primerNombre = "";

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
@XmlElement
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    private String segundoNombre = "";

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
@XmlElement
    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    private String primerApellido = "";

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
@XmlElement
    public String getPrimerApellido() {
        return this.primerApellido;
    }

    private String segundoApellido = "";

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
@XmlElement
    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    private Date fechaNacimiento = new Date();

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
@XmlElement
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    private String sexo = "";

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
@XmlElement
    public String getSexo() {
        return this.sexo;
    }

    private String direccion = "";

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
@XmlElement
    public String getDireccion() {
        return this.direccion;
    }

    private String celular = "";

    public void setCelular(String celular) {
        this.celular = celular;
    }
@XmlElement
    public String getCelular() {
        return this.celular;
    }

    private String correo = "";

    public void setCorreo(String correo) {
        this.correo = correo;
    }
@XmlElement
    public String getCorreo() {
        return this.correo;
    }

    private String password = "";

    public void setPassword(String password) {
        this.password = password;
    }
@XmlElement
    public String getPassword() {
        return this.password;
    }

    private int codigoPaisId = 0;

    public void setCodigoPaisId(int codigoPaisId) {
        this.codigoPaisId = codigoPaisId;
    }
@XmlElement
    public int getCodigoPaisId() {
        return this.codigoPaisId;
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
    
    private CodigosPais codigosPais;
    
    public void setCodigosPais(CodigosPais codigosPais)
    {
        this.codigosPais = codigosPais;
    }
 @XmlElement   
    public CodigosPais getCodigosPais()
    {
        return codigosPais;
    }

}
