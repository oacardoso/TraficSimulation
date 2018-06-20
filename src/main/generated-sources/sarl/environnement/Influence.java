package environnement;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Abstract implementation of an influence.
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public abstract class Influence implements Serializable {
  private UUID emitter;
  
  private final UUID influencedObject;
  
  /**
   * @param influencedObject is the influenced object.
   */
  protected Influence(final UUID influencedObject) {
    this.influencedObject = influencedObject;
  }
  
  /**
   * Replies the emitter of the influence.
   * 
   * @return the emitter of the influence.
   */
  @Pure
  public UUID getEmitter() {
    return this.emitter;
  }
  
  /**
   * Set the emitter of the influence.
   * 
   * @param emitter is the emitter of the influence.
   */
  UUID setEmitter(final UUID emitter) {
    UUID _xblockexpression = null;
    {
      class $AssertEvaluator$ {
        final boolean $$result;
        $AssertEvaluator$() {
          this.$$result = (emitter != null);
        }
      }
      assert new $AssertEvaluator$().$$result;
      _xblockexpression = this.emitter = emitter;
    }
    return _xblockexpression;
  }
  
  /**
   * Replies the influenced object.
   * 
   * @return the influenced object.
   */
  @Pure
  public UUID getInfluencedObject() {
    return this.influencedObject;
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
    Influence other = (Influence) obj;
    if (!Objects.equals(this.emitter, other.emitter)) {
      return false;
    }
    if (!Objects.equals(this.influencedObject, other.influencedObject)) {
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
    result = prime * result + Objects.hashCode(this.emitter);
    result = prime * result + Objects.hashCode(this.influencedObject);
    return result;
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -2090986192L;
}
