package temperatureConverter;

public class ConverterToKelvin extends Converter implements ConvertValue,GetConvertedValue {

    // унаследованый конструктор
    public ConverterToKelvin(double basicValue) {
        super(basicValue);
    }

    // метод интерфейса, который выполняет конвертацию и запись в соответствующую переменную
    @Override
    public void convertValue() {
        this.convertValue = this.basicValue + 273.0;
    }

    // метод интерфейса, возвращает сконвертированное значение
    @Override
    public double getConvertedValue() {
        return this.convertValue;
    }
}
