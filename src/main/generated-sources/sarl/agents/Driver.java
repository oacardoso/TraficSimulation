package agents;

import environnement.EnvironmentObjecAbstractStat;
import events.CarAccident;
import events.ComputeInfluence;
import io.sarl.core.Initialize;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.BuiltinCapacitiesProvider;
import io.sarl.lang.core.DynamicSkillProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(18)
@SuppressWarnings("all")
public class Driver extends Agent {
  private ArrayList<EnvironmentObjecAbstractStat> pecepts;
  
  @SyntheticMember
  private void $behaviorUnit$Initialize$3(final Initialize occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method info(String) is undefined");
  }
  
  @SyntheticMember
  private void $behaviorUnit$CarAccident$4(final CarAccident occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field killMe is undefined");
  }
  
  @SyntheticMember
  private void $behaviorUnit$ComputeInfluence$5(final ComputeInfluence occurrence) {
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Initialize(final Initialize occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$0(occurrence));
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$3(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$CarAccident(final CarAccident occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$CarAccident$1(occurrence));
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$CarAccident$4(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ComputeInfluence(final ComputeInfluence occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ComputeInfluence$2(occurrence));
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ComputeInfluence$5(occurrence));
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
