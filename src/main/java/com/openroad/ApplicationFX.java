package com.openroad;

import java.io.IOException;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.openroad.controller.Fluxo;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ApplicationFX extends Application {

    private static ConfigurableApplicationContext contextSpring;

    @Override
    public void init() {
        String[] args = getParameters().getRaw().toArray(new String[0]);

        ApplicationFX.contextSpring = new SpringApplicationBuilder()
                .sources(OpenRoadApplication.class)
                .run(args);
    }

    @FXML
    void initialize() {
    }

    @Override
    public void stop() {
        ApplicationFX.contextSpring.close();
        Platform.exit();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Fluxo.load(stage);
    }

    public static ConfigurableApplicationContext getContextSpring() {
        return contextSpring;
    }

}
