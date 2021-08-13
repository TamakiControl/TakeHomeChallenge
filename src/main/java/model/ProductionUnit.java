package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "name")
public class ProductionUnit {

    private String name;

    // ProductionContinuous, ProductionBatch, IngredientAddition, FinalProductSink, Resevorior
    //@Enumerated(EnumType.STRING)
    private ProductionUnitType unitType;

    private double residenceTime;

}
