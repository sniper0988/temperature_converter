package temperatureConverter;

//родительский класс конвертеров
//      1.Каждый класс-конвертер хранит базовое значение (по цельсию), это значение можно задать
//      через конструктор или через сеттер.
//      2.Каждый класс-конвертер хранит сконвертированное значение
//      3.Каждый конвертер хранит свойства необходимые ему для конвертации температуры
//      (значения этих свойств их нельзя изменить (final))
public abstract class Converter {
    protected double basicValue;        // исходное значение
    protected double convertValue;      // конвертированое значение

    // конструктор, принимает на вход базовое значение
    public Converter(double basicValue) {
        setBasicValue(basicValue);
    }

    // геттер
    public double getBasicValue() {
        return basicValue;
    }

    //сеттер, проверяет чтобы температура была не ниже абсолютного нуля
    public void setBasicValue(double basicValue) {
        if(basicValue >= -273.0){
            this.basicValue = basicValue;
        } else {
            System.out.println("Абсолютный ноль -273 градусов по Цельсию. Температура ниже быть не может");
            this.basicValue = -273.0;
        }
    }

    public static ConvertValue getConverter(String converter){
        if(converter.equals("FR")){
            return new ConverterToFahrenheit(0);
        } else if (converter.equals("KL")){
            return new ConverterToKelvin(0);
        }
        return null;
    }

}
