package dev.bti.sdks.androidstarter.client;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class InstantTypeAdapter extends TypeAdapter<Instant> {

    @Override
    public void write(JsonWriter out, Instant value) throws IOException {
        if (value != null) {
            out.value(DateTimeFormatter.ISO_INSTANT.format(value));
        } else {
            out.nullValue();
        }
    }

    @Override
    public Instant read(JsonReader in) throws IOException {
        String dateString = in.nextString();
        try {
            // Append 'Z' for UTC if not already present
            if (!dateString.endsWith("Z")) {
                dateString += "Z"; // Consider it in UTC
            }
            return Instant.parse(dateString);
        } catch (DateTimeParseException e) {
            // Handle the parsing exception
            e.printStackTrace();
            return null; // Or throw a custom exception
        }
    }
}
