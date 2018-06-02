package org.IA51.Traffic_sim.Traffic_simulation.objects;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author matthieu
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class Point2f {
  private int x;
  
  private int y;
  
  public Point2f(final float f, final float g) {
  }
  
  @Pure
  public float straightdistance(final Point2f p1) {
    int dx = (this.x - p1.x);
    int dy = (this.y - p1.y);
    double _sqrt = Math.sqrt(((dx * dx) + (dy * dy)));
    return ((float) _sqrt);
  }
  
  @Pure
  public float distance(final Point2f p1) {
    int _abs = Math.abs((this.x - p1.x));
    int _abs_1 = Math.abs((this.y - p1.y));
    return (_abs + _abs_1);
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
    Point2f other = (Point2f) obj;
    if (other.x != this.x)
      return false;
    if (other.y != this.y)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.x;
    result = prime * result + this.y;
    return result;
  }
}
