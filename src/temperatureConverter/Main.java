package temperatureConverter;

public class Main {
    public static void main(String[] args) {
        // создал по одному объекту каждого класса
        ConverterToFahrenheit toFahrenheit = new ConverterToFahrenheit(45.4);
        ConverterToKelvin toKelvin = new ConverterToKelvin(-300);

        //сконвертировал
        toFahrenheit.convertValue();
        //вывод
        System.out.println(toFahrenheit.getBasicValue() +
                " градусов по Цельсию это " +
                toFahrenheit.getConvertedValue() +
                " градусов по Фаренгейту");

        //сконвертировал
        toKelvin.convertValue();
        //вывод
        System.out.println(toKelvin.getBasicValue() +
                " градусов по Цельсию это " +
                toKelvin.getConvertedValue() +
                " градусов по Кельвину");
    }
}
