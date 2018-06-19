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
public class EnvironmentObjecAbstract {
  private float length;
  
  private float position;
  
  private RoadConnection entryPoint;
  
  private UUID UID;
  
  private RoadSegment segment;
  
  @Pure
  public float getLength() {
    return this.length;
  }
  
  public void setLength(final float x) {
    this.length = x;
  }
  
  @Pure
  public float getPosition() {
    return this.position;
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
    EnvironmentObjecAbstract other = (EnvironmentObjecAbstract) obj;
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
  public EnvironmentObjecAbstract() {
    super();
  }
}
