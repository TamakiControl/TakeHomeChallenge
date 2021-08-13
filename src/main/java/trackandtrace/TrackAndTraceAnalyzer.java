package trackandtrace;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.MaterialTrace;
import model.ProductionNetwork;
import model.ProductionRun;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * calculates Material traces from production network and
 */
public class TrackAndTraceAnalyzer {

    ProductionNetwork productionNetwork;

    List<MaterialTrace> products;


    public TrackAndTraceAnalyzer(ProductionNetwork productionNetwork) {
        this.productionNetwork = productionNetwork;
    }

    public List<MaterialTrace> analyzeRun(ProductionRun productionRun) {
        // TODO: create MaterialTraces

        return products;
    }

}
