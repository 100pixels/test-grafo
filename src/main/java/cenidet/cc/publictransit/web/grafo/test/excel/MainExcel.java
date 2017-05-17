package cenidet.cc.publictransit.web.grafo.test.excel;

import java.sql.SQLException;
import java.util.ArrayList;

import cenidet.cc.publictransit.dao.StopDAO;
import cenidet.cc.publictransit.dto.Stop;
import cenidet.cc.publictransit.web.grafo.test.manual.Parada;

public class MainExcel {
	
	public static void main(String[] args) {
		ArrayList<Stop> verticesGrafo = null;
		try {
			verticesGrafo = StopDAO.getInstance().getVerticesGrafo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
	
	public static double[][] getMatrizAdyacencia(ArrayList<Stop>  verticesGrafo){
		int size = verticesGrafo.size();
		double[][]  matrizAdyacencia = new double[size][size];
		
		for (int x = 0; x < matrizAdyacencia.length; x++) {
			Stop pivote = verticesGrafo.get(x);			
			ArrayList<Stop> paradasAdyacentes = pivote.getParadasAdyacentes();
				for (int y = 0; y < matrizAdyacencia.length; y++) {
					Stop parada = verticesGrafo.get(y);
					if(paradasAdyacentes != null){
						for (int z = 0; z < paradasAdyacentes.size(); z++) {
							if(parada.equals(paradasAdyacentes.get(z))){
								matrizAdyacencia[x][y] = paradasAdyacentes.get(z).getDistanceMts();
							}
						}
					}
				}
		}		
		return matrizAdyacencia;
	}
	//*/	
	
}
