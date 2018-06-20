package agents;

import agents.Movement;
import io.sarl.core.Behaviors;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.lang.annotation.DefaultValue;
import io.sarl.lang.annotation.DefaultValueSource;
import io.sarl.lang.annotation.DefaultValueUse;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSourceCode;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(21)
@SuppressWarnings("all")
public class standardMovement extends Skill implements Movement {
  @DefaultValueSource
  public Object influenceKinematic(@DefaultValue("agents.standardMovement#INFLUENCEKINEMATIC_0") final /* Vector2f */Object linearInfluence, @DefaultValue("agents.standardMovement#INFLUENCEKINEMATIC_1") final float angularInfluence, final /* Influence */Object... otherInfluences) {
    throw new Error("Unresolved compilation problems:"
      + "\nMotionInfluence cannot be resolved to a type."
      + "\nMotionInfluence cannot be resolved."
      + "\nDynamicType cannot be resolved to a type."
      + "\nMotionInfluence cannot be resolved."
      + "\nDynamicType cannot be resolved to a type."
      + "\nThe method emitInfluences(MotionInfluence, Influence[]) is undefined"
      + "\n=== cannot be resolved"
      + "\nKINEMATIC cannot be resolved"
      + "\nKINEMATIC cannot be resolved");
  }
  
  /**
   * Default value for the parameter linearInfluence
   */
  @SyntheticMember
  @SarlSourceCode("null")
  private final static Vector2f $DEFAULT_VALUE$INFLUENCEKINEMATIC_0 = null;
  
  /**
   * Default value for the parameter angularInfluence
   */
  @SyntheticMember
  @SarlSourceCode("0f")
  private final static float $DEFAULT_VALUE$INFLUENCEKINEMATIC_1 = 0f;
  
  @Extension
  @ImportedCapacityFeature(DefaultContextInteractions.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(DefaultContextInteractions.class, ($0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || $0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = $0$getSkill(DefaultContextInteractions.class)) : $0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS)", imported = DefaultContextInteractions.class)
  private DefaultContextInteractions $CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = $getSkill(DefaultContextInteractions.class);
    }
    return $castSkill(DefaultContextInteractions.class, this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS);
  }
  
  @Extension
  @ImportedCapacityFeature(Behaviors.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_BEHAVIORS;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(Behaviors.class, ($0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || $0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = $0$getSkill(Behaviors.class)) : $0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS)", imported = Behaviors.class)
  private Behaviors $CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = $getSkill(Behaviors.class);
    }
    return $castSkill(Behaviors.class, this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
  }
  
  @DefaultValueUse("void,float,void*")
  @SyntheticMember
  public final Object influenceKinematic(final /* Influence */Object... otherInfluences) {
    return influenceKinematic($DEFAULT_VALUE$INFLUENCEKINEMATIC_0, $DEFAULT_VALUE$INFLUENCEKINEMATIC_1, otherInfluences);
  }
  
  @DefaultValueUse("void,float,void*")
  @SyntheticMember
  public final Object influenceKinematic(final float angularInfluence, final /* Influence */Object... otherInfluences) {
    return influenceKinematic($DEFAULT_VALUE$INFLUENCEKINEMATIC_0, angularInfluence, otherInfluences);
  }
  
  @DefaultValueUse("void,float,void*")
  @SyntheticMember
  public final Object influenceKinematic(final /* Vector2f */Object linearInfluence, final /* Influence */Object... otherInfluences) {
    throw new Error("Unresolved compilation problems:"
      + "\nVector2f cannot be resolved to a type.");
  }
  
  @SyntheticMember
  public standardMovement() {
    super();
  }
  
  @SyntheticMember
  public standardMovement(final Agent agent) {
    super(agent);
  }
}
