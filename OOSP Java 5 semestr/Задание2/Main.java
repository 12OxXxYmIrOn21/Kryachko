public class Main {
    public static void main(String[] args) {
        // Создаем фабрики для каждой бытовой техники
        ApplianceFactory refrigeratorFactory = new RefrigeratorFactory();
        ApplianceFactory washingMachineFactory = new WashingMachineFactory();
        ApplianceFactory microwaveFactory = new MicrowaveFactory();

        // Создаем бытовую технику и запускаем ее работу
        Appliance refrigerator = refrigeratorFactory.createAppliance();
        refrigerator.operate();

        Appliance washingMachine = washingMachineFactory.createAppliance();
        washingMachine.operate();

        Appliance microwave = microwaveFactory.createAppliance();
        microwave.operate();
    }
}

