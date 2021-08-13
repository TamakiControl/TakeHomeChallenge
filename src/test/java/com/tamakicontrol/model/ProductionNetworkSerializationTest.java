package com.tamakicontrol.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductionNetworkSerializationTest {

    private String outputFilepath ="target/testNetwork1.json";
    ObjectMapper objectMapper = new ObjectMapper();

    ProductionUnit milkSilo = new ProductionUnit("MilkSilo1", ProductionUnitType.ProductionContinuous, 0.0);
    ProductionUnit milkUF = new ProductionUnit("MilkUF1", ProductionUnitType.ProductionContinuous, 0.0);
    ProductionConnection milkSiloToUF = new ProductionConnection(milkSilo, milkUF);
    ProductionNetwork productionNetwork = new ProductionNetwork(Arrays.asList(milkSilo, milkUF), Arrays.asList(milkSiloToUF));


    @Before
    public void init() {
        // Delete previously generated serialization
        File outputFile = new File(outputFilepath);
        outputFile.delete();
    }

    @Test
    public void testModelSerialization() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(outputFilepath);
        objectMapper.writeValue(file, productionNetwork);
        assertTrue(file.exists());
    }

    @Test
    public void testModelDeserialization() throws IOException {
        ProductionNetwork loadedProductionMovement = objectMapper.readValue(new File(outputFilepath), ProductionNetwork.class);
        assertEquals(loadedProductionMovement, productionNetwork);
    }

}
