package cenidet.cc.publictransit.web.grafo.test.manual;

import java.util.ArrayList;

public class MainTest {
	
	public static void main(String[] args) {		
		
		/*
		ArrayList<Parada> ruta1 = getParadasRuta1();
		ArrayList<Parada> ruta2 = getParadasRuta2();
		ArrayList<Parada> ruta3 = getParadasRuta3();
		//*/		
		
		//@SuppressWarnings("unchecked")
		/*
		ArrayList<Parada> verticesGrafo = getVerticesGrafo2(ruta1, ruta2, ruta3);
		//*/
		
		/*
		for(Parada parada: verticesGrafo){
			System.out.println(parada);
		}
		//*/			
		
		/*
		double[][]  matrizAdyacencia = getMatrizAdyacencia(verticesGrafo);
				
		for (int x = 0; x < matrizAdyacencia.length; x++) {
				for (int y = 0; y < matrizAdyacencia.length; y++) {
						System.out.print(matrizAdyacencia[x][y]+" ,\t");
				}
				System.out.println("\n");
		}	
		//*/
		
	}
	
	/*
	public static double[][] getMatrizAdyacencia(ArrayList<Parada>  verticesGrafo){
		int size = verticesGrafo.size();
		double[][]  matrizAdyacencia = new double[size][size];
		
		for (int x = 0; x < matrizAdyacencia.length; x++) {
			Parada pivote = verticesGrafo.get(x);
//			Parada pivoteSigParada = pivote.getSigParada();
				for (int y = 0; y < matrizAdyacencia.length; y++) {
					Parada parada = verticesGrafo.get(y);
						if(pivoteSigParada != null && parada != null){						
								if(pivoteSigParada.equals(parada)){
									matrizAdyacencia[x][y] = pivote.getDistancia();
								}
						}
				}
		}		
		return matrizAdyacencia;
	}
	//*/	
	
	/*
	public static ArrayList<Parada> getVerticesGrafo2(ArrayList<Parada>... rutas){
		ArrayList<Parada> verticesGrafo = new ArrayList<Parada>();
		verticesGrafo.addAll(rutas[0]);
		
		for(int x = 1; x < rutas.length; x++){
			for(Parada parada: rutas[x]){
				if( ! verticesGrafo.contains(parada)){
					verticesGrafo.add(parada);
				}
			}
		}			
		return verticesGrafo;
	}
	//*/	
	
	/*
	public static ArrayList<Parada> getVerticesGrafo(ArrayList<Parada>  ruta1, ArrayList<Parada> ruta2){
		ArrayList<Parada> verticesGrafo = new ArrayList<Parada>();
		verticesGrafo.addAll(ruta1);
		
		for(Parada parada: ruta2){
			if( ! verticesGrafo.contains(parada)){
				verticesGrafo.add(parada);
			}
		}
					
		return verticesGrafo;
	}
	//*/	
	
	/*
	public static ArrayList<Parada> getParadasRuta1(){
		// Paradas para la primera ruta 
		
		ArrayList<Parada> ruta1 = new ArrayList<Parada>();	
		
		Parada a = new Parada(1,2,4,5);	
		Parada b = new Parada(2,6,8,10);
		Parada c = new Parada(3,10,12,15);
		Parada d = new Parada(4,14,16,20);
		Parada e = new Parada(5,18,20,25);
		Parada f = new Parada(6,22,24,30);
		Parada g = new Parada(7,26,28,0);
		
		a.setSigParada(b);
		b.setSigParada(c);
		
		Parada p1 = new Parada(4,14,16,20);
		Parada p2 = new Parada(15,46,48,60);
		ArrayList<Parada> d1= new ArrayList<Parada>();
		d1.add(p1);
		d1.add(p2);
		c.setParadasDestino(d1);
		//c.setSigParada(d);
		
		d.setSigParada(e);
		e.setSigParada(f);
		f.setSigParada(g);
		//g.setSigParada(null);
		Parada m = new Parada(18,50,52,0);
		g.setSigParada(m);
		
		ruta1.add(a);
		ruta1.add(b);
		ruta1.add(c);
		ruta1.add(d);
		ruta1.add(e);
		ruta1.add(f);
		ruta1.add(g);
		
		return ruta1;
	}
	//*/	
	
	/*
	public static ArrayList<Parada> getParadasRuta2(){
		// Paradas para la primera ruta 
		
		ArrayList<Parada> ruta2 = new ArrayList<Parada>();	
		
		Parada h = new Parada(8,30,32,35);	
		Parada i = new Parada(9,34,36,40);
		Parada b = new Parada(10,6,8,10);
		Parada c = new Parada(11,10,12,15);
		Parada d = new Parada(12,14,16,20);
		Parada e = new Parada(13,18,20,25);
		Parada f = new Parada(14,22,24,30);
		Parada g = new Parada(15,26,28,0);
						
		h.setSigParada(i);
		i.setSigParada(b);
		b.setSigParada(c);
		c.setSigParada(d);
		d.setSigParada(e);
		e.setSigParada(f);
		f.setSigParada(g);
		g.setSigParada(null);
		
				
		ruta2.add(h);
		ruta2.add(i);
		ruta2.add(b);
		ruta2.add(c);
		ruta2.add(d);
		ruta2.add(e);
		ruta2.add(f);
		ruta2.add(g);				
		
		return ruta2;
	}
	//*/	

	/*
	public static ArrayList<Parada> getParadasRuta3(){
		//Paradas para la primera ruta 
		
		ArrayList<Parada> ruta3 = new ArrayList<Parada>();	
		
		Parada j = new Parada(10,38,40,45);	
		Parada k = new Parada(11,42,44,50);
		Parada i = new Parada(12,34,36,40);
		Parada b = new Parada(13,6,8,10);
		
		Parada c = new Parada(14,10,12,55);
		Parada l = new Parada(15,46,48,60);
		
		Parada f = new Parada(16,22,24,30);
		
		Parada g = new Parada(17,26,28,65);
		Parada m = new Parada(18,50,52,0);
						
		j.setSigParada(k);
		k.setSigParada(i);
		i.setSigParada(b);
		b.setSigParada(c);
		c.setSigParada(l);
		l.setSigParada(f);
		f.setSigParada(g);
		g.setSigParada(m);
		m.setSigParada(null);		
		
				
		ruta3.add(j);
		ruta3.add(k);
		ruta3.add(i);
		ruta3.add(b);
		ruta3.add(c);
		ruta3.add(l);
		ruta3.add(f);
		ruta3.add(g);
		ruta3.add(m);	
		
		return ruta3;
	}
	//*/	
	
	/*
	public static ArrayList<Parada> getParadasRuta5(){
		// Paradas para la segunda ruta 
		ArrayList<Parada> ruta5 = new ArrayList<Parada>();	
		
		Parada i = new Parada(5,18,20,20);
		Parada j= new Parada(6,6,8,10);
		Parada k = new Parada(7,10,12,15);
		Parada l = new Parada(8,14,16,0);
		
		i.setSigParada(j);
		j.setSigParada(k);
		k.setSigParada(l);
		
		ruta5.add(i);
		ruta5.add(j);
		ruta5.add(k);
		ruta5.add(l);
		
		return ruta5;
	}
	//*/

}
