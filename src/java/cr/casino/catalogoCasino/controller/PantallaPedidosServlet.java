/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.casino.catalogoCasino.controller;

import com.google.gson.Gson;
import cr.casino.catalogoCasino.bl.impl.BdcAgenteBL;
import cr.casino.catalogoCasino.bl.impl.BdcProductoBL;
import cr.casino.catalogoCasino.domain.BdcAgente;
import cr.casino.catalogoCasino.domain.BdcProducto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nayib
 */
public class PantallaPedidosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String json;
            BdcProducto p = new BdcProducto();
            BdcProductoBL pBL = new BdcProductoBL();
            BdcAgenteBL aBL = new BdcAgenteBL();

            String accion = request.getParameter("accion");
            switch (accion) {
                case "consultarProductos":
                    String categoria = request.getParameter("categoria");
                    String txtBusqueda = request.getParameter("txtBusqueda");
                    String opcionBusqueda = request.getParameter("opcionBusqueda");
                    List<BdcProducto> listP = pBL.findAll(BdcProducto.class.getName());
                    List<BdcProducto> listaEnviar = new ArrayList();
                    for(BdcProducto pr:listP){
                        if(pr.getCategoria().equals(categoria)){
                            if(!txtBusqueda.equals("")){
                                if(opcionBusqueda.equals("codigo")&&pr.getCodigo().contains(txtBusqueda)){listaEnviar.add(pr);}
                                if(opcionBusqueda.equals("nombre")&&pr.getDescripcion().contains(txtBusqueda)){listaEnviar.add(pr);}
                            }else{
                                listaEnviar.add(pr);
                            }
                        }
                    }
                    json = new Gson().toJson(listaEnviar);
                    out.print(json);
                    break;
                case "eliminarProducto":
                    p.setCodigo(request.getParameter("id"));
                    pBL.delete(p);
                    out.print("El producto fue eliminada correctamente");
                    break;
                case "consultarProductoByID":
                    p = pBL.findById(request.getParameter("id"));
                    json = new Gson().toJson(p);
                    out.print(json);
                    break;
                case "agregarProducto":
                case "modificarProducto":
                    /*u.setIdUsuario(Integer.parseInt(request.getParameter("id")));
                    u.setTipoUsuario("Admin");
                    u.setPassword(request.getParameter("clave"));

                    if (accion.equals("agregarAdmin")) {
                        uBL.save(u);
                        //Se imprime la respuesta con el response
                        out.print("C~El Admin fue ingresado correctamente");
                    } else {//es modificar admin
                        //Se guarda el objeto
                        uBL.merge(u);
                        //Se imprime la respuesta con el response
                        out.print("C~El Admin fue modificado correctamente");
                    }
                    break;*/
                default:
                    out.print("E~No se indico la acción que se desea realizare");
                    break;
            }
        } catch (NumberFormatException e) {
            out.print("E~" + e.getMessage());
        } catch (Exception e) {
            out.print("E~" + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
