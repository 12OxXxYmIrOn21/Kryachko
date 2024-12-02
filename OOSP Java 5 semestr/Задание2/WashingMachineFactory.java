// Фабрика для создания стиральных машин
class WashingMachineFactory implements ApplianceFactory {
    @Override
    public Appliance createAppliance() {
        return new WashingMachine();
    }
}

