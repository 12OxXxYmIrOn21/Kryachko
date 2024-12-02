public class Main {
    public static void main(String[] args) {
        GraphicsManager graphicsManager = new GraphicsManager();

        // Используем OpenGL
        graphicsManager.setGraphicsAPI(new OpenGLAdapter());
        graphicsManager.initialize();
        graphicsManager.render();
        graphicsManager.cleanup();

        // Используем DirectX
        graphicsManager.setGraphicsAPI(new DirectXAdapter());
        graphicsManager.initialize();
        graphicsManager.render();
        graphicsManager.cleanup();

        // Используем Vulkan
        graphicsManager.setGraphicsAPI(new VulkanAdapter());
        graphicsManager.initialize();
        graphicsManager.render();
        graphicsManager.cleanup();
    }
}
