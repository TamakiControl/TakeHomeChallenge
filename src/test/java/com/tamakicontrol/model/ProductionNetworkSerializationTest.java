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

    private String outputFilepath ="target/productionNetwork1.json";
    ObjectMapper objectMapper = new ObjectMapper();
    ProductionMaterial milk = new ProductionMaterial("Milk", "RMS1-210813");

    ProductionUnit milkSilo = new ProductionUnit("MilkSilo1", ProductionUnitType.ProductionContinuous, 0.0);
    ProductionUnit milkUF = new ProductionUnit("MilkUF1", ProductionUnitType.ProductionContinuous, 0.0);
    ProductionConnection milkSiloToUF = new ProductionConnection(milkSilo, milkUF);
    ProductionNetwork productionNetwork = new ProductionNetwork(Arrays.asList(milkSilo, milkUF), Arrays.asList(milkSiloToUF));

    ProductionMovement productionMovement = new ProductionMovement(milk,
            milkSiloToUF, new Date(1628860894), new Date(1628864494), 42.0);

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
