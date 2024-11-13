package Clases;

import service.TipoUvaService;

import java.util.ArrayList;

public class Varietal {

	//ATRIBUTOS
	private Integer Id;
	private String descripcion;
	private Double porcentajeComposicion;
	private TipoUva tipoUva;

	TipoUvaService tipoUvaService = new TipoUvaService();

	//CONSTRUCTOR
	public Varietal(String descripcion, Double porcentajeComposicion, TipoUva tipoUva) {
		this.descripcion = descripcion;
		this.porcentajeComposicion = porcentajeComposicion;
		this.tipoUva = tipoUva;
	}

	public Varietal() {
	}

	public Varietal(Varietal varietal, Boolean crearTipoUva){
		this.descripcion = varietal.getDescripcion();
		this.porcentajeComposicion = varietal.getPorcentajeComposicion();
		if (!crearTipoUva){
			System.out.println("---XXXXX-------------------------------------");
			System.out.println(varietal.getTipoUva().getNombre());
			TipoUva uvaNew = new TipoUva(varietal.getTipoUva().getNombre(), varietal.getTipoUva().getDescripcion());
			System.out.println("tengo valor de nombre de uba en marietal y es:" + uvaNew.getNombre());
			this.tipoUva = uvaNew;

			System.out.println("/////////////////////////////////////////////");
			System.out.println("EEEENTRO DESPUES DE CREAR OBJETO UVA ");
			/////////////////////////////////////////////////////////////////
			//guargar uva en la base de datos hacelo abi

			tipoUvaService.insertarTipoUva(uvaNew.getNombre(),uvaNew.getDescripcion());
			System.out.println("----------------------------------------");
			System.out.println(uvaNew.getNombre());
			System.out.println(uvaNew.getDescripcion());
			System.out.println("----------------------------------------");
		}else {
			this.tipoUva = varietal.getTipoUva();
		}
	}

	//METODOS
	public void conocerTiposUva() {
	}

	public void esDeTipoUva() {
	}

	public void mostrarPorcentaje() {

	}


	//GETTERS Y SETTERS
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPorcentajeComposicion() {
		return porcentajeComposicion;
	}

	public void setPorcentajeComposicion(Double porcentajeComposicion) {
		this.porcentajeComposicion = porcentajeComposicion;
	}

	public TipoUva getTipoUva() {
		return tipoUva;
	}

	public void setTipoUva(TipoUva tipoUva) {
		this.tipoUva = tipoUva;
	}
}