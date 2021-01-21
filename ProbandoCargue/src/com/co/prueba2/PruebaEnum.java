package com.co.prueba2;

public enum PruebaEnum {	
	
		BARÇA("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
		SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7); 
		
		private String nombreClub;
		private int puestoLiga;
		
		private PruebaEnum (String nombreClub, int puestoLiga){
			this.nombreClub = nombreClub;
			this.puestoLiga = puestoLiga;
		}

		public String getNombreClub() {
			return nombreClub;
		}

		public int getPuestoLiga() {
			return puestoLiga;
		}	
		
	}