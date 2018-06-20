package environnement;

import environnement.Influence;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class KillInfluence extends Influence {
  /**
   * @param agent the identifier of the agent to kill.
   */
  public KillInfluence() {
    super(null);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 2230L;
}
