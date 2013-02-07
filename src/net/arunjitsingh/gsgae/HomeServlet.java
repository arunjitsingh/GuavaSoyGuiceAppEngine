package net.arunjitsingh.gsgae;

import net.arunjitsingh.gsgae.soy.BaseSoyInfo;

import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet;
import com.google.common.net.MediaType;
import com.google.inject.Singleton;
import com.google.template.soy.data.SoyMapData;
import com.google.template.soy.tofu.SoyTofu;
import com.google.template.soy.tofu.SoyTofu.Renderer;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@Singleton
public class HomeServlet extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    SoyMapData ij = new SoyMapData();
    SoyMapData page = new SoyMapData();
    page.put("title", "Hello!");
    ij.put("page", page);

    Map<String, Object> data = Maps.<String, Object> newHashMap();
    data.put("query", Strings.nullToEmpty(req.getParameter("q")));

    SoyTofu tofu = SoyCache.getCache().getTofu();
    Renderer renderer = tofu.newRenderer(BaseSoyInfo.MAIN);
    renderer.setActiveDelegatePackageNames(ImmutableSet.of("HomePage"));
    renderer.setData(new SoyMapData(data)).setIjData(ij);

    String content = renderer.render();
    resp.setContentType(MediaType.HTML_UTF_8.toString());
    resp.getWriter().print(content);
  }
}
