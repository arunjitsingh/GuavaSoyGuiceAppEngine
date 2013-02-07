// This file was automatically generated from home.soy.
// Please don't edit this file by hand.

package net.arunjitsingh.gsgae.soy;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.template.soy.parseinfo.SoyFileInfo;
import com.google.template.soy.parseinfo.SoyTemplateInfo;


/**
 * Soy parse info for home.soy.
 */
public class HomeSoyInfo extends SoyFileInfo {


  /** This Soy file's namespace. */
  public static final String __NAMESPACE__ = "gsgae.templates.home";


  public static class TemplateName {
    private TemplateName() {}

  }


  /**
   * Param names from all templates in this Soy file.
   */
  public static class Param {
    private Param() {}

  }


  private HomeSoyInfo() {
    super(
        "home.soy",
        "gsgae.templates.home",
        ImmutableSortedSet.<String>of(),
        ImmutableList.<SoyTemplateInfo>of(),
        ImmutableMap.<String, CssTagsPrefixPresence>of());
  }


  private static final HomeSoyInfo __INSTANCE__ =
      new HomeSoyInfo();

  public static HomeSoyInfo getInstance() {
    return __INSTANCE__;
  }

}
