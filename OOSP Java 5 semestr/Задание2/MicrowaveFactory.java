
// Фабрика для создания микроволновых печей
class MicrowaveFactory implements ApplianceFactory {
    @Override
    public Appliance createAppliance() {
        return new Microwave();
    }
}
