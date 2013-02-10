package net.arunjitsingh.gsgae.example;

import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class GuiceBootstrapListener extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new ApplicationModule());
  }
}