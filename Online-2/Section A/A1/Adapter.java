public class Adapter implements WeatherProvider {
    private LegacyWeatherService legacyWeatherService;

    public Adapter(LegacyWeatherService legacyWeatherService) {
        this.legacyWeatherService = legacyWeatherService;
    }

    @Override
    public String fetchWeather() {
        return legacyWeatherService.getWeatherData();
    }
}
