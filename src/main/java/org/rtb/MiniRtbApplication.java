package org.rtb;

import java.time.LocalDateTime;

import org.rtb.model.Widget;
import org.rtb.repository.WidgetRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MiniRtbApplication {
  public static void main(String[] args) {
    SpringApplication.run(MiniRtbApplication.class, args);
  }

  @Bean
  WidgetRepository widgetRepository() {
    WidgetRepository widgetRepository = new WidgetRepository();

    for (int i = 0; i < 10; i++) {
      widgetRepository.create(
          new Widget(null, i * 20, i * 20, null, LocalDateTime.now())
      );
    }

    return widgetRepository;
  }
}
