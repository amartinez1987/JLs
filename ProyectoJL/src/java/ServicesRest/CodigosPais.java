package ServicesRest;

import Dao.DaoCodigosPais;
import Model.CodigosPaisModel;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
        

/**
 *
 * @author AnibalGuillermo
 */

@Path("CodigosPais")
public class CodigosPais {

    @GET
    @Path("/getCodigosPais")
    @Produces(MediaType.APPLICATION_JSON)    
    public CodigosPaisModel getCodigosPais(@QueryParam("id") int id) {
        DaoCodigosPais dcp = new DaoCodigosPais();
        CodigosPaisModel cpm = new CodigosPaisModel();
        try {
            cpm = new CodigosPaisModel(dcp.getCodigosPais(id));
        } catch (SQLException | ClassNotFoundException sqlEx) {
            cpm.setErrorRegistro(sqlEx.getMessage());
        }
        return cpm;
    }

    @POST
    @Path("/addCodigosPais")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CodigosPaisModel addCodigosPais(CodigosPaisModel model) {
        DaoCodigosPais dcp = new DaoCodigosPais();

        try {
            model.setId(dcp.insertCodigosPais(model.getModel()));
        } 
        catch (SQLException sqlEx)
        {
            model.setErrorRegistro(sqlEx.getMessage());
        }
        catch (ClassNotFoundException CNFEx) 
        {
            model.setErrorRegistro(CNFEx.getMessage());
        }
        catch( Exception ex )
        {
            model.setErrorRegistro(ex.getMessage());
        }
        return model;
    }
    
      @POST
    @Path("/updateCodigosPais")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CodigosPaisModel updateCodigosPais(CodigosPaisModel model) {
        DaoCodigosPais dcp = new DaoCodigosPais();

        try {
          dcp.updateCodigosPais(model.getModel());
        } 
        catch (SQLException sqlEx)
        {
            model.setErrorRegistro(sqlEx.getMessage());
        }
        catch (ClassNotFoundException CNFEx) 
        {
            model.setErrorRegistro(CNFEx.getMessage());
        }
        catch( Exception ex )
        {
            model.setErrorRegistro(ex.getMessage());
        }
        return model;
    }
    
    
    @GET
    @Path("/getCodigosPaises")    
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})    
    public  List<CodigosPaisModel> getCodigosPaises() 
    {   
        DaoCodigosPais dcp = new DaoCodigosPais();        
        List<CodigosPaisModel> lstCodigoPaisModel = new LinkedList<CodigosPaisModel>();
        
        try {
            List<Model.CodigosPais> lstCodigoPais = dcp.getListCodigosPais();
            
            for (Iterator<Model.CodigosPais> cpi = lstCodigoPais.iterator(); cpi.hasNext();) 
            {
              lstCodigoPaisModel.add(  new CodigosPaisModel(cpi.next()));  
            }
        } catch (SQLException | ClassNotFoundException sqlEx) {
           
        }
        return lstCodigoPaisModel;        
    }
}
