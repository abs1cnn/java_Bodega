package Boundarys;

import java.util.ArrayList;

public class InterfazNotificacion {

	private Object novedadesVinoParaBodega;


	public Object getNovedadesVinoParaBodega() {
		return novedadesVinoParaBodega;
	}


	public void setNovedadesVinoParaBodega(Object novedadesVinoParaBodega) {
		this.novedadesVinoParaBodega = novedadesVinoParaBodega;
	}


	public void notificarNovedadVino(ArrayList<String> nombresDeUsuariosSeguidores, String bodega) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Envio de notificaciones de la bodega:" + bodega);
		for (String usuario : nombresDeUsuariosSeguidores) {
			System.out.println("Se le envio la notificacion al usuario: " + usuario);
		}
	}
}