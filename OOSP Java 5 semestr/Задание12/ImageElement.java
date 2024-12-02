class ImageElement extends DocumentElement {
    private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void print() {
        System.out.println("Image: " + imagePath);
    }
}