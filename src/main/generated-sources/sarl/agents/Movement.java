package agents;

import environnement.Influence;
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
  public abstract void influenceSteering(@DefaultValue("agents.Movement#INFLUENCESTEERING_0") final Vector2f linearInfluence, @DefaultValue("agents.Movement#INFLUENCESTEERING_1") final float angularInfluence, final Influence... otherInfluences);
  
  /**
   * Default value for the parameter linearInfluence
   */
  @SyntheticMember
  @SarlSourceCode("null")
  public final static Vector2f $DEFAULT_VALUE$INFLUENCESTEERING_0 = null;
  
  /**
   * Default value for the parameter angularInfluence
   */
  @SyntheticMember
  @SarlSourceCode("0f")
  public final static float $DEFAULT_VALUE$INFLUENCESTEERING_1 = 0f;
  
  @DefaultValueUse("math.Vector2f,float,environnement.Influence*")
  @SyntheticMember
  public default void influenceSteering(final Influence... otherInfluences) {
    influenceSteering($DEFAULT_VALUE$INFLUENCESTEERING_0, $DEFAULT_VALUE$INFLUENCESTEERING_1, otherInfluences);
  }
  
  @DefaultValueUse("math.Vector2f,float,environnement.Influence*")
  @SyntheticMember
  public default void influenceSteering(final float angularInfluence, final Influence... otherInfluences) {
    influenceSteering($DEFAULT_VALUE$INFLUENCESTEERING_0, angularInfluence, otherInfluences);
  }
  
  @DefaultValueUse("math.Vector2f,float,environnement.Influence*")
  @SyntheticMember
  public default void influenceSteering(final Vector2f linearInfluence, final Influence... otherInfluences) {
    influenceSteering(linearInfluence, $DEFAULT_VALUE$INFLUENCESTEERING_1, otherInfluences);
  }
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends Movement> extends Capacity.ContextAwareCapacityWrapper<C> implements Movement {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
    
    public void influenceSteering(final Vector2f linearInfluence, final float angularInfluence, final Influence... otherInfluences) {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceSteering(linearInfluence, angularInfluence, otherInfluences);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public void influenceSteering(final Influence... otherInfluences) {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceSteering(otherInfluences);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public void influenceSteering(final float angularInfluence, final Influence... otherInfluences) {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceSteering(angularInfluence, otherInfluences);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public void influenceSteering(final Vector2f linearInfluence, final Influence... otherInfluences) {
      try {
        ensureCallerInLocalThread();
        this.capacity.influenceSteering(linearInfluence, otherInfluences);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
