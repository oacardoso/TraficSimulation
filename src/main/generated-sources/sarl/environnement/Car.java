package environnement;

import environnement.EnvironmentObjecAbstractMob;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import javafx.scene.paint.Color;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author User
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class Car extends EnvironmentObjecAbstractMob {
  private Color color;
  
  @Pure
  public Color get_Color() {
    return this.color;
  }
  
  public void set_Color(final Color x) {
    this.color = x;
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
  public Car() {
    super();
  }
}
