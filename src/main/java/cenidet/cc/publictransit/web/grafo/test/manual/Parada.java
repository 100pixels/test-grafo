package cenidet.cc.publictransit.web.grafo.test.manual;

import java.util.ArrayList;

public class Parada {
	
	private int id;
	private double latitud;
	private double longitud;
	//private int idSigParada;
	private double distancia;
	private Parada sigParada;
	private ArrayList<Parada> paradasDestino;
				
	public Parada(int id, double latitud, double longitud/*, int idSigParada*/, double distancia) {
		super();
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
		//this.idSigParada = idSigParada;
		this.distancia = distancia;
		this.paradasDestino = new ArrayList<Parada>();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
			
	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/*
	public int getIdSigParada() {
		return idSigParada;
	}
	
	public void setIdSigParada(int idSigParada) {
		this.idSigParada = idSigParada;
	}
	*/
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	/*
	public Parada getSigParada() {
		return paradasDestino.get(0);
	}
	*/

	public void setSigParada(Parada sigParada) {
		paradasDestino.add(sigParada);
	}
		
	public ArrayList<Parada> getParadasDestino() {
		return paradasDestino;
	}

	public void setParadasDestino(ArrayList<Parada> paradasDestino) {
		this.paradasDestino = paradasDestino;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Parada){
			Parada aux = (Parada)obj;
			return ((this.latitud == aux.getLatitud()) && (this.longitud == aux.getLongitud()));
		}
		return false;
	}

	@Override
	public String toString() {
		String sigParada = (this.sigParada == null)?"null": Integer.toString(this.sigParada.getId());		
		return  "Parada [id=" + id + ", latitud=" + latitud + ", longitud=" + longitud 
				+ ", distancia=" + distancia + " sig= "+ sigParada + "]";				
	}


	
	

}
