package net.arunjitsingh.gsgae.example;

import net.arunjitsingh.gsgae.example.servlets.HomeServlet;

import com.google.inject.AbstractModule;
import com.google.inject.servlet.ServletModule;
import com.google.template.soy.SoyModule;
import com.google.template.soy.xliffmsgplugin.XliffMsgPluginModule;

public class ApplicationModule extends AbstractModule {

  private class ServingConfigurationModule extends ServletModule {
    @Override
    protected void configureServlets() {
      serve("/").with(HomeServlet.class);
    }
  }

  @Override
  protected void configure() {
    install(new SoyModule());
    install(new XliffMsgPluginModule());
    install(new ServingConfigurationModule());
  }

}
