import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
public class Persona extends PersonaApp.PersonaPOA {
    
    private ORB orb;
    Conexion conex = new Conexion();
    
    @Override
    public boolean insertarPersona(int id, String nombre, String apellido, String telefono, String direccion, int identificacion) {
       
        boolean resultado = false;
        try {
            String query = "insert into persona (id, nombre, apellido, telefono, direccion, identificacion)" + "values ('"+id+"','"+nombre+"','"+apellido+"','"+telefono+"','"+direccion+"','"+identificacion+"')";
            
             conex.conexion();
             Statement st = conex.conex.createStatement();
             int valor = st.executeUpdate(query);
             if(valor > 0) {
                 resultado = true;
                 JOptionPane.showMessageDialog(null, "dato insertado");
             }
             //cerramos los recursos
             st.close();
             conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public String consultarPersona(int identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(int identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPersona(int id, String nombre, String apellido, String telefono, String direccion, int identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
