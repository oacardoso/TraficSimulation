package environnement;

import environnement.Car;
import environnement.EnvironmentObjecAbstractMob;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;

/**
 * @author User
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class CarAgent extends EnvironmentObjecAbstractMob implements Car {
  @SyntheticMember
  public CarAgent() {
    super();
  }
}
