package net.arunjitsingh.gsgae;

import com.google.inject.servlet.ServletModule;

public class HomeServletModule extends ServletModule {
  @Override protected void configureServlets() {
    serve("/*").with(HomeServlet.class);
  }
}
