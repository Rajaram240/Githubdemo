package PackB;

import org.apache.logging.log4j.*;

public class demo {
   private static Logger log=LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
log.debug("I am debugging");

	log.info("object is present");

	log.error("object is not present");
	log.fatal("fatal");

	}

}
