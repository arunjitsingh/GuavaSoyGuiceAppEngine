// This file was automatically generated from base.soy.
// Please don't edit this file by hand.

package net.arunjitsingh.gsgae.soy;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.template.soy.parseinfo.SoyFileInfo;
import com.google.template.soy.parseinfo.SoyTemplateInfo;


/**
 * Soy parse info for base.soy.
 */
public class BaseSoyInfo extends SoyFileInfo {


  /** This Soy file's namespace. */
  public static final String __NAMESPACE__ = "gsgae.templates.base";


  public static class TemplateName {
    private TemplateName() {}

    /** The full template name of the .main template. */
    public static final String MAIN = "gsgae.templates.base.main";
  }


  /**
   * Param names from all templates in this Soy file.
   */
  public static class Param {
    private Param() {}

  }


  /**
   * The basic page layout.
   */
  public static class MainSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.base.main";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".main";

    // Indirect params.
    /** Listed by gsgae.templates.query.resultHeader. */
    public static final String QUERY = "query";

    private MainSoyTemplateInfo() {
      super(
          "gsgae.templates.base.main",
          ImmutableMap.<String, ParamRequisiteness>builder()
              .put("query", ParamRequisiteness.REQUIRED)
              .build(),
          ImmutableSortedSet.<String>of(
              "page"),
          false,
          true);
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


  private BaseSoyInfo() {
    super(
        "base.soy",
        "gsgae.templates.base",
        ImmutableSortedSet.<String>of(),
        ImmutableList.<SoyTemplateInfo>of(
            MAIN),
        ImmutableMap.<String, CssTagsPrefixPresence>of());
  }


  private static final BaseSoyInfo __INSTANCE__ =
      new BaseSoyInfo();

  public static BaseSoyInfo getInstance() {
    return __INSTANCE__;
  }

}
