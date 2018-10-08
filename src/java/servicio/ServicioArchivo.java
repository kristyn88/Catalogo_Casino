package servicio;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class ServicioArchivo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msj = request.getParameter("observaciones");
        // Verifica que la petición (request) pueda contener un archivo.
        
        if (!ServletFileUpload.isMultipartContent(request)) {
            request.setAttribute("mensaje",
                    "La petición no está codificada con 'enctype=multipart/form-data'.");
        } else {
            
            
            // request.setAttribute("mensaje",
            //         "El manejo del archivo no está implementado.");

            DiskFileItemFactory f = new DiskFileItemFactory();

            // Establece la cantidad máxima de memoria a utilizar. Cuando se excede
            // este valor, los archivos se guardarán temporalmente en el disco.
            
            f.setSizeThreshold(MAX_MEMORIA);

            // Establece el directorio de trabajo para los archivos recibidos.
            // En este caso, se usa el directorio temporal definido por Java.
            
            f.setRepository(new File(System.getProperty("java.io.tmpdir")));

            ServletFileUpload cargador = new ServletFileUpload(f);

            // Establece el tamaño máximo de los archivos que se pueden cargar.
            
            cargador.setFileSizeMax(MAX_ARCHIVO);

            // Establece el tamaño máximo de una petición, esto es:
            // el tamaño de los archivos y los datos que son ingresados
            // en el formulario.
            
            cargador.setSizeMax(MAX_PETICION);

            // El directorio para guardar los archivos recibidos por el
            // Servlet es relativo al directorio de la aplicación.
            // Es posible que la aplicación no tenga los permisos necesarios
            // para acceder al directorio. Es responsabilidad de la aplicación
            // determinar la ruta correcta.
            // Observe que al ejecutar la aplicación desde el IDE, el directorio
            // de la aplicación es accesible, en la carpeta 'build/web'.
            // Sin embargo, cuando se instala la aplicación en un entorno de
            // producción, es posible que no exista un acceso válido al directorio.}
            
            String rutaDescarga = getServletContext().getRealPath("") + File.separator + DIRECTORIO;
            File directorioDescarga = new File(rutaDescarga);
            if (!directorioDescarga.exists()) {
                directorioDescarga.mkdir();
            }

            try {
                @SuppressWarnings("unchecked")
                List<FileItem> formItems = cargador.parseRequest(request);

                if (formItems != null && formItems.size() > 0) {
                    for (FileItem item : formItems) {
                        if (!item.isFormField()) {

                            
                            String nombreArchivo = new File(item.getName()).getName();
                            if (nombreArchivo.isEmpty()) {
                                request.setAttribute("mensaje",
                                        "Se omitió la selección del archivo.");
                                break;
                            }

                            // El Servlet utiliza el nombre original del archivo para
                            // guardarlo en el directorio indicado.
                            // Dependiendo de la funcionalidad provista por la aplicación,
                            // es posible que se deba construir un nombre convencional para
                            // el archivo o, incluso, utilizar un sistema de directorios
                            // más complejo.
                            
                            String rutaArchivo = rutaDescarga + File.separator + nombreArchivo;
                            System.out.printf("Guardando archivo en: '%s'..%n", rutaArchivo);
                            File archivo = new File(rutaArchivo);

                            item.write(archivo);
                            request.setAttribute("mensaje",
                                    String.format("El archivo '%s' fue cargado con éxito.", nombreArchivo));
                        } else {
                            
                            // El item es un item del formulario.
                            
                            String nombre = item.getFieldName();
                            String valor = item.getString();
                            
                            // Como no hay ningún comportamiento definido para los campos del
                            // formulario, simplemente se muestra el valor del campo en la consola
                            // del servidor.
                            request.setAttribute("mensaje2",
                                    String.format("El archivo '%s' fue cargado con éxito.", valor));
                            System.out.printf("Parámetro: '%s'='%s'%n", nombre, valor);
                        }
                    }
                }
            } catch (Exception ex) {
                request.setAttribute("mensaje",
                        String.format("Ocurrió una excepción: '%s'", ex.getMessage()));
            }
        }

        // Responde con la página de resultados, enviando también el cuerpo
        // de la petición y la respuesta.
        // El atributo 'mensaje' contiene cualquier mensaje generado desde el Servlet.
        
        getServletContext().getRequestDispatcher("/Imagen_Producto.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        throw new ServletException("Los datos no pueden recibirse via GET.");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private static final String DIRECTORIO = "directorio";

    private static final int MAX_MEMORIA = 1024 * 1024 * 4;  // 4MB
    private static final int MAX_ARCHIVO = 1024 * 1024 * 20; // 20MB
    private static final int MAX_PETICION = 1024 * 1024 * 24; // 24MB

}
