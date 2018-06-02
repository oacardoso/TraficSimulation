package org.IA51.Traffic_sim.Traffic_simulation.general;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.IA51.Traffic_sim.Traffic_simulation.labs.Point2f;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author matthieu
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class EnvironmentObject {
  private float length;
  
  private Point2f position;
  
  private int UID = 0;
  
  @Pure
  public float getLength() {
    return this.length;
  }
  
  public void setLength(final float x) {
    this.length = x;
  }
  
  @Pure
  public Point2f getPosition() {
    return this.position;
  }
  
  public void setPosition(final Point2f pos) {
    this.position = pos;
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
    EnvironmentObject other = (EnvironmentObject) obj;
    if (Float.floatToIntBits(other.length) != Float.floatToIntBits(this.length))
      return false;
    if (other.UID != this.UID)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.length);
    result = prime * result + this.UID;
    return result;
  }
  
  @SyntheticMember
  public EnvironmentObject() {
    super();
  }
}
