package model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductionConnection {

    // TODO: simplify JSON to use names only (need to connect back to production model)
    private ProductionUnit source;

    private ProductionUnit destination;

}
