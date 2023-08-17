public class Train extends Vehicle{

    // Если мы задействуем механизм наследования,
    // классы обязательно должны иметь связь IS-A

    public Train(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
    }
}
