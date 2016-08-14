package Dao;

import Model.CodigosPais;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DaoCodigosPais {

    @SuppressWarnings("ConvertToTryWithResources")
    public int insertCodigosPais(CodigosPais co) throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        int id = 0;
        String sqlQuery = " insert into CodigosPais(contiene,imageicon,nombre,iso2,iso3,cia,telefono,internet,vehiculo,estado,clienteId) Values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(0, co.getId());
        ps.setString(1, co.getContiene());
        ps.setString(2, co.getImageicon());
        ps.setString(3, co.getNombre());
        ps.setString(4, co.getIso2());
        ps.setString(5, co.getIso3());
        ps.setString(6, co.getCia());
        ps.setString(7, co.getTelefono());
        ps.setString(8, co.getInternet());
        ps.setString(9, co.getVehiculo());
        ps.setString(10, co.getEstado());
        ps.setInt(11, co.getClienteId());
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
    public CodigosPais getCodigosPais(int id) throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        String sqlQuery = " Select id,contiene,imageicon,nombre,iso2,iso3,cia,telefono,internet,vehiculo,estado,clienteId from  CodigosPais where id = ? ";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        CodigosPais co = new CodigosPais();
        while (rs.next()) {
            co.setId(rs.getInt("id"));
            co.setContiene(rs.getString("contiene"));
            co.setImageicon(rs.getString("imageicon"));
            co.setNombre(rs.getString("nombre"));
            co.setIso2(rs.getString("iso2"));
            co.setIso3(rs.getString("iso3"));
            co.setCia(rs.getString("cia"));
            co.setTelefono(rs.getString("telefono"));
            co.setInternet(rs.getString("internet"));
            co.setVehiculo(rs.getString("vehiculo"));
            co.setEstado(rs.getString("estado"));
            co.setClienteId(rs.getInt("clienteId"));
        }
        rs.close();
        ps.close();
        con.close();
        return co;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public List<CodigosPais> getListCodigosPais() throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        String sqlQuery = " Select id,contiene,imageicon,nombre,iso2,iso3,cia,telefono,internet,vehiculo,estado,clienteId from CodigosPais ";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ResultSet rs = ps.executeQuery();
        List<CodigosPais> lstco = new LinkedList<CodigosPais>();
        while (rs.next()) {
            CodigosPais co = new CodigosPais();
            co.setId(rs.getInt("id"));
            co.setContiene(rs.getString("contiene"));
            co.setImageicon(rs.getString("imageicon"));
            co.setNombre(rs.getString("nombre"));
            co.setIso2(rs.getString("iso2"));
            co.setIso3(rs.getString("iso3"));
            co.setCia(rs.getString("cia"));
            co.setTelefono(rs.getString("telefono"));
            co.setInternet(rs.getString("internet"));
            co.setVehiculo(rs.getString("vehiculo"));
            co.setEstado(rs.getString("estado"));
            co.setClienteId(rs.getInt("clienteId"));
            lstco.add(co);
        }
        rs.close();
        ps.close();
        con.close();
        return lstco;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public void updateCodigosPais(CodigosPais co) throws ClassNotFoundException, SQLException {
        Connection con = (Connection) ConnetorBD.getDriverManagerConnection();
        String sqlQuery = "update CodigosPais set contiene = ?,imageicon = ?,nombre = ?,iso2 = ?,iso3 = ?,cia = ?,telefono = ?,internet = ?,vehiculo = ?,estado = ?,clienteId = ? where id = ? ";
        PreparedStatement ps = con.prepareStatement(sqlQuery);        
        ps.setString(1, co.getContiene());
        ps.setString(2, co.getImageicon());
        ps.setString(3, co.getNombre());
        ps.setString(4, co.getIso2());
        ps.setString(5, co.getIso3());
        ps.setString(6, co.getCia());
        ps.setString(7, co.getTelefono());
        ps.setString(8, co.getInternet());
        ps.setString(9, co.getVehiculo());
        ps.setString(10, co.getEstado());
        ps.setInt(11, co.getClienteId());
        ps.setInt(12, co.getId());
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public void activarCodigosPais(CodigosPais co, int idUsuario) {

    }

    public void desactivarCodigosPais(CodigosPais co, int idUsuario) {

    }
}
