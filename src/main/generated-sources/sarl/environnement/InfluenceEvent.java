package environnement;

import environnement.Influence;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class InfluenceEvent extends Event {
  public final List<Influence> influences;
  
  public InfluenceEvent(final Influence... e) {
    this.influences = ((List<Influence>)Conversions.doWrapArray(e));
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
  
  /**
   * Returns a String representation of the InfluenceEvent event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("influences", this.influences);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 3217037845L;
}
