package cenidet.cc.publictransit.web.grafo;

public class Vertice {
	
	private String nombre;
	private int numVertice;
			
	public Vertice(String x) {
		super();
		this.nombre = x;
		this.numVertice = -1;
	}
	
	public String nomVertice() {
		return nombre;
	}

	public void asigVert(int n) {
		this.numVertice = n;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vertice){
			Vertice aux = (Vertice)obj;
			return this.nombre.equals(aux.nomVertice());
		}
		return false;
	}

	@Override
	public String toString() {
		return nombre + "("+numVertice+")";
	}
			
}
