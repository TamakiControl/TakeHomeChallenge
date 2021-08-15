package com.tamakicontrol.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductRunSerializationTest {

    private String inputFilepath ="target/productionRun1.json";
    ProductionRun productionRun;
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testModelContents() throws IOException {
        productionRun = objectMapper.readValue(new File(inputFilepath), ProductionRun.class);
        assertEquals(productionRun.getProductionMovementList().size(), 78);
    }

}
