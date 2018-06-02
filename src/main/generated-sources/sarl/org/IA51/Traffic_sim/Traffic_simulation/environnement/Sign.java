package org.IA51.Traffic_sim.Traffic_simulation.environnement;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import org.IA51.Traffic_sim.Traffic_simulation.environnement.EnvironmentObject;
import org.IA51.Traffic_sim.Traffic_simulation.objects.Point2f;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class Sign extends EnvironmentObject {
  public Sign(final float x, final float y) {
    Point2f _point2f = new Point2f(x, y);
    this.setPosition(_point2f);
    this.setLength(50);
  }
}
