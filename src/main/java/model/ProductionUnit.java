package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

/**
 * a node of Production network graph
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "name")
public class ProductionUnit {

    /**
     * Unique identifier
     */
    private String name;

    /**
     * Type of production unit, defines tracing behavior
     * Can be ProductionContinuous, ProductionBatch, IngredientAddition, FinalProductSink
     */
    private ProductionUnitType unitType;

    /**
     * The amount of time in seconds that an input continues to contribute to the output after addition has stopped
     */
    private double residenceTime;

}
