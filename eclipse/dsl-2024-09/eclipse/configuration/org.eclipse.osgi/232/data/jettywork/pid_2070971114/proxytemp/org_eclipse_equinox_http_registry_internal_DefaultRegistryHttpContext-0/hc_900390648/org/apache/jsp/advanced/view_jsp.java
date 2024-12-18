/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/12.0.12
 * Generated at: 2024-11-13 15:47:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;
import org.eclipse.help.webapp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/advanced/header.jsp", Long.valueOf(1725338750000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(7);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("org.eclipse.help.webapp");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("org.eclipse.help.internal.webapp.data");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
 
request.setCharacterEncoding("UTF-8");
boolean isRTL = UrlUtil.isRTL(request, response);
String  direction = isRTL?"rtl":"ltr";

      out.write(" \n");
      out.write(" <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\n");
      out.write("<!--\n");
      out.write(" ! Copyright (c) 2000, 2018 IBM Corporation and others.\n");
      out.write(" !\n");
      out.write(" ! This program and the accompanying materials \n");
      out.write(" ! are made available under the terms of the Eclipse Public License 2.0\n");
      out.write(" ! which accompanies this distribution, and is available at\n");
      out.write(" ! https://www.eclipse.org/legal/epl-2.0/\n");
      out.write(" !\n");
      out.write(" ! SPDX-License-Identifier: EPL-2.0\n");
      out.write(" ! \n");
      out.write(" ! Contributors:\n");
      out.write(" !     IBM Corporation - initial API and implementation\n");
      out.write(" -->");
      out.write('\n');
      out.write('\n');
 
	new ActivitiesData(application, request, response); // here it can turn filtering on or off
	LayoutData data = new LayoutData(application,request, response);
	AbstractView view = data.getCurrentView();
	if (view == null) return;

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.print(ServletResources.getString("locale", request));
      out.write("\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>");
      out.print(ServletResources.getString(view.getName(), request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function onloadHandler(e)\n");
      out.write("{\n");
      out.write("    resize();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function resize()\n");
      out.write("{\n");
 if (data.isIE() || data.isMozilla() && "1.2.1".compareTo(data.getMozillaVersion()) <=0){

      out.write("	var titleText=window.");
      out.print(view.getName());
      out.write("ToolbarFrame.document.getElementById(\"titleText\");\n");
      out.write("	if (!titleText) return;\n");
      out.write("	var h=titleText.offsetHeight; ");
      out.write("\n");
      out.write("	if(h<=19){\n");
      out.write("		return; ");
      out.write("\n");
      out.write("	}\n");
      out.write("	document.getElementById(\"viewFrameset\").setAttribute(\"rows\", (11+h)+\",*\"); ");
      out.write("\n");
      out.write("	window.");
      out.print(view.getName());
      out.write("ToolbarFrame.document.getElementById(\"titleTextTableDiv\").style.height=(9+h)+\"px\"; ");
      out.write('\n');
}
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("var resized = false;\n");
      out.write("\n");
      out.write("// Called when the view is made visible. This function is needed because \n");
      out.write("// with IE the resize only works after the view has been displayed for the first time.\n");
      out.write("\n");
      out.write("function onShow() \n");
      out.write("{\n");
      out.write("    if (!resized) {\n");
      out.write("        resize();\n");
      out.write("        resized = true;\n");
      out.write("    }\n");
      out.write("    try{\n");
      out.write("		window.");
      out.print(view.getName());
      out.write("ViewFrame.onShow();\n");
      out.write("	} catch(ex) {}\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<frameset id=\"viewFrameset\" onload=\"onloadHandler()\" rows=\"24,*\" frameborder=\"0\" framespacing=\"0\" border=0  >\n");
      out.write("	<frame id=\"toolbar\" name=\"");
      out.print(view.getName());
      out.write("ToolbarFrame\" title=\"");
      out.print(ServletResources.getString(view.getName()+"ViewToolbar", request));
      out.write("\" \n");
      out.write("	    src='");
      out.print(data.getAdvancedURL(view,"Toolbar.jsp"));
      out.write("'  marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" noresize=0>\n");
      out.write("	");

	if (view.isDeferred()) {
	
      out.write("\n");
      out.write("		<frame name='");
      out.print(view.getName());
      out.write("ViewFrame' title=\"");
      out.print(ServletResources.getString(view.getName()+"View", request));
      out.write("\" \n");
      out.write("		    src='");
      out.print("deferredView.jsp?href="+data.getAdvancedURL(view,"View.jsp")+"?"+UrlUtil.htmlEncode(request.getQueryString()));
      out.write("'  marginwidth=\"10\" marginheight=\"0\" frameborder=\"0\" >\n");
      out.write("	");

	}
	else {
	
      out.write("\n");
      out.write("		<frame name='");
      out.print(view.getName());
      out.write("ViewFrame' title=\"");
      out.print(ServletResources.getString(view.getName()+"View", request));
      out.write("\" \n");
      out.write("		    src='");
      out.print(data.getAdvancedURL(view,"View.jsp") + "?" + UrlUtil.htmlEncode(request.getQueryString()));
      out.write("'  marginwidth=\"10\" marginheight=\"0\" frameborder=\"0\" >\n");
      out.write("	");

	}
	
      out.write("\n");
      out.write("</frameset>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
