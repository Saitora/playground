package com.example.demo.serdes;

import com.example.demo.web.controller.model.TipModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class TipModelDeserializer extends JsonDeserializer<TipModel> {

    private JsonDeserializer<?> defaultDeserializer;

    protected TipModelDeserializer(JsonDeserializer<?> defaultDeserializer) {
        this.defaultDeserializer = defaultDeserializer;
    }

    @Override
    public TipModel deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
        return (TipModel) defaultDeserializer.deserialize(jsonParser, context);
    }

}