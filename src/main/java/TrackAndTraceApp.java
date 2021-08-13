import com.fasterxml.jackson.databind.ObjectMapper;
import model.MaterialTrace;
import model.ProductionMovement;
import model.ProductionNetwork;
import model.ProductionRun;
import trackandtrace.TrackAndTraceAnalyzer;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrackAndTraceApp {

    private static final Logger logger = Logger.getLogger(TrackAndTraceApp.class.getName());

    private static Object loadJSON(String outputFilepath, Class modelType) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(outputFilepath), modelType);
    }

    public static void main(String[] args) throws IOException {
        // Create analyzer for plant configuration
        ProductionNetwork productionNetwork = (ProductionNetwork) loadJSON("target/exampleNetwork1.json", ProductionNetwork.class);
        TrackAndTraceAnalyzer trackAndTrace = new TrackAndTraceAnalyzer(productionNetwork);

        // load a run and analyze it
        ProductionRun productionRun = (ProductionRun) loadJSON("target/exampleRun1.json", ProductionRun.class);
        List<MaterialTrace> products = trackAndTrace.analyzeRun(productionRun);

        //TODO: fix outputting bug: find a way to serialize the results into JSON
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("target/final_products.json");
            objectMapper.writeValue(file, products);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error outputting results file", e);
        }
    }
}
