package org.IA51.Traffic_sim.Traffic_simulation.objects;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

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
    throw new Error("Unresolved compilation problems:"
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean."
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean.");
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean.");
  }
}
