package ch4;

public class Ch4_3 {
	final static double RADIUS = 6371;
	public static void main(String[] args) {
		// Atlanta, Georgia
		double latAG = 33.7490;
		latAG = Math.toRadians(latAG);
		double lonAG = -84.3880;
		lonAG = Math.toRadians(lonAG);
		
		// Orlando, Florida
		double latOF = 28.5383;
		latOF = Math.toRadians(latOF);
		double lonOF = -81.3792;
		lonOF = Math.toRadians(lonOF);
		
		// Savannah, Georgia
		double latSG = 32.0809;
		latSG = Math.toRadians(latSG);
		double lonSG = 81.0912;
		lonSG = Math.toRadians(lonSG);
		
		// Charlotte, North Carolina
		double latCN = 35.2271;
		latCN = Math.toRadians(latCN);
		double lonCN = -80.8431;
		lonCN = Math.toRadians(lonCN);
		
		// calulate the distance between cities
		double AG_OF =  RADIUS * Math.sin(latAG) * Math.sin(latOF) + Math.cos(latAG) * Math.cos(latOF) * Math.cos(lonAG - lonOF);
		double AG_SG =  RADIUS * Math.sin(latAG) * Math.sin(latSG) + Math.cos(latAG) * Math.cos(latSG) * Math.cos(lonAG - lonSG);
		double CN_SG =  RADIUS * Math.sin(latCN) * Math.sin(latSG) + Math.cos(latCN) * Math.cos(latSG) * Math.cos(lonCN - lonSG);
		double CN_OF =  RADIUS * Math.sin(latCN) * Math.sin(latOF) + Math.cos(latCN) * Math.cos(latOF) * Math.cos(lonCN - lonOF);
		double SG_OF =  RADIUS * Math.sin(latSG) * Math.sin(latOF) + Math.cos(latSG) * Math.cos(latOF) * Math.cos(lonSG - lonOF);
		
		
		// Compute the area
		double s1 = (AG_SG + AG_OF + SG_OF) / 2;
		double areaOfTri1 = Math.sqrt(s1 * (s1 - AG_SG) * (s1 - AG_OF) * (s1 - SG_OF));
		
		double s2 = (CN_SG + CN_OF + SG_OF) / 2;
		double areaOfTri2 = Math.sqrt(s2 * (s2 - CN_SG) * (s2 - CN_OF) * (s2 - SG_OF));
		
		
		double area = areaOfTri1 + areaOfTri2;
		
		System.out.println("The area enclosed by the cities of Atlanta (GA), " +
			      "Orlando (FL), Savannah (GA), and Charlotte (NC) is " + area + " sq km");
	}

}
