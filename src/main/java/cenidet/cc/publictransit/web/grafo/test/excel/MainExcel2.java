package cenidet.cc.publictransit.web.grafo.test.excel;

import java.util.ArrayList;

import org.cenidet.cc.publictransit.dao.StopDAO;
import org.cenidet.cc.publictransit.dto.Stop;

public class MainExcel2 {

	public static void main(String[] args) throws Exception{
		
		StopDAO stopDAO = StopDAO.getInstance();
		
		ArrayList<Stop> verticesGrafos = stopDAO.getVerticesGrafo();
		double[][] matriz = getMatrizAdyacencia(verticesGrafos);
		imprimirMatriz(matriz);
		
		/*
		for (int x = 0; x < allDistinctStops.size(); x++) {		
			Stop pivote = allDistinctStops.get(x);
			for (int y = 0; y < allDistinctStops.size(); y++) {
				Stop parada = allDistinctStops.get(y);
				ArrayList<Stop> paradasAdyacentes = pivote.getParadasAdyacentes();
				for (int z = 0; z < paradasAdyacentes.size(); z++) {
					if(paradasAdyacentes.get(z).equals(parada)){
						System.out.print(pivote.getDistanceMts()+"\t");
					}
				}
			}
			System.out.print("\n");
		}
		//*/						
	}
	
	public static double[][] getMatrizAdyacencia(ArrayList<Stop> verticesGrafos){
		int size = verticesGrafos.size();
		double[][] matriz = new double[size][size];
		
		for (int x = 0; x < verticesGrafos.size(); x++) {		
			Stop pivote = verticesGrafos.get(x);
			for (int y = 0; y < verticesGrafos.size(); y++) {
				Stop parada = verticesGrafos.get(y);
				ArrayList<Stop> paradasAdyacentes = pivote.getParadasAdyacentes();
				for (int z = 0; z < paradasAdyacentes.size(); z++) {
					Stop paradaAdyacente = paradasAdyacentes.get(z);
					if(paradaAdyacente.equals(parada)){
						matriz[x][y] =  paradaAdyacente.getDistanceMts();
					}
				}
			}
		}
		return matriz;
	}
	
	public static void imprimirMatriz(double[][] matriz){
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz.length; y++) {
				System.out.print(matriz[x][y]+"\t");
			}
			System.out.print("\n");
		}
	}
	
}
