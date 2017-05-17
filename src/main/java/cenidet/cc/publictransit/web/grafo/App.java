package cenidet.cc.publictransit.web.grafo;

public class App {
	
	public static void main(String[] args) {	
		
		GrafMatPeso grafo = new GrafMatPeso(4);
		String[] nombres={"A","B","C","D"};		
		
		grafo.nuevoVertice(new Vertice(nombres[0]));
		grafo.nuevoVertice(new Vertice(nombres[1]));
		grafo.nuevoVertice(new Vertice(nombres[2]));
		grafo.nuevoVertice(new Vertice(nombres[3]));
			
		// Arcos con origen en A
		grafo.nuevoArco(new Vertice(nombres[0]), new Vertice(nombres[1]), 6);
		grafo.nuevoArco(new Vertice(nombres[0]), new Vertice(nombres[2]), 8);		
		// Arcos con origen en B
		grafo.nuevoArco(new Vertice(nombres[1]), new Vertice(nombres[3]), 4);
		grafo.nuevoArco(new Vertice(nombres[1]), new Vertice(nombres[2]), 1);
		// Arcos con origen en C
		grafo.nuevoArco(new Vertice(nombres[2]), new Vertice(nombres[3]), 3);				
		// Arcos con origen en D
		
		CaminoMinimo camino = new CaminoMinimo(grafo, 0);
		camino.caminoMinimos();
		camino.recuperaCamino(3);
		
	}
	//v1 -> V4 -> V5 -> V3
	
}
