public class ViolinFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Violin();
    }
}