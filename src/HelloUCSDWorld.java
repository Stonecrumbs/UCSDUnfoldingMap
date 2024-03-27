import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
/**
 * Hello World!
 * 
 * This is the basic stub to start creating interactive maps.
 */
public class HelloUCSDWorld extends PApplet {

	UnfoldingMap map;
	UnfoldingMap map2;


	public void setup() {
		size(800, 600, JAVA2D);

		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map2 = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map.zoomAndPanTo(14, new Location(32.881, -117.238)); // UCSD
		map2.zoomAndPanTo(20, new Location(38.756, -9.115)); // ISEL

		MapUtils.createDefaultEventDispatcher(this, map);
		MapUtils.createDefaultEventDispatcher(this, map2);
	}

	@Override
	public void draw() {
		background(255); // Establece el color de fondo en blanco
		map.draw();
		map2.draw();
	}

	public static void main(String[] args) {
		PApplet.main("HelloUCSDWorld");
	}
}
