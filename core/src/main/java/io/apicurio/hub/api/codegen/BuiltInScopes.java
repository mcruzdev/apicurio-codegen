package io.apicurio.hub.api.codegen;

import org.jboss.forge.roaster.model.source.JavaClassSource;

public enum BuiltInScopes {
   REQUEST_SCOPED("REQUEST_SCOPED", "RequestScoped"),
   APPLICATION_SCOPED("APPLICATION_SCOPED","ApplicationScoped"),
   SESSION_SCOPED("SESSION_SCOPED", "SessionScoped"),
   CONVERSATION_SCOPED("CONVERSATION_SCOPED", "ConversationScoped");

   private final String name;
   private final String javaName;

   BuiltInScopes(String name, String javaName) {
      this.name = name;
      this.javaName = javaName;
   }

   public String getName() {
      return name;
   }

   public String getJavaName() {
      return javaName;
   }
}
