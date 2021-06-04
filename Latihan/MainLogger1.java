package Pratikum_PBO_3;
import Another_Pratikum_PBO_3.Logger;

public class MainLogger1 {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.debug("Debug with level " + logger.debugLevel);

        logger.debugLevel = 20;
        logger.info("Info with Level "+logger.debugLevel);
    }
}
