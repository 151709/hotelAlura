package Controlador;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import DAO.ReservasDAO;
import Factory.ConexionBase;
import Modelo.Reservas;

public class ReservasControlador {
	
	private ReservasDAO reservaD;
	
	
	 

public ReservasControlador() {
	Connection con = new ConexionBase().conectarBase();
		this.reservaD = new ReservasDAO(con);
	}
	 
	public void guardar(Reservas reserva) {
		this.reservaD.guardar(reserva);
	}
	
	public List<Reservas> mostrar(){
		return this.reservaD.mostrar();
	}
			
	public List<Reservas> buscar(String id) {
		return this.reservaD.buscarId(id);
	}

		
	public void actualizarReserva(LocalDate dataE, LocalDate dataS, String valor, String formaPago, Integer id) {
		this.reservaD.Actualizar(dataE, dataS, valor, formaPago, id);
	}
		
	public void Eliminar(Integer id) {
		this.reservaD.Eliminar(id);
	}

}
