
package objects;

import org.arakhne.afc.gis.road.primitive.RoadConnection;
import org.arakhne.afc.math.geometry.d2.d.Point2d;
import org.arakhne.afc.gis.road.primitive.RoadSegment;
import environnement.TrafficLight;
import environnement.StopPanel;
import java.util.ArrayList;
import java.util.Collection;

/** 
 * @author Matt
 * 
 */
 
public class SeparateRoadNetwork{

	private ArrayList<RoadConnection> deadend = new ArrayList<RoadConnection>();
	private ArrayList<RoadConnection> threeCrossingRoad = new ArrayList<RoadConnection>();
	private ArrayList<RoadConnection> fourCrossingRoad = new ArrayList<RoadConnection>();
	private ArrayList<TrafficLight> trafficLight = new ArrayList();
	private ArrayList<StopPanel> stopPanel = new ArrayList();
	
	public ArrayList<RoadConnection> getDeadEnd()
	{
		return this.deadend;
	}
	public ArrayList<RoadConnection> getThreeCrossingRoad()
	{
		return this.threeCrossingRoad;
	}
	public ArrayList<RoadConnection> getFourCrossingRoad()
	{
		return this.fourCrossingRoad;
	}
	public ArrayList<TrafficLight> getTrafficLight()
	{
		return this.trafficLight;
	}
	public ArrayList<StopPanel> getStopPanel()
	{
		return this.stopPanel;
	}
	private Collection<RoadSegment> getMap() {
		return 0; // get map ?
	}
	
	public void VerifyNetwork() {
		Collection<RoadSegment> map = (Collection<RoadSegment>)this.getMap();
		for (RoadSegment seg : map) {
			RoadConnection startpoint = seg.getBeginPoint();
			if(!deadend.contains(startpoint) && (!threeCrossingRoad.contains(startpoint) && (!fourCrossingRoad.contains(startpoint)))) {
				if(startpoint.isReallyCulDeSac()) {
					deadend.add(startpoint);
			}
				else // if connected segment count = 2, means its a normal road, so we don't care about it
					if(startpoint.getConnectedSegmentCount()== 3) {
						threeCrossingRoad.add(startpoint);
					}
						else
							if(startpoint.getConnectedSegmentCount() == 4) {
								fourCrossingRoad.add(startpoint);
							}
			}
		}
	}
		
}
