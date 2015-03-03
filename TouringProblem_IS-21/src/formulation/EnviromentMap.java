package formulation;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.is.search.formulation.State;


public class EnviromentMap extends State{

	/*
	 * Atributo donde almacenamos todas las ciudades existentes en el entorno 
	 * incluyendo la inicial y la final
	 */
	public static List<City> cities = new ArrayList<City>();
	
	
	/*
	 * Constructor de la clase que recibe por parametro una lista de ciudades
	 */
	public EnviromentMap(List<City> cities) {
		this.cities = cities;
	}
	
	/*
	 * Metodo toString que devuelve un string con todas las ciudades existentes 
	 * en la lista de ciudades
	 */
	public String toString(){
		String c="";
		for(int i=0;i<cities.size();i++)
			c = c + cities.get(i).toString()+"\n";	
		return c;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
