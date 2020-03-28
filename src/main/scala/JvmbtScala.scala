import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Pizza {
  val logger = LoggerFactory.getLogger(classOf[Pizza])
  logger.info("Hello from the Pizza class")
}

object JvmbtScala extends App {
  val p = new Pizza
}