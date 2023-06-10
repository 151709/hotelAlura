package Controlador;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import DAO.HuespedesDAO;
import Factory.ConexionBase;
import Modelo.Huespedes;

public class HuespedesControlador {
	
 private HuespedesDAO huespedDao;
	 
	 public HuespedesControlador() {
			Connection con = new ConexionBase().conectarBase();
			this.huespedDao = new HuespedesDAO(con);
		}
	 
		public void guardar(Huespedes huespedes) {
			this.huespedDao.guardar(huespedes);
		}
		public List<Huespedes> mostrarHuesppedes() {
			return this.huespedDao.mostrar();
		}
		public List<Huespedes> buscarHuesppedes(String id) {
			return this.huespedDao.buscarId(id);
		}
		
		public void actualizar(String nombre, String apellido, LocalDate fechaN, String nacionalidad, String telefono, Integer idReserva, Integer id) {
			this.huespedDao.Actualizar(nombre, apellido, fechaN, nacionalidad, telefono, idReserva, id);
		}
		
		public void Eliminar(Integer id) {
			this.huespedDao.Eliminar(id);
		}

}
