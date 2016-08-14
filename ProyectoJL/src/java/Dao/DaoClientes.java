package Dao;

import Model.Clientes;
import Model.Clientes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DaoClientes {

    @SuppressWarnings("ConvertToTryWithResources")
    public int insertClientes(Clientes cl) throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        int id = 0;
        String sqlQuery = " insert into Clientes(tipoIdentificacion,numeroIdentificacion,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,sexo,direccion,celular,correo,password,codigoPaisId,estado,clienteId) Values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);        
        ps.setString(1, cl.getTipoIdentificacion());
        ps.setString(2, cl.getNumeroIdentificacion());
        ps.setString(3, cl.getPrimerNombre());
        ps.setString(4, cl.getSegundoNombre());
        ps.setString(5, cl.getPrimerApellido());
        ps.setString(6, cl.getSegundoApellido());
        ps.setDate(7, new java.sql.Date(cl.getFechaNacimiento().getYear(),cl.getFechaNacimiento().getMonth(),cl.getFechaNacimiento().getDay()));
        ps.setString(8, cl.getSexo());
        ps.setString(9, cl.getDireccion());
        ps.setString(10, cl.getCelular());
        ps.setString(11, cl.getCorreo());
        ps.setString(12, cl.getPassword());
        ps.setInt(13, cl.getCodigoPaisId());
        ps.setString(14, cl.getEstado());
        ps.setInt(15, cl.getClienteId());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            id = rs.getInt(1);
        }
        rs.close();
        ps.close();
        con.close();
        return id;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public Clientes getClientes(int id) throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        String sqlQuery = " Select tipoIdentificacion,numeroIdentificacion,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,sexo,direccion,celular,correo,password,codigoPaisId,estado,clienteId from  Clientes where id = ? ";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Clientes cl = new Clientes();
        while (rs.next()) {
            cl.setId(rs.getInt("id"));
            cl.setTipoIdentificacion(rs.getString("tipoIdentificacion"));
            cl.setNumeroIdentificacion(rs.getString("numeroIdentificacion"));
            cl.setPrimerNombre(rs.getString("primerNombre"));
            cl.setSegundoNombre(rs.getString("segundoNombre"));
            cl.setPrimerApellido(rs.getString("primerApellido"));
            cl.setSegundoApellido(rs.getString("segundoApellido"));
            cl.setFechaNacimiento(rs.getDate("fechaNacimiento"));
            cl.setSexo(rs.getString("sexo"));
            cl.setDireccion(rs.getString("direccion"));
            cl.setCelular(rs.getString("celular"));
            cl.setCorreo(rs.getString("correo"));
            cl.setPassword(rs.getString("password"));
            cl.setCodigoPaisId(rs.getInt("codigoPaisId"));
            cl.setEstado(rs.getString("estado"));
            cl.setClienteId(rs.getInt("clienteId"));
        }
        rs.close();
        ps.close();
        con.close();
        return cl;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public List<Clientes> getListClientes() throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        String sqlQuery = " Select id,tipoIdentificacion,numeroIdentificacion,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,sexo,direccion,celular,correo,password,codigoPaisId,estado,clienteId from  Clientes";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ResultSet rs = ps.executeQuery();
        List<Clientes> lstcl = new LinkedList<Clientes>();
        while (rs.next()) {
            Clientes cl = new Clientes();
            cl.setId(rs.getInt("id"));
            cl.setTipoIdentificacion(rs.getString("tipoIdentificacion"));
            cl.setNumeroIdentificacion(rs.getString("numeroIdentificacion"));
            cl.setPrimerNombre(rs.getString("primerNombre"));
            cl.setSegundoNombre(rs.getString("segundoNombre"));
            cl.setPrimerApellido(rs.getString("primerApellido"));
            cl.setSegundoApellido(rs.getString("segundoApellido"));
            cl.setFechaNacimiento(rs.getDate("fechaNacimiento"));
            cl.setSexo(rs.getString("sexo"));
            cl.setDireccion(rs.getString("direccion"));
            cl.setCelular(rs.getString("celular"));
            cl.setCorreo(rs.getString("correo"));
            cl.setPassword(rs.getString("password"));
            cl.setCodigoPaisId(rs.getInt("codigoPaisId"));
            cl.setEstado(rs.getString("estado"));
            cl.setClienteId(rs.getInt("clienteId"));
            lstcl.add(cl);
        }
        rs.close();
        ps.close();
        con.close();
        return lstcl;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public void updateClientes(Clientes cl) throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        String sqlQuery = "update Clientes set tipoIdentificacion = ?,numeroIdentificacion = ?,primerNombre = ?,segundoNombre = ?,primerApellido = ?,segundoApellido = ?,fechaNacimiento = ?,sexo = ?,direccion = ?,celular = ?,correo = ?,password = ?,codigoPaisId = ?,estado = ?,clienteId = ? where id = ? ";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        
        ps.setString(1, cl.getTipoIdentificacion());
        ps.setString(2, cl.getNumeroIdentificacion());
        ps.setString(3, cl.getPrimerNombre());
        ps.setString(4, cl.getSegundoNombre());
        ps.setString(5, cl.getPrimerApellido());
        ps.setString(6, cl.getSegundoApellido());
        ps.setDate(7, new java.sql.Date(cl.getFechaNacimiento().getYear(),cl.getFechaNacimiento().getMonth(),cl.getFechaNacimiento().getDay()));
        ps.setString(8, cl.getSexo());
        ps.setString(9, cl.getDireccion());
        ps.setString(10, cl.getCelular());
        ps.setString(11, cl.getCorreo());
        ps.setString(12, cl.getPassword());
        ps.setInt(13, cl.getCodigoPaisId());
        ps.setString(14, cl.getEstado());
        ps.setInt(15, cl.getClienteId());
        ps.setInt(16, cl.getId());
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public void activarClientes(Clientes cl, int idUsuario) {

    }

    public void desactivarClientes(Clientes cl, int idUsuario) {

    }
}
