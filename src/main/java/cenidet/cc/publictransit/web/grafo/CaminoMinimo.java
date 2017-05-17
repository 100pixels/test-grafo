package cenidet.cc.publictransit.web.grafo;

public class CaminoMinimo {
	
	private int[][] matrizPesos;
	private int[] ultimo;
	private int[] D;
	private boolean[] F;
	private int origen, numVertices; // vértice origen y número de vértices

	public CaminoMinimo(GrafMatPeso gp, int origen) {
		numVertices = gp.numeroDeVertices();
		this.origen = origen;
		matrizPesos = gp.getMatPeso();
		ultimo = new int[numVertices];
		D = new int[numVertices];
		F = new boolean[numVertices];
	}

	public void caminoMinimos() {
		// valores iniciales
		for (int i = 0; i < numVertices; i++) {
			F[i] = false;
			D[i] = matrizPesos[origen][i];
			ultimo[i] = origen;	
		}

		F[origen] = true;
		D[origen] = 0;
		
		// Pasos para marcar los n-1 vértices
		for (int i = 1; i < numVertices; i++) {
			int v = minimo(); //regresa la posicion en el array del vértice no marcado de menor distancia			
			F[v] = true; // Se marca la posicion del vertice en el array
			
			// actualiza distancia de vértices no marcados
			for (int w = 1; w < numVertices; w++){
				if (!F[w]){
					int dv = D[v];
					int mPvw = matrizPesos[v][w];
					int dw = D[w];
					
					if ( (dv + mPvw) < dw) {
							D[w] = D[v] + matrizPesos[v][w];
							ultimo[w] = v;
					}
				}				
			}
		}
	}

	private int minimo() {
		int distanciaMinima = GrafMatPeso.INFINITO;
		int indice = 1;
		
		for (int j = 1; j < numVertices; j++){
			if (!F[j] && (D[j] <= distanciaMinima)) {
				distanciaMinima = D[j];
				indice = j;
			}			
		}
		return indice;
	}

	public void recuperaCamino(int v) {
		int anterior = ultimo[v];
		if (v != origen) {
			recuperaCamino(anterior); // vuelve al último del último
			System.out.print(" -> V" + v);
		} else
			System.out.print("v" + origen);
	}
	
	private  String imprimirArreglo(int[] arreglo){
		StringBuffer salida= new StringBuffer("[ ");
		for (int i = 0; i < arreglo.length; i++) {
			salida.append(arreglo[i]);
			if(i != arreglo.length -1 ){
				salida.append(", ");
			}
		}
		salida.append(" ]");
		return salida.toString();
	}
	
	private  String imprimirArreglo(boolean[] arreglo){
		StringBuffer salida= new StringBuffer("[ ");
		for (int i = 0; i < arreglo.length; i++) {
			salida.append(arreglo[i]);
			if(i != arreglo.length -1 ){
				salida.append(", ");
			}
		}
		salida.append(" ]");
		return salida.toString();
	}
	
}
