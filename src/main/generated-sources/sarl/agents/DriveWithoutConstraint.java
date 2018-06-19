package agents;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Olivier
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class DriveWithoutConstraint {
  @Pure
  public float run(final float maxacc, final float currentacc, final int currentspeed, final int speedlimit) {
    float acc = 0;
    float accel = 0;
    if ((currentspeed > speedlimit)) {
      acc = (currentacc * (speedlimit / currentspeed));
    } else {
      if ((currentspeed == speedlimit)) {
        acc = currentacc;
      } else {
        accel = (currentacc * (speedlimit / currentspeed));
      }
    }
    if ((accel > maxacc)) {
      acc = maxacc;
    } else {
      acc = accel;
    }
    return acc;
  }
  
  @SyntheticMember
  public DriveWithoutConstraint() {
    super();
  }
}
