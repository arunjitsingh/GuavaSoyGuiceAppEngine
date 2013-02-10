package net.arunjitsingh.gsgae.example.servlets;

import net.arunjitsingh.gsgae.core.soy.SoyRenderer;
import net.arunjitsingh.gsgae.example.soy.HomeSoyInfo;
import net.arunjitsingh.gsgae.example.soy.ExampleSoyCache;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.net.MediaType;
import com.google.inject.Singleton;
import com.google.template.soy.data.SoyMapData;
import com.google.template.soy.tofu.SoyTofu;

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
    data.put("results", Lists.newArrayList());

    SoyTofu tofu = ExampleSoyCache.getCache().getTofu();
    String content = SoyRenderer.render(tofu, HomeSoyInfo.MAIN, new SoyMapData(data), ij);

    resp.setContentType(MediaType.HTML_UTF_8.toString());
    resp.getWriter().print(content);
  }
}
