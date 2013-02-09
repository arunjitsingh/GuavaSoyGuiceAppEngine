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
    /** The full template name of the .head template. */
    public static final String HEAD = "gsgae.templates.base.head";
    /** The full template name of the .pageHeader template. */
    public static final String PAGE_HEADER = "gsgae.templates.base.pageHeader";
    /** The full template name of the .pageFooter template. */
    public static final String PAGE_FOOTER = "gsgae.templates.base.pageFooter";
  }


  /**
   * Param names from all templates in this Soy file.
   */
  public static class Param {
    private Param() {}

    /** Listed by .main. */
    public static final String MAIN_CONTENT = "mainContent";
  }


  /**
   * The basic page layout.
   */
  public static class MainSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.base.main";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".main";

    /** HTML content for #main. */
    public static final String MAIN_CONTENT = "mainContent";

    private MainSoyTemplateInfo() {
      super(
          "gsgae.templates.base.main",
          ImmutableMap.<String, ParamRequisiteness>builder()
              .put("mainContent", ParamRequisiteness.REQUIRED)
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


  /**
   * .
   */
  public static class HeadSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.base.head";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".head";

    private HeadSoyTemplateInfo() {
      super(
          "gsgae.templates.base.head",
          ImmutableMap.<String, ParamRequisiteness>of(),
          ImmutableSortedSet.<String>of(
              "page"),
          false,
          false);
    }

    private static final HeadSoyTemplateInfo __INSTANCE__ =
        new HeadSoyTemplateInfo();

    public static HeadSoyTemplateInfo getInstance() {
      return __INSTANCE__;
    }
  }

  /** Same as HeadSoyTemplateInfo.getInstance(). */
  public static final HeadSoyTemplateInfo HEAD =
      HeadSoyTemplateInfo.getInstance();


  /**
   * .
   */
  public static class PageHeaderSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.base.pageHeader";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".pageHeader";

    private PageHeaderSoyTemplateInfo() {
      super(
          "gsgae.templates.base.pageHeader",
          ImmutableMap.<String, ParamRequisiteness>of(),
          ImmutableSortedSet.<String>of(
              "page"),
          false,
          false);
    }

    private static final PageHeaderSoyTemplateInfo __INSTANCE__ =
        new PageHeaderSoyTemplateInfo();

    public static PageHeaderSoyTemplateInfo getInstance() {
      return __INSTANCE__;
    }
  }

  /** Same as PageHeaderSoyTemplateInfo.getInstance(). */
  public static final PageHeaderSoyTemplateInfo PAGE_HEADER =
      PageHeaderSoyTemplateInfo.getInstance();


  /**
   * .
   */
  public static class PageFooterSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.base.pageFooter";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".pageFooter";

    private PageFooterSoyTemplateInfo() {
      super(
          "gsgae.templates.base.pageFooter",
          ImmutableMap.<String, ParamRequisiteness>of(),
          ImmutableSortedSet.<String>of(
              "page"),
          false,
          false);
    }

    private static final PageFooterSoyTemplateInfo __INSTANCE__ =
        new PageFooterSoyTemplateInfo();

    public static PageFooterSoyTemplateInfo getInstance() {
      return __INSTANCE__;
    }
  }

  /** Same as PageFooterSoyTemplateInfo.getInstance(). */
  public static final PageFooterSoyTemplateInfo PAGE_FOOTER =
      PageFooterSoyTemplateInfo.getInstance();


  private BaseSoyInfo() {
    super(
        "base.soy",
        "gsgae.templates.base",
        ImmutableSortedSet.<String>of(
            Param.MAIN_CONTENT),
        ImmutableList.<SoyTemplateInfo>of(
            MAIN,
            HEAD,
            PAGE_HEADER,
            PAGE_FOOTER),
        ImmutableMap.<String, CssTagsPrefixPresence>of());
  }


  private static final BaseSoyInfo __INSTANCE__ =
      new BaseSoyInfo();

  public static BaseSoyInfo getInstance() {
    return __INSTANCE__;
  }

}
