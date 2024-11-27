/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/12.0.12
 * Generated at: 2024-11-13 15:47:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class livehelp_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
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
      			"/advanced/err.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

	request.setCharacterEncoding("UTF-8");

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function liveActionInternal(topHelpWindow, pluginId, className, argument)\n");
      out.write("{\n");

	RequestData data = new RequestData(application,request, response);
	WebappPreferences prefs = data.getPrefs();
	if(data.getMode() == RequestData.MODE_INFOCENTER){

      out.write("\n");
      out.write("	alert(\"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("noLiveHelpInInfocenter", request)));
      out.write("\");\n");
      out.write("	return;\n");

	}else if(!prefs.isActiveHelp()){

      out.write("\n");
      out.write("	alert(\"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("noLiveHelp", request)));
      out.write("\");\n");
      out.write("	return;\n");

	}else {

      out.write("\n");
      out.write("	// construct the proper url for communicating with the server	\n");
      out.write("	var url= window.location.href;\n");
      out.write("	\n");
      out.write("	var i = url.indexOf(\"?\");\n");
      out.write("	if(i>0)\n");
      out.write("		url=url.substring(0, i);\n");
      out.write("	\n");
      out.write("	i = url.indexOf(\"/topic/\");\n");
      out.write("	if(i < 0)\n");
      out.write("		i = url.lastIndexOf(\"/\");\n");
      out.write("\n");
      out.write("	url=url.substring(0, i+1);\n");
      out.write("	var encodedArg=encodeURIComponent(argument);\n");
      out.write("	url=url+\"livehelp/?pluginID=\"+pluginId+\"&class=\"+className+\"&arg=\"+encodedArg+\"&nocaching=\"+Math.random();\n");
      out.write("	");

	Object token = request.getSession().getAttribute("LSESSION"); //$NON-NLS-1$
	// Validate token to protect against XSS
	if (token instanceof String && ((String)token).matches("[a-z0-9-]{36}")) {//$NON-NLS-1$) {
	
      out.write("\n");
      out.write("	url=url+\"&token=");
      out.print(token);
      out.write("\";\n");
      out.write("	");

	}
	
      out.write("\n");
      out.write("	// we need to find the toolbar frame.\n");
      out.write("	// to do: cleanup this, including the location of the hidden livehelp frame.	\n");
      out.write("	var toolbarFrame = topHelpWindow.HelpFrame.ContentFrame.ContentToolbarFrame;\n");
      out.write("	if (!toolbarFrame){\n");
      out.write("		window.location=url;\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	if(toolbarFrame.liveHelpFrame){\n");
      out.write("		toolbarFrame.liveHelpFrame.location=url;\n");
      out.write("	}\n");

	}

      out.write("\n");
      out.write("}\n");
      out.write("function showTopicInContentsInternal(topHelpWindow, topic) {\n");
      out.write("	try{\n");
      out.write("		topHelpWindow.HelpFrame.NavFrame.displayTocFor(topic, false);\n");
      out.write("	}catch(e){\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
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
