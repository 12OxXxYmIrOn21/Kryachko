public class OpenGLAdapter implements GraphicsAPI {
    @Override
    public void initialize() {
        System.out.println("Initializing OpenGL...");
        // Код для инициализации OpenGL
    }

    @Override
    public void render() {
        System.out.println("Rendering with OpenGL...");
        // Код для отрисовки объектов с использованием OpenGL
    }

    @Override
    public void cleanup() {
        System.out.println("Cleaning up OpenGL resources...");
        // Код для освобождения ресурсов OpenGL
    }
}
