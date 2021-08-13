package model;

import lombok.*;

import java.util.Date;

/**
 * A product transfer between two nodes
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductionMovement {

    private ProductionMaterial material;

    private ProductionConnection connection;

    private Date startDate;

    private Date endDate;

    private double quantity = 0.0;

}
