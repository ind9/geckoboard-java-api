package nl.pvanassen.geckoboard.api;

import java.io.IOException;

import com.google.gson.GsonBuilder;
import nl.pvanassen.geckoboard.api.gson.GsonFactory;

import nl.pvanassen.geckoboard.api.json.serializer.TextItemTypeAdaptor;
import nl.pvanassen.geckoboard.api.json.text.TextItemType;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;

public final class JsonTestHelper {

    public static JsonNode getJsonFromWidget(Push widget) throws JsonProcessingException, IOException {
        Gson gson = GsonFactory.getGson();
        WidgetWrapper wrapper = new WidgetWrapper(widget, "1234");

        ObjectMapper om = new ObjectMapper();
        return om.readTree(gson.toJson(wrapper));
    }
}
