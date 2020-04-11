package temperatureConverter;

public class ConverterToFahrenheit extends Converter implements ConvertValue, GetConvertedValue {

    // унаследованый конструктор
    public ConverterToFahrenheit(double basicValue) {
        super(basicValue);
    }

    // метод интерфейса, который выполняет конвертацию и запись в соответствующую переменную
    @Override
    public void convertValue() {
        this.convertValue = (this.basicValue * 9.0 / 5.0) + 32.0;
    }

    // метод интерфейса, возвращает сконвертированное значение
    @Override
    public double getConvertedValue() {
        return this.convertValue;
    }
}
