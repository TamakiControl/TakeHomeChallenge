package model;

import lombok.*;

import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductionMovement {

    private ProductionMaterial material;

    // TODO: simplify JSON to use names only (need to connect back to production model)
    private ProductionConnection connection;

    private Date startDate;

    private Date endDate;

    private double quantity = 0.0;

}
