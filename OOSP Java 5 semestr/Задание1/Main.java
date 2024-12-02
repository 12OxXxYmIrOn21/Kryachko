public class Main {
    public static void main(String[] args) {
        // Создаем фабрики для разных инструментов
        InstrumentFactory guitarFactory = new GuitarFactory();
        InstrumentFactory pianoFactory = new PianoFactory();
        InstrumentFactory violinFactory = new ViolinFactory();

        // Создаем инструменты через фабрики
        Instrument guitar = guitarFactory.createInstrument();
        Instrument piano = pianoFactory.createInstrument();
        Instrument violin = violinFactory.createInstrument();

        // Играем на каждом инструменте
        guitar.play();
        piano.play();
        violin.play();
    }
}

