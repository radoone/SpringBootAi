package ibm.com.demo.springbootai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ibm.com.demo.springbootai.model.Bubble;
import ibm.com.demo.springbootai.repository.BubbleRepository;

@Configuration
public class DatabaseConfig {

    @Autowired
    private BubbleRepository bubbleRepository;

    @Bean
    public CommandLineRunner initDatabase() {
        return args -> {
            // Clear existing data
            bubbleRepository.deleteAll();

            // Add test data
            Bubble bubble1 = new Bubble();
            bubble1.setName("Rainbow Sparkle");
            bubble1.setDescription("Magical rainbow-flavoured bubbles that make your water sparkle with joy! Perfect for kids who love colourful drinks!");
            bubble1.setPrice(2.99);
            bubble1.setFlavour("Rainbow");
            bubble1.setStockQuantity(100);
            bubble1.setImageUrl("/images/bubbles1.webp");
            bubbleRepository.save(bubble1);

            Bubble bubble2 = new Bubble();
            bubble2.setName("Ocean Wave");
            bubble2.setDescription("Ocean-inspired bubbles that bring the sea to your water! With just a little a hint of blueberry and mint flavour.");
            bubble2.setPrice(3.49);
            bubble2.setFlavour("Ocean");
            bubble2.setStockQuantity(75);
            bubble2.setImageUrl("/images//bubbles2.webp");
            bubbleRepository.save(bubble2);



            Bubble bubble3 = new Bubble();
            bubble3.setName("Tropical Paradise");
            bubble3.setDescription("Exotic fruit-flavoured bubbles that transform your water into a tropical drink! Mix of mango, pineapple, and passion fruit.");
            bubble3.setPrice(2.79);
            bubble3.setFlavour("Tropical");
            bubble3.setStockQuantity(120);
            bubble3.setImageUrl("/images/bubbles3.png");
            bubbleRepository.save(bubble3);

            Bubble bubble4 = new Bubble();
            bubble4.setName("Strawberry Dream");
            bubble4.setDescription("Sweet strawberry-flavoured bubbles that make your water taste like a summer day!");
            bubble4.setPrice(2.49);
            bubble4.setFlavour("Strawberry");
            bubble4.setStockQuantity(90);
            bubble4.setImageUrl("/images/bubbles4.jpg");
            bubbleRepository.save(bubble4);

            Bubble bubble5 = new Bubble();
            bubble5.setName("Lemon Zest");
            bubble5.setDescription("Fresh and zesty lemon bubbles that give your water a refreshing kick!");
            bubble5.setPrice(2.29);
            bubble5.setFlavour("Lemon");
            bubble5.setStockQuantity(150);
            bubble5.setImageUrl("/images/bubbles5.jpg");
            bubbleRepository.save(bubble5);

            Bubble bubble6 = new Bubble();
            bubble6.setName("Cherry Blast");
            bubble6.setDescription("Delicious cherry-flavoured bubbles that make your water taste like a cherry soda!");
            bubble6.setPrice(2.69);
            bubble6.setFlavour("Cherry");
            bubble6.setStockQuantity(110);
            bubble6.setImageUrl("/images/bubbles6.jpg");
            bubbleRepository.save(bubble6);
            
        };
    }
} 