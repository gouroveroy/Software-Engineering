public class WebServerFactory {
    public static WebServer createFrameWork(String frameWork) {
        switch (frameWork) {
            case "Django":
                return new Django();

            case "NodeJS":
                return new NodeJS();

            case "Ruby":
                return new Ruby();

            default:
                return null;
        }
    }
}
