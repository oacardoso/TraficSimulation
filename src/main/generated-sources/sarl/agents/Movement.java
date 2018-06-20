package agents;

import io.sarl.lang.annotation.DefaultValue;
import io.sarl.lang.annotation.DefaultValueSource;
import io.sarl.lang.annotation.DefaultValueUse;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSourceCode;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.AgentTrait;
import io.sarl.lang.core.Capacity;
import math.Vector2f;

@SarlSpecification("0.7")
@SarlElementType(19)
@SuppressWarnings("all")
public interface Movement extends Capacity {
  @DefaultValueSource
  public abstract void influenceKinematic(@DefaultValue("agents.Movement#INFLUENCEKINEMATIC_0") final Vector2f linearInfluence, @DefaultValue("agents.Movement#INFLUENCEKINEMATIC_1") final float angularInfluence);
  
  /**
   * Default value for the parameter linearInfluence
   */
  @SyntheticMember
  @SarlSourceCode("null")
  public final static Vector2f $DEFAULT_VALUE$INFLUENCEKINEMATIC_0 = null;
  
  /**
   * Default value for the parameter angularInfluence
   */
  @SyntheticMember
  @SarlSourceCode("0f")
  public final static float $DEFAULT_VALUE$INFLUENCEKINEMATIC_1 = 0f;
  
  @DefaultValueUse("math.Vector2f,float")
  @SyntheticMember
  public default void influenceKinematic() {
    influenceKinematic($DEFAULT_VALUE$INFLUENCEKINEMATIC_0, $DEFAULT_VALUE$INFLUENCEKINEMATIC_1);
  }
  
  @DefaultValueUse("math.Vector2f,float")
  @SyntheticMember
  public default void influenceKinematic(final float angularInfluence) {
    influenceKinematic($DEFAULT_VALUE$INFLUENCEKINEMATIC_0, angularInfluence);
  }
  
  @DefaultValueUse("math.Vector2f,float")
  @SyntheticMember
  public default void influenceKinematic(final Vector2f linearInfluence) {
    influenceKinematic(linearInfluence, $DEFAULT_VALUE$INFLUENCEKINEMATIC_1);
  }
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends Movement> extends Capacity.ContextAwareCapacityWrapper<C> implements Movement {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
    
    public void influenceKinematic(final Vector2f linearInfluence, final float angularInfluence) {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceKinematic(linearInfluence, angularInfluence);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public void influenceKinematic() {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceKinematic();
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public void influenceKinematic(final float angularInfluence) {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceKinematic(angularInfluence);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public void influenceKinematic(final Vector2f linearInfluence) {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceKinematic(linearInfluence);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
