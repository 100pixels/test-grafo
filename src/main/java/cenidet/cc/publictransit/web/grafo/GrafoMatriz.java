package cenidet.cc.publictransit.web.grafo;

public class GrafoMatriz {

	private final static int NUM_VERTICES_DEFAULT = 20;
	private int numeroVertices;
	private Vertice[] vertices;
	private int matrizAdyacencia[][];

	public GrafoMatriz() {
		this(NUM_VERTICES_DEFAULT);
	}

	public GrafoMatriz(int numVertices) {
		matrizAdyacencia = new int[numVertices][numVertices];
		vertices = new Vertice[numVertices];
		for (int x = 0; x < numeroVertices; x++) {
			for (int y = 0; y < numeroVertices; y++) {
				matrizAdyacencia[x][y] = 0;
			}
		}
		this.numeroVertices = 0;
	}

	public void agregarVertice(String nombre) {
		boolean existe = buscarVertice(nombre) > 0;
		if (!existe) {
			Vertice v = new Vertice(nombre);
			v.asigVert(numeroVertices);
			vertices[numeroVertices++] = v;
		}
	}

	public void agregarArco(String verticeA, String verticeB) throws Exception {
		int va = buscarVertice(verticeA);
		int vb = buscarVertice(verticeB);

		if (va < 0 || vb < 0)
			throw new Exception("Vértice no existe");
		matrizAdyacencia[va][vb] = 1;
	}

	public void agregarArco(int verticeA, int verticeB) throws Exception {
		if (verticeA < 0 || verticeB < 0)
			throw new Exception("Vértice no existe");
		matrizAdyacencia[verticeA][verticeB] = 1;
	}

	public boolean adyacente(String verticeA, String verticeB) throws Exception {
		int va, vb;
		va = buscarVertice(verticeA);
		vb = buscarVertice(verticeB);
		if (va < 0 || vb < 0)
			throw new Exception("Vértice no existe");
		return matrizAdyacencia[va][vb] == 1;
	}

	public boolean adyacente(int va, int vb) throws Exception {
		if (va < 0 || vb < 0)
			throw new Exception("Vértice no existe");
		return matrizAdyacencia[va][vb] == 1;
	}

	private int buscarVertice(String nombre) {
		Vertice v = new Vertice(nombre);
		boolean encontrado = false;
		int i = 0;
		for (; (i < numeroVertices) && !encontrado;) {
			encontrado = vertices[i].equals(v);
			if (!encontrado)
				i++;
		}
		return (i < numeroVertices) ? i : -1;
	}

	@Override
	public String toString() {
		String output ="";
		
		for (int i = 0; i < vertices.length; i++) {
			output += vertices[i]+",";
		}		
		output+="\n";
		
		for (int x = 0; x < matrizAdyacencia.length; x++) {
			for (int y = 0; y < matrizAdyacencia.length; y++) {
				output+= matrizAdyacencia[x][y]+",";
			}
			output+="\n";
		}
		
		return output;
	}
	
	

}
