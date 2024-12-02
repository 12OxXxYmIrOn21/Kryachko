// Фабрика для создания холодильников
class RefrigeratorFactory implements ApplianceFactory {
    @Override
    public Appliance createAppliance() {
        return new Refrigerator();
    }
}

