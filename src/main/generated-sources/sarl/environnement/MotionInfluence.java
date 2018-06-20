package environnement;

import environnement.Influence;
import io.sarl.lang.annotation.DefaultValue;
import io.sarl.lang.annotation.DefaultValueSource;
import io.sarl.lang.annotation.DefaultValueUse;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSourceCode;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.UUID;
import math.Vector2f;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Abstract implementation of a motion influence.
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class MotionInfluence extends Influence {
  private final Vector2f linearInfluence = new Vector2f();
  
  private float angularInfluence;
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @param influencedObject is the influenced object.
   * @param linearInfluence is the linear influence to apply on the object.
   * @param angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueSource
  public MotionInfluence(@DefaultValue("environnement.MotionInfluence#NEW_0") final UUID influencedObject, @DefaultValue("environnement.MotionInfluence#NEW_1") final Vector2f linearInfluence, @DefaultValue("environnement.MotionInfluence#NEW_2") final float angularInfluence) {
    super(influencedObject);
    if ((linearInfluence != null)) {
      this.linearInfluence.set(linearInfluence);
    }
    this.angularInfluence = angularInfluence;
  }
  
  /**
   * Default value for the parameter influencedObject
   */
  @SyntheticMember
  @SarlSourceCode("null")
  private final static UUID $DEFAULT_VALUE$NEW_0 = null;
  
  /**
   * Default value for the parameter linearInfluence
   */
  @SyntheticMember
  @SarlSourceCode("null")
  private final static Vector2f $DEFAULT_VALUE$NEW_1 = null;
  
  /**
   * Default value for the parameter angularInfluence
   */
  @SyntheticMember
  @SarlSourceCode("0")
  private final static float $DEFAULT_VALUE$NEW_2 = 0;
  
  /**
   * Set the linear influence.
   * 
   * @param l is the linear influence
   */
  public float setLinarInfluence(final Vector2f l) {
    float _xblockexpression = (float) 0;
    {
      class $AssertEvaluator$ {
        final boolean $$result;
        $AssertEvaluator$() {
          this.$$result = (l != null);
        }
      }
      assert new $AssertEvaluator$().$$result;
      _xblockexpression = this.linearInfluence.set(l);
    }
    return _xblockexpression;
  }
  
  /**
   * Set the linear influence.
   * 
   * @param dx is the linear influence
   * @param dy is the linear influence
   */
  public float setLinarInfluence(final float dx, final float dy) {
    return this.linearInfluence.set(dx, dy);
  }
  
  /**
   * Set the angular influence.
   * 
   * @param a
   */
  public void setAngularInfluence(final float a) {
    this.angularInfluence = a;
  }
  
  /**
   * Replies the linear influence.
   * 
   * @return the linear influence
   */
  @Pure
  public Vector2f getLinearInfluence() {
    return this.linearInfluence;
  }
  
  /**
   * Replies the angular influence.
   * 
   * @return the angular influence
   */
  @Pure
  public float getAngularInfluence() {
    return this.angularInfluence;
  }
  
  @Override
  @Pure
  public String toString() {
    String _plus = (this.linearInfluence + "|");
    return (_plus + Float.valueOf(this.angularInfluence));
  }
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @optionalparam influencedObject is the influenced object.
   * @optionalparam linearInfluence is the linear influence to apply on the object.
   * @optionalparam angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueUse("java.util.UUID,math.Vector2f,float")
  @SyntheticMember
  public MotionInfluence() {
    this($DEFAULT_VALUE$NEW_0, $DEFAULT_VALUE$NEW_1, $DEFAULT_VALUE$NEW_2);
  }
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @optionalparam influencedObject is the influenced object.
   * @optionalparam linearInfluence is the linear influence to apply on the object.
   * @optionalparam angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueUse("java.util.UUID,math.Vector2f,float")
  @SyntheticMember
  public MotionInfluence(final float angularInfluence) {
    this($DEFAULT_VALUE$NEW_0, $DEFAULT_VALUE$NEW_1, angularInfluence);
  }
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @optionalparam influencedObject is the influenced object.
   * @optionalparam linearInfluence is the linear influence to apply on the object.
   * @optionalparam angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueUse("java.util.UUID,math.Vector2f,float")
  @SyntheticMember
  public MotionInfluence(final UUID influencedObject) {
    this(influencedObject, $DEFAULT_VALUE$NEW_1, $DEFAULT_VALUE$NEW_2);
  }
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @optionalparam influencedObject is the influenced object.
   * @optionalparam linearInfluence is the linear influence to apply on the object.
   * @optionalparam angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueUse("java.util.UUID,math.Vector2f,float")
  @SyntheticMember
  public MotionInfluence(final Vector2f linearInfluence) {
    this($DEFAULT_VALUE$NEW_0, linearInfluence, $DEFAULT_VALUE$NEW_2);
  }
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @optionalparam influencedObject is the influenced object.
   * @optionalparam linearInfluence is the linear influence to apply on the object.
   * @optionalparam angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueUse("java.util.UUID,math.Vector2f,float")
  @SyntheticMember
  public MotionInfluence(final UUID influencedObject, final float angularInfluence) {
    this(influencedObject, $DEFAULT_VALUE$NEW_1, angularInfluence);
  }
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @optionalparam influencedObject is the influenced object.
   * @optionalparam linearInfluence is the linear influence to apply on the object.
   * @optionalparam angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueUse("java.util.UUID,math.Vector2f,float")
  @SyntheticMember
  public MotionInfluence(final UUID influencedObject, final Vector2f linearInfluence) {
    this(influencedObject, linearInfluence, $DEFAULT_VALUE$NEW_2);
  }
  
  /**
   * @param type indicates if the influence is kinematic or steering.
   * @optionalparam influencedObject is the influenced object.
   * @optionalparam linearInfluence is the linear influence to apply on the object.
   * @optionalparam angularInfluence is the angular influence to apply on the object.
   */
  @DefaultValueUse("java.util.UUID,math.Vector2f,float")
  @SyntheticMember
  public MotionInfluence(final Vector2f linearInfluence, final float angularInfluence) {
    this($DEFAULT_VALUE$NEW_0, linearInfluence, angularInfluence);
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
    MotionInfluence other = (MotionInfluence) obj;
    if (Float.floatToIntBits(other.angularInfluence) != Float.floatToIntBits(this.angularInfluence))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.angularInfluence);
    return result;
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 1573413854L;
}
