package net.arunjitsingh.gsgae.example.soy;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.template.soy.SoyFileSet;
import com.google.template.soy.tofu.SoyTofu;

import java.util.List;

import javax.annotation.Nullable;

public class ExampleSoyCache {
  private static final String PREFIX = "/net/arunjitsingh/gsgae/example/templates/";
  private static final List<String> SOY_FILES = Lists.newArrayList(
      "base.soy",
      "home.soy",
      "partials.soy");

  private static ExampleSoyCache cache = new ExampleSoyCache(PREFIX, SOY_FILES);

  private ImmutableList<String> soyFiles;
  private SoyTofu tofu;
  private String prefix;

  private ExampleSoyCache(@Nullable String prefix, List<String> files) {
    soyFiles = ImmutableList.copyOf(Preconditions.checkNotNull(files));
    this.prefix = Strings.nullToEmpty(prefix);
    createTofu();
  }

  protected void createTofu() {
    SoyFileSet.Builder builder = new SoyFileSet.Builder();
    for (String name : soyFiles) {
      name = prefix + name;
      builder = builder.add(Preconditions.checkNotNull(this.getClass().getResource(name)));
    }
    SoyFileSet sfs = builder.build();
    tofu = sfs.compileToTofu();
  }

  public SoyTofu getTofu() {
    return tofu;
  }

  public static ExampleSoyCache getCache() {
    return cache;
  }
}
