// This file was automatically generated from query.soy.
// Please don't edit this file by hand.

package net.arunjitsingh.gsgae.soy;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.template.soy.parseinfo.SoyFileInfo;
import com.google.template.soy.parseinfo.SoyTemplateInfo;


/**
 * Soy parse info for query.soy.
 */
public class QuerySoyInfo extends SoyFileInfo {


  /** This Soy file's namespace. */
  public static final String __NAMESPACE__ = "gsgae.templates.query";


  public static class TemplateName {
    private TemplateName() {}

    /** The full template name of the .resultHeader template. */
    public static final String RESULT_HEADER = "gsgae.templates.query.resultHeader";
  }


  /**
   * Param names from all templates in this Soy file.
   */
  public static class Param {
    private Param() {}

    /** Listed by .resultHeader. */
    public static final String QUERY = "query";
  }


  /**
   * Query results header.
   */
  public static class ResultHeaderSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.query.resultHeader";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".resultHeader";

    /** The query. */
    public static final String QUERY = "query";

    private ResultHeaderSoyTemplateInfo() {
      super(
          "gsgae.templates.query.resultHeader",
          ImmutableMap.<String, ParamRequisiteness>builder()
              .put("query", ParamRequisiteness.REQUIRED)
              .build(),
          ImmutableSortedSet.<String>of(),
          false,
          false);
    }

    private static final ResultHeaderSoyTemplateInfo __INSTANCE__ =
        new ResultHeaderSoyTemplateInfo();

    public static ResultHeaderSoyTemplateInfo getInstance() {
      return __INSTANCE__;
    }
  }

  /** Same as ResultHeaderSoyTemplateInfo.getInstance(). */
  public static final ResultHeaderSoyTemplateInfo RESULT_HEADER =
      ResultHeaderSoyTemplateInfo.getInstance();


  private QuerySoyInfo() {
    super(
        "query.soy",
        "gsgae.templates.query",
        ImmutableSortedSet.<String>of(
            Param.QUERY),
        ImmutableList.<SoyTemplateInfo>of(
            RESULT_HEADER),
        ImmutableMap.<String, CssTagsPrefixPresence>of());
  }


  private static final QuerySoyInfo __INSTANCE__ =
      new QuerySoyInfo();

  public static QuerySoyInfo getInstance() {
    return __INSTANCE__;
  }

}
