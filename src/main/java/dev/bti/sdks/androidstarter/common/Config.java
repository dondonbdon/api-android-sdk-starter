package dev.bti.sdks.androidstarter.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Config {
    public static Config INSTANCE;

    public static Config GetInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Config();
        }

        return INSTANCE;
    }

    String serverAddress = "10.0.2.2:7070";
}
