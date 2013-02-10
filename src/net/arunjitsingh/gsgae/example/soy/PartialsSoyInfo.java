// This file was automatically generated from partials.soy.
// Please don't edit this file by hand.

package net.arunjitsingh.gsgae.example.soy;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.template.soy.parseinfo.SoyFileInfo;
import com.google.template.soy.parseinfo.SoyTemplateInfo;


/**
 * Soy parse info for partials.soy.
 */
public class PartialsSoyInfo extends SoyFileInfo {


  /** This Soy file's namespace. */
  public static final String __NAMESPACE__ = "gsgae.templates.partials";


  public static class TemplateName {
    private TemplateName() {}

    /** The full template name of the .queryResults template. */
    public static final String QUERY_RESULTS = "gsgae.templates.partials.queryResults";
  }


  /**
   * Param names from all templates in this Soy file.
   */
  public static class Param {
    private Param() {}

    /** Listed by .queryResults. */
    public static final String QUERY = "query";
    /** Listed by .queryResults. */
    public static final String RESULTS = "results";
  }


  /**
   * Query results.
   */
  public static class QueryResultsSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
    public static final String __NAME__ = "gsgae.templates.partials.queryResults";
    /** This template's partial name. */
    public static final String __PARTIAL_NAME__ = ".queryResults";

    /** The query. */
    public static final String QUERY = "query";
    /** The result-set. */
    public static final String RESULTS = "results";

    private QueryResultsSoyTemplateInfo() {
      super(
          "gsgae.templates.partials.queryResults",
          ImmutableMap.<String, ParamRequisiteness>builder()
              .put("query", ParamRequisiteness.REQUIRED)
              .put("results", ParamRequisiteness.REQUIRED)
              .build(),
          ImmutableSortedSet.<String>of(),
          false,
          false);
    }

    private static final QueryResultsSoyTemplateInfo __INSTANCE__ =
        new QueryResultsSoyTemplateInfo();

    public static QueryResultsSoyTemplateInfo getInstance() {
      return __INSTANCE__;
    }
  }

  /** Same as QueryResultsSoyTemplateInfo.getInstance(). */
  public static final QueryResultsSoyTemplateInfo QUERY_RESULTS =
      QueryResultsSoyTemplateInfo.getInstance();


  private PartialsSoyInfo() {
    super(
        "partials.soy",
        "gsgae.templates.partials",
        ImmutableSortedSet.<String>of(
            Param.QUERY,
            Param.RESULTS),
        ImmutableList.<SoyTemplateInfo>of(
            QUERY_RESULTS),
        ImmutableMap.<String, CssTagsPrefixPresence>of());
  }


  private static final PartialsSoyInfo __INSTANCE__ =
      new PartialsSoyInfo();

  public static PartialsSoyInfo getInstance() {
    return __INSTANCE__;
  }

}
