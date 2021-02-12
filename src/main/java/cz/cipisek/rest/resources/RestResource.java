package cz.cipisek.rest.resources;


import cz.cipisek.rest.managers.RestManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("rest")
@Produces(MediaType.APPLICATION_JSON)
public class RestResource {


    @Inject
    private RestManager restManager;

    @GET
    public Object getZviratko() {
        return Response.ok(RestManager.getZviratko);
    }


    @DELETE
    public void deleteZviratko() {
        restManager.deleteZviratko();
    }

    @GET
    public void getInZviratko(@PathParam("number") Integer cislo) {
        restManager.getInZviratko();
    }

    @POST
    public void noveZviratko(@FormParam("nazev") String nazev, @FormParam("vek") String vek) {
        restManager.noveZviratko();
    }
    @PUT
    public void zmenitZviratko(@PathParam("number") Integer number,@FormParam("nazev") String nazev ,@FormParam("vek") String vek){
        restManager.zmenitZviratko();
    }
}
