import processing.core.PApplet;

public class ProcessingHelloWorld extends PApplet {

    @Override
    public void setup() {
        size(400, 200, JAVA2D);  // Define el tamaño de la ventana de dibujo
    }

    @Override
    public void draw() {
        background(255); // Establece el color de fondo en blanco
        fill(0);         // Establece el color de relleno en negro
        textSize(32);    // Establece el tamaño del texto
        textAlign(CENTER, CENTER); // Establece la alineación del texto
        text("Hello, World!", (float) width /2, (float) height /2); // Dibuja el texto en el centro de la ventana
    }

    public static void main(String[] args) {
        PApplet.main("ProcessingHelloWorld");
    }
}
