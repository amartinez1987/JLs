/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesRest;

import Dao.DaoClientes;
import Model.ClientesModel;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author AnibalGuillermo
 */
@Path("Clientes")
public class Clientes {

    @GET
    @Path("/getClientes")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientesModel getClientes(@QueryParam("id") int id) {
        DaoClientes dcp = new DaoClientes();
        ClientesModel cpm = null;
        try {
            cpm = new ClientesModel(dcp.getClientes(id));
        } catch (SQLException sqlEx) {
            cpm.setErrorRegistro(sqlEx.getMessage());
        } catch (ClassNotFoundException CNFEx) {
            cpm.setErrorRegistro(CNFEx.getMessage());
        }
        return cpm;
    }

    @POST
    @Path("/addClientes")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientesModel addClientes(ClientesModel model ) {   
        DaoClientes dcp = new DaoClientes();

        /*try {
           model.setId(dcp.insertClientes(model.getModel()));
        } catch (SQLException sqlEx) {
            model.setErrorRegistro(sqlEx.getMessage());
        } catch (ClassNotFoundException CNFEx) {
            model.setErrorRegistro(CNFEx.getMessage());
        } catch (Exception ex) {
            model.setErrorRegistro(ex.getMessage());
        }*/
        return model;
    }

    @POST
    @Path("/updateClientes")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientesModel updateClientes(ClientesModel model) {
        DaoClientes dcp = new DaoClientes();

        try {
            dcp.updateClientes(model.getModel());
        } catch (SQLException sqlEx) {
            model.setErrorRegistro(sqlEx.getMessage());
        } catch (ClassNotFoundException CNFEx) {
            model.setErrorRegistro(CNFEx.getMessage());
        } catch (Exception ex) {
            model.setErrorRegistro(ex.getMessage());
        }
        return model;
    }

    @GET
    @Path("/getListaClientes")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public List<ClientesModel> getListaClientes() {
        DaoClientes dcp = new DaoClientes();
        List<ClientesModel> lstClientesModel = new LinkedList<ClientesModel>();        
        try {
            List<Model.Clientes> lstCodigoPais = dcp.getListClientes();
            
            for (Iterator<Model.Clientes> cpi = lstCodigoPais.iterator(); cpi.hasNext();) {
               lstClientesModel.add( new ClientesModel(cpi.next()));
             
            }
        } catch (SQLException | ClassNotFoundException sqlEx) {
           
        }
        return lstClientesModel;
    }
}
