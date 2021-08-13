package model;

import lombok.*;

/**
 * An edge of production network graph
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductionConnection {

    private ProductionUnit source;

    private ProductionUnit destination;

}
