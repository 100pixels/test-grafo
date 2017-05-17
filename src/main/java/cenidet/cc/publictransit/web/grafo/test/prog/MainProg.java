package cenidet.cc.publictransit.web.grafo.test.prog;

import java.sql.SQLException;
import java.util.ArrayList;

import cenidet.cc.publictransit.dao.StopDAO;
import cenidet.cc.publictransit.dto.Stop;

public class MainProg {
	
	public static void main(String[] args) {
		
		//ArrayList<Stop> allStops = getAllStops();
		//ArrayList<Stop> distinctStops = getAllDistinctStops(allStops);
		
		try {
			ArrayList<Stop> verticesGrafos = StopDAO.getInstance().getVerticesGrafo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<Stop> getAllStops(){
		ArrayList<Stop> paradas = null;
		try{
			paradas = StopDAO.getInstance().getAllStops();
		}catch(Exception ex){
			System.out.println("Exception: "+ ex.getMessage());
		}
		return paradas;
	}

	public static ArrayList<Stop> getAllDistinctStops(ArrayList<Stop> allStops){
		System.out.println("getAllDistinctStops...");
		ArrayList<Stop> distinctStops = new ArrayList<Stop>();		
		for(Stop stop: allStops){
			if( ! distinctStops.contains(stop)){
				distinctStops.add(stop);
				System.out.println(stop);
			}
		}
		return distinctStops;
	}
	
}
