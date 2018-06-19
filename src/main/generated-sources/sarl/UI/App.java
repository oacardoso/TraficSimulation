package UI;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import javafx.application.Application;
import javafx.stage.Stage;
import org.arakhne.afc.gis.maplayer.MapElementLayer;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class App extends Application {
  private static App inst;
  
  private MapElementLayer<?> roadNetworkLayer;
  
  public App() {
    App.inst = this;
  }
  
  public void init() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method loadShapeFile(File) is not visible");
  }
  
  public void start(final Stage arg0) throws Exception {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
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
}
