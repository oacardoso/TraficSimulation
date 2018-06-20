package agents;

import agents.Movement;
import com.google.common.base.Objects;
import environnement.Influence;
import environnement.InfluenceEvent;
import environnement.KillInfluence;
import environnement.MotionInfluence;
import io.sarl.core.Behaviors;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.lang.annotation.DefaultValue;
import io.sarl.lang.annotation.DefaultValueSource;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSourceCode;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Scope;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import io.sarl.util.OpenEventSpace;
import java.lang.reflect.Array;
import java.util.List;
import java.util.UUID;
import math.Vector2f;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(21)
@SuppressWarnings("all")
public class standardMovement extends Skill implements Movement {
  private final UUID spaceID;
  
  private final UUID environmentID;
  
  private OpenEventSpace physicSpace;
  
  private Address myAdr;
  
  public standardMovement(final UUID spaceID, final UUID environmentID) {
    this.environmentID = environmentID;
    this.spaceID = spaceID;
  }
  
  public void install() {
    do {
      {
        DefaultContextInteractions _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER = this.$castSkill(DefaultContextInteractions.class, (this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = this.$getSkill(DefaultContextInteractions.class)) : this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS);
        this.physicSpace = _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER.getDefaultContext().<OpenEventSpace>getSpace(this.spaceID);
        Thread.yield();
      }
    } while((this.physicSpace == null));
    Behaviors _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER = this.$castSkill(Behaviors.class, (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = this.$getSkill(Behaviors.class)) : this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
    this.physicSpace.register(_$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER.asEventListener());
    this.myAdr = this.physicSpace.getAddress(this.getOwner().getID());
  }
  
  public void uninstall() {
    KillInfluence _killInfluence = new KillInfluence();
    InfluenceEvent event = new InfluenceEvent(_killInfluence);
    final Scope<Address> _function = (Address it) -> {
      UUID _uUID = it.getUUID();
      return Objects.equal(_uUID, this.environmentID);
    };
    this.physicSpace.emit(this.myAdr.getUUID(), event, _function);
    this.physicSpace = null;
  }
  
  @DefaultValueSource
  public void influenceSteering(@DefaultValue("agents.standardMovement#INFLUENCESTEERING_0") final Vector2f linearInfluence, @DefaultValue("agents.standardMovement#INFLUENCESTEERING_1") final float angularInfluence, final Influence... otherInfluences) {
    MotionInfluence mi = null;
    if ((linearInfluence == null)) {
      MotionInfluence _motionInfluence = new MotionInfluence(angularInfluence);
      mi = _motionInfluence;
    } else {
      MotionInfluence _motionInfluence_1 = new MotionInfluence(linearInfluence, angularInfluence);
      mi = _motionInfluence_1;
    }
    this.emitInfluences(mi, otherInfluences);
  }
  
  /**
   * Default value for the parameter linearInfluence
   */
  @SyntheticMember
  @SarlSourceCode("null")
  private final static Vector2f $DEFAULT_VALUE$INFLUENCESTEERING_0 = null;
  
  /**
   * Default value for the parameter angularInfluence
   */
  @SyntheticMember
  @SarlSourceCode("0f")
  private final static float $DEFAULT_VALUE$INFLUENCESTEERING_1 = 0f;
  
  public void emitInfluences(final MotionInfluence motionInfluence, final Influence... otherInfluences) {
    Influence[] influences = null;
    boolean _isEmpty = ((List<Influence>)Conversions.doWrapArray(otherInfluences)).isEmpty();
    if (_isEmpty) {
      Object _newInstance = Array.newInstance(Influence.class, 1);
      influences = ((Influence[]) _newInstance);
      influences[0] = motionInfluence;
    } else {
      int _length = otherInfluences.length;
      int _plus = (_length + 1);
      Object _newInstance_1 = Array.newInstance(Influence.class, _plus);
      influences = ((Influence[]) _newInstance_1);
      influences[0] = motionInfluence;
      System.arraycopy(otherInfluences, 0, influences, 1, otherInfluences.length);
    }
    InfluenceEvent event = new InfluenceEvent(influences);
    final Scope<Address> _function = (Address it) -> {
      UUID _uUID = it.getUUID();
      return Objects.equal(_uUID, this.environmentID);
    };
    this.physicSpace.emit(this.myAdr.getUUID(), event, _function);
  }
  
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
    standardMovement other = (standardMovement) obj;
    if (!java.util.Objects.equals(this.spaceID, other.spaceID)) {
      return false;
    }
    if (!java.util.Objects.equals(this.environmentID, other.environmentID)) {
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
    result = prime * result + java.util.Objects.hashCode(this.spaceID);
    result = prime * result + java.util.Objects.hashCode(this.environmentID);
    return result;
  }
}
