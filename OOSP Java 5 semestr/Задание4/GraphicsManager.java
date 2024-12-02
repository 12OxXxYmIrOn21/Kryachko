public class GraphicsManager {
    private GraphicsAPI graphicsAPI;

    public void setGraphicsAPI(GraphicsAPI graphicsAPI) {
        this.graphicsAPI = graphicsAPI;
    }

    public void initialize() {
        if (graphicsAPI != null) {
            graphicsAPI.initialize();
        } else {
            System.out.println("GraphicsAPI is not set!");
        }
    }

    public void render() {
        if (graphicsAPI != null) {
            graphicsAPI.render();
        } else {
            System.out.println("GraphicsAPI is not set!");
        }
    }

    public void cleanup() {
        if (graphicsAPI != null) {
            graphicsAPI.cleanup();
        } else {
            System.out.println("GraphicsAPI is not set!");
        }
    }
}

