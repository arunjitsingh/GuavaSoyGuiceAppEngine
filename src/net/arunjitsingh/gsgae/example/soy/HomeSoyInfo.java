// This file was automatically generated from home.soy.
// Please don't edit this file by hand.

package net.arunjitsingh.gsgae.example.soy;

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

    /** The full template name of the .main template. */
    public static final String MAIN = "gsgae.templates.home.main";
  }


  /**
   * Param names from all templates in this Soy file.
   */
  public static class Param {
    private Param() {}

  }


  /**
   * The home page.
   */
  public static class MainSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.home.main";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".main";

    // Indirect params.
    /** Listed by gsgae.templates.partials.queryResults. */
    public static final String QUERY = "query";
    /** Listed by gsgae.templates.partials.queryResults. */
    public static final String RESULTS = "results";

    private MainSoyTemplateInfo() {
      super(
          "gsgae.templates.home.main",
          ImmutableMap.<String, ParamRequisiteness>builder()
              .put("query", ParamRequisiteness.REQUIRED)
              .put("results", ParamRequisiteness.REQUIRED)
              .build(),
          ImmutableSortedSet.<String>of(
              "page"),
          false,
          false);
    }

    private static final MainSoyTemplateInfo __INSTANCE__ =
        new MainSoyTemplateInfo();

    public static MainSoyTemplateInfo getInstance() {
      return __INSTANCE__;
    }
  }

  /** Same as MainSoyTemplateInfo.getInstance(). */
  public static final MainSoyTemplateInfo MAIN =
      MainSoyTemplateInfo.getInstance();


  private HomeSoyInfo() {
    super(
        "home.soy",
        "gsgae.templates.home",
        ImmutableSortedSet.<String>of(),
        ImmutableList.<SoyTemplateInfo>of(
            MAIN),
        ImmutableMap.<String, CssTagsPrefixPresence>of());
  }


  private static final HomeSoyInfo __INSTANCE__ =
      new HomeSoyInfo();

  public static HomeSoyInfo getInstance() {
    return __INSTANCE__;
  }

}
