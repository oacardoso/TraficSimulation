
package traficWindow;

import java.util.Collection;

import org.arakhne.afc.gis.mapelement.MapCircle;
import org.arakhne.afc.gis.mapelement.MapElement;
import org.arakhne.afc.gis.maplayer.ArrayMapElementLayer;


import environnement.Car;
import javafx.scene.paint.Color;


public class CarLayer extends ArrayMapElementLayer<MapElement>
{
	

	public static final int CAR_RADIUS = 3;
	
	
	
	private Collection<Car> carList;

	
	
	/** Constructor for CarLayer. carList is the collection which contains the cars which need to be rendered.
	 * 
	 * @param carList
	 */
	public CarLayer(Collection<Car> carList) {
		super();
		this.carList = carList;
	}
	
	
	/**
	 * Update method for the CarLayer. Intended to be used at each frame. 
	 * 
	 * For each Car in CarList, it will add a circle on the layer.
	 */
	public void update() {
		
		this.removeAllMapElements();
		for(Car c : carList) {
			
			// TODO : check filters
			
			MapCircle mapCircle = new MapCircle(c.getPosition2d(), CAR_RADIUS);
			Color carColor = c.getColor();
			mapCircle.setColor(getIntFromColor(carColor.getRed(), carColor.getGreen(), carColor.getBlue()));
			this.addMapElement(mapCircle);
			
		}
		

	}
	
	private int getIntFromColor(double Red, double Green, double Blue){
	    int R = (int) Math.round(255 * Red);
	    int G = (int) Math.round(255 * Green);
	    int B = (int) Math.round(255 * Blue);

	    R = (R << 16) & 0x00FF0000;
	    G = (G << 8) & 0x0000FF00;
	    B = B & 0x000000FF;

	    return 0xFF000000 | R | G | B;
	}
	

}