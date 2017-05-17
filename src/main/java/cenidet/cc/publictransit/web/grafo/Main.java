package cenidet.cc.publictransit.web.grafo;

public class Main {
	
	public static void main(String[] args) {
		
		String[] vertices ={"Alicante","Barcelona","Cartagena","Murcia","Reus"};
		
		GrafoMatriz grafo = new GrafoMatriz(5);
		
		grafo.agregarVertice(vertices[0]);
		grafo.agregarVertice(vertices[1]);
		grafo.agregarVertice(vertices[2]);
		grafo.agregarVertice(vertices[3]);
		grafo.agregarVertice(vertices[4]);
		
		try {
			// ALicante ->
			grafo.agregarArco(vertices[0], vertices[2]);
			grafo.agregarArco(vertices[0], vertices[3]);			
			
			// Barcelona ->
			grafo.agregarArco(vertices[1], vertices[2]);
			grafo.agregarArco(vertices[1], vertices[3]);
			grafo.agregarArco(vertices[1], vertices[4]);
			
			//Catagena -> 
			grafo.agregarArco(vertices[2], vertices[0]);
			
			// Murcia -> 
			grafo.agregarArco(vertices[3], vertices[1]);
			
			// Reus -> 
			grafo.agregarArco(vertices[4], vertices[1]);
			
		} catch (Exception e) {		 
			e.printStackTrace();
		}
		
		
		System.out.println(grafo.toString());
		
		
		
		
	}

}
