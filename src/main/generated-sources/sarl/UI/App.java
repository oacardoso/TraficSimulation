package UI;

import Java.Layer;
import com.google.common.base.Objects;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.io.File;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.arakhne.afc.gis.mapelement.MapPolygon;
import org.arakhne.afc.gis.maplayer.ArrayMapElementLayer;
import org.arakhne.afc.gis.maplayer.MapElementLayer;
import org.arakhne.afc.gis.maplayer.MapLayer;
import org.arakhne.afc.gis.maplayer.MultiMapLayer;
import org.arakhne.afc.gis.primitive.GISContainer;
import org.arakhne.afc.nodefx.ZoomablePane;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class App extends Application {
  private ArrayMapElementLayer<MapPolygon> CarLayer = new ArrayMapElementLayer<MapPolygon>();
  
  private ArrayMapElementLayer<MapPolygon> StopLayer = new ArrayMapElementLayer<MapPolygon>();
  
  private ArrayMapElementLayer<MapPolygon> TrafficLightLayer = new ArrayMapElementLayer<MapPolygon>();
  
  private boolean isReady = false;
  
  private static App inst;
  
  private MapElementLayer<?> roadNetworkLayer;
  
  public App() {
    App.inst = this;
  }
  
  public void init() {
    File _file = new File("src/main/sarl/UI/Quartier.shp");
    this.roadNetworkLayer = Layer.loadShapeFile(_file);
  }
  
  public void start(final Stage stage) {
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root, 1024, 768);
    ArrayList<MapElementLayer> containers = new ArrayList<MapElementLayer>();
    boolean _notEquals = (!Objects.equal(this.roadNetworkLayer, null));
    if (_notEquals) {
      containers.add(this.roadNetworkLayer);
    }
    containers.add(this.CarLayer);
    containers.add(this.StopLayer);
    containers.add(this.TrafficLightLayer);
    GISContainer container = null;
    MultiMapLayer layer = null;
    int _size = containers.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      container = containers.get(0);
    } else {
      MultiMapLayer<MapLayer> _multiMapLayer = new MultiMapLayer<MapLayer>();
      layer = _multiMapLayer;
      for (final MapElementLayer child : containers) {
        layer.addMapLayer(child);
      }
      container = layer;
    }
    ZoomablePane<GISContainer> scrollPane = new ZoomablePane<GISContainer>(container);
    root.setCenter(scrollPane);
    stage.setTitle("Traffic simulation !");
    stage.setScene(scene);
    this.isReady = true;
    stage.show();
  }
  
  @Pure
  public static App getInst() {
    boolean _equals = Objects.equal(App.inst, null);
    if (_equals) {
      App _app = new App();
      App.inst = _app;
    }
    return App.inst;
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
    App other = (App) obj;
    if (other.isReady != this.isReady)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (this.isReady ? 1231 : 1237);
    return result;
  }
}
