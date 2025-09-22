@SpringBootApplication
public class FoodApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FoodApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FoodApplication.class, args);
    }
}
