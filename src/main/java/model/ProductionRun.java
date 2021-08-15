package model;

import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * Product transfer information for a period of time
 * production network is included to conveniently define the entire system within json exports
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductionRun {

    private Date startDate;

    private Date endDate;

    ProductionNetwork productionNetwork;

    private List<ProductionMovement> productionMovementList;
}
