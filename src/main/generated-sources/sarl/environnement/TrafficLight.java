package environnement;

import environnement.Sign;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.awt.Color;
import java.util.Timer;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author matthieu
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class TrafficLight extends Sign {
  private Color color;
  
  private Timer timer = new Timer();
  
  @Pure
  public Color get_color() {
    return this.color;
  }
  
  public void set_color(final Color color) {
    this.color = color;
  }
  
  @Pure
  public Timer get_timer() {
    return this.timer;
  }
  
  public void set_timer(final Timer timer) {
    this.timer = timer;
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
  public TrafficLight() {
    super();
  }
}
