package net.arunjitsingh.gsgae.core.soy;

import javax.annotation.Nullable;

import com.google.common.base.Preconditions;
import com.google.template.soy.data.SoyMapData;
import com.google.template.soy.parseinfo.SoyTemplateInfo;
import com.google.template.soy.tofu.SoyTofu;
import com.google.template.soy.tofu.SoyTofu.Renderer;

public class SoyRenderer {
  public static String render(
      SoyTofu tofu, SoyTemplateInfo tpl, @Nullable SoyMapData data, @Nullable SoyMapData ij) {
    Preconditions.checkNotNull(tofu);
    Preconditions.checkNotNull(tpl);
    Renderer renderer = tofu.newRenderer(tpl);
    if (data != null) {
      renderer.setData(data);
    }
    if (ij != null) {
      renderer.setIjData(ij);
    }
    return renderer.render();
  }
}
