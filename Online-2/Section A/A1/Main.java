public class Main {
    public static void main(String[] args) {
        // Legacy service instance
        LegacyWeatherService legacyWeatherService = new LegacyWeatherService();
        // ??
        WeatherApp app = new WeatherApp(new Adapter(legacyWeatherService));
        app.displayWeather(); // Output: Legacy weather data
    }
}
