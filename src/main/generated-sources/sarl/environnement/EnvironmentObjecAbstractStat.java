package environnement;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.Objects;
import java.util.UUID;
import org.arakhne.afc.gis.road.primitive.RoadConnection;
import org.arakhne.afc.gis.road.primitive.RoadSegment;
import org.arakhne.afc.math.geometry.d2.d.Point2d;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class EnvironmentObjecAbstractStat {
  private float length;
  
  private float position;
  
  private RoadConnection entryPoint;
  
  private UUID UID;
  
  private RoadSegment segment;
  
  @Pure
  public UUID get_UID() {
    return this.UID;
  }
  
  public void set_UID(final UUID UID) {
    this.UID = UID;
  }
  
  @Pure
  public float get_Length() {
    return this.length;
  }
  
  public void set_Length(final float x) {
    this.length = x;
  }
  
  public void set_entryPoint(final RoadConnection Point) {
    this.entryPoint = Point;
  }
  
  @Pure
  public RoadConnection get_entryPoint() {
    return this.entryPoint;
  }
  
  @Pure
  public float get_Position() {
    return this.position;
  }
  
  public void set_Position(final float pos) {
    this.position = pos;
  }
  
  @Pure
  public Point2d getDistanceFrom() {
    return this.segment.getGeoLocationForDistance(this.position);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EnvironmentObjecAbstractStat other = (EnvironmentObjecAbstractStat) obj;
    if (Float.floatToIntBits(other.length) != Float.floatToIntBits(this.length))
      return false;
    if (Float.floatToIntBits(other.position) != Float.floatToIntBits(this.position))
      return false;
    if (!Objects.equals(this.UID, other.UID)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.length);
    result = prime * result + Float.floatToIntBits(this.position);
    result = prime * result + Objects.hashCode(this.UID);
    return result;
  }
  
  @SyntheticMember
  public EnvironmentObjecAbstractStat() {
    super();
  }
}
