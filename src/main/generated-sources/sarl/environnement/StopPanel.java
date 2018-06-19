package environnement;

import environnement.Sign;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author matthieu
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class StopPanel extends Sign {
  private UUID UID;
  
  public UUID get_UID() {
    return this.UID;
  }
  
  public void set_UID(final UUID UID) {
    this.UID = UID;
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
    StopPanel other = (StopPanel) obj;
    if (!Objects.equals(this.UID, other.UID)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.UID);
    return result;
  }
  
  @SyntheticMember
  public StopPanel() {
    super();
  }
}
