public class DirectXAdapter implements GraphicsAPI {
    @Override
    public void initialize() {
        System.out.println("Initializing DirectX...");
        // Код для инициализации DirectX
    }

    @Override
    public void render() {
        System.out.println("Rendering with DirectX...");
        // Код для отрисовки объектов с использованием DirectX
    }

    @Override
    public void cleanup() {
        System.out.println("Cleaning up DirectX resources...");
        // Код для освобождения ресурсов DirectX
    }
}
