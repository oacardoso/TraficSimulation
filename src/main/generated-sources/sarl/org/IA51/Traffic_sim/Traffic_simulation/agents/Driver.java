package org.IA51.Traffic_sim.Traffic_simulation.agents;

import io.sarl.core.Initialize;
import io.sarl.core.Lifecycle;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.BuiltinCapacitiesProvider;
import io.sarl.lang.core.DynamicSkillProvider;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import org.IA51.Traffic_sim.Traffic_simulation.environnement.EnvironmentObject;
import org.IA51.Traffic_sim.Traffic_simulation.events.CarAccident;
import org.IA51.Traffic_sim.Traffic_simulation.events.Perception;
import org.arakhne.afc.gis.road.primitive.RoadConnection;
import org.arakhne.afc.gis.road.primitive.RoadSegment;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(18)
@SuppressWarnings("all")
public class Driver extends Agent {
  @SyntheticMember
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    EnvironmentObject obj = new EnvironmentObject();
  }
  
  @SyntheticMember
  private void $behaviorUnit$CarAccident$1(final CarAccident occurrence) {
    Lifecycle _$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE$CALLER = this.$castSkill(Lifecycle.class, (this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE == null || this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE = this.$getSkill(Lifecycle.class)) : this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE);
    _$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE$CALLER.killMe();
  }
  
  @SyntheticMember
  private void $behaviorUnit$Perception$2(final Perception occurrence) {
  }
  
  protected Object computePerception(final RoadConnection entryPoint, final RoadSegment segment, final double distanceFromEntryPoint, final double perceptionDistance, final Collection<EnvironmentObject> percepts, final Set<RoadSegment> treatedSegments) {
    boolean _contains = treatedSegments.contains(segment);
    if (_contains) {
    }
    treatedSegments.add(segment);
    Iterable<EnvironmentObject> objs = null;
    RoadConnection _beginPoint = segment.getBeginPoint();
    boolean _tripleEquals = (entryPoint == _beginPoint);
    if (_tripleEquals) {
      objs = this.getObjectsFromStart(segment);
    } else {
      objs = this.getObjectsFromEnd(segment);
    }
    for (final EnvironmentObject obj : objs) {
    }
    RoadConnection otherside = segment.getOtherSidePoint(entryPoint);
    Iterable<RoadSegment> _connectedSegments = otherside.getConnectedSegments();
    for (final RoadSegment seg : _connectedSegments) {
      {
        double _length = segment.getLength();
        double d = (_length - distanceFromEntryPoint);
        this.computePerception(otherside, seg, 0, Math.min(0, (perceptionDistance - d)), percepts, treatedSegments);
      }
    }
    return null;
  }
  
  @Pure
  protected Iterable<EnvironmentObject> getObjectsFromStart(final RoadSegment segment) {
    return null;
  }
  
  @Pure
  protected Iterable<EnvironmentObject> getObjectsFromEnd(final RoadSegment segment) {
    return null;
  }
  
  @Extension
  @ImportedCapacityFeature(Lifecycle.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_LIFECYCLE;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(Lifecycle.class, ($0$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE == null || $0$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE = $0$getSkill(Lifecycle.class)) : $0$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE)", imported = Lifecycle.class)
  private Lifecycle $CAPACITY_USE$IO_SARL_CORE_LIFECYCLE$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE == null || this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE = $getSkill(Lifecycle.class);
    }
    return $castSkill(Lifecycle.class, this.$CAPACITY_USE$IO_SARL_CORE_LIFECYCLE);
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Initialize(final Initialize occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$0(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$CarAccident(final CarAccident occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$CarAccident$1(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Perception(final Perception occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Perception$2(occurrence));
  }
  
  @SyntheticMember
  public Driver(final UUID parentID, final UUID agentID) {
    super(parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  @Deprecated
  public Driver(final BuiltinCapacitiesProvider provider, final UUID parentID, final UUID agentID) {
    super(provider, parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  public Driver(final UUID parentID, final UUID agentID, final DynamicSkillProvider skillProvider) {
    super(parentID, agentID, skillProvider);
  }
}
