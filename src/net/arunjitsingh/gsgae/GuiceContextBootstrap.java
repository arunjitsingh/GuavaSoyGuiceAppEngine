package net.arunjitsingh.gsgae;

import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceContextBootstrap extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new MainServletModule());
  }
}