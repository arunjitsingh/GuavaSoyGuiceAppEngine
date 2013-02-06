package net.arunjitsingh.gsgae;

import net.arunjitsingh.gsgae.soy.HomeSoyInfo;

import com.google.common.base.Strings;
import com.google.common.net.MediaType;
import com.google.inject.Singleton;
import com.google.template.soy.data.SoyMapData;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@Singleton
public class HomeServlet extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    SoyMapData data = new SoyMapData();
    SoyMapData page = new SoyMapData();
    page.put("title", "Hello!");
    data.put("page", page);
    data.put("query", Strings.nullToEmpty(req.getParameter("q")));
    String content = SoyRenderer.render(SoyCache.getCache().getTofu(), HomeSoyInfo.MAIN, data, null);
    resp.setContentType(MediaType.HTML_UTF_8.toString());
    resp.getWriter().print(content);
  }
}
