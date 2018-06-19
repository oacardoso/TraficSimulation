package environnement;

import environnement.EnvironmentObjecAbstractStat;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.arakhne.afc.math.geometry.d2.Point2D;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class Sign extends EnvironmentObjecAbstractStat {
  private Point2D position;
  
  @Pure
  public Point2D get_position() {
    return this.position;
  }
  
  public void set_position(final Point2D point) {
    this.position = point;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  @SyntheticMember
  public Sign() {
    super();
  }
}
