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

public final class indexView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/advanced/darkTheme.css", Long.valueOf(1725338750000L));
    _jspx_dependants.put("/advanced/indexView.css", Long.valueOf(1725338750000L));
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

    RequestData requestData = new ActivitiesData(application,request, response);
    SearchData searchData = new SearchData(application,request, response);
	WebappPreferences prefs = requestData.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.print(ServletResources.getString("locale", request));
      out.write("\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"Expires\" content=\"-1\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("IndexViewTitle", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/*******************************************************************************\n");
      out.write(" * Copyright (c) 2005, 2010 Intel Corporation and others.\n");
      out.write(" *\n");
      out.write(" * This program and the accompanying materials \n");
      out.write(" * are made available under the terms of the Eclipse Public License 2.0\n");
      out.write(" * which accompanies this distribution, and is available at\n");
      out.write(" * https://www.eclipse.org/legal/epl-2.0/\n");
      out.write(" *\n");
      out.write(" * SPDX-License-Identifier: EPL-2.0\n");
      out.write(" * \n");
      out.write(" * Contributors:\n");
      out.write(" *     Intel Corporation - initial API and implementation\n");
      out.write(" *     IBM Corporation 2006, refactored index view into a single frame\n");
      out.write(" *     IBM Corporation 2009, added style for .see\n");
      out.write(" *     IBM Corporation 2010, Added see all link\n");
      out.write(" *******************************************************************************/\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("    ");
      out.print(prefs.getViewBackgroundStyle());
      out.write("\n");
      out.write("	font:");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("	font-size:.875rem;\n");
      out.write("	margin-top:5px;\n");
      out.write("	margin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;\n");
      out.write("	padding:0px;\n");
      out.write("	border:0px;	\n");
      out.write("	cursor:default;\n");
      out.write("	overflow:hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TABLE, TR, TD, P {\n");
      out.write("	margin:0px;\n");
      out.write("	padding:0px;\n");
      out.write("	border:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TABLE {\n");
      out.write("	font:");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("	font-size:.875rem;\n");
      out.write("	width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TR {\n");
      out.write("	height:21px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("INPUT {\n");
      out.write("	font:");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("	font-size:.875rem;\n");
      out.write("	margin:0;\n");
      out.write("	padding:0;\n");
      out.write("	border:1px solid ThreeDShadow;\n");
      out.write("}\n");
      out.write("\n");
      out.write("INPUT {\n");
      out.write("    font-size:1.0em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#instruction {\n");
      out.write("	white-space:nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#indexList {\n");
      out.write("    overflow:auto;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#typein {\n");
      out.write("	width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#typeinTable {\n");
      out.write("	width:100%;\n");
      out.write("	height: 4em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#button {\n");
      out.write("	background:ThreeDShadow;\n");
      out.write("	color:Window;\n");
      out.write("	font-size: 1.0em;\n");
      out.write("	font-weight:bold;\n");
      out.write("	margin-left:1px;\n");
      out.write("}\n");
      out.write("\n");

	if (requestData.isIE()) {

      out.write("\n");
      out.write("#go {\n");
      out.write("	padding-");
      out.print(isRTL?"right":"left");
      out.write(":1px;\n");
      out.write("}\n");

	}

      out.write("\n");
      out.write("\n");
      out.write("#root {\n");
      out.write("	margin-top:0px;\n");
      out.write("	margin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;	\n");
      out.write("}\n");
      out.write("\n");
      out.write("#innerNavigation {\n");
      out.write("    margin-top:0px;\n");
      out.write("    padding-bottom: 5px;\n");
      out.write("	font-weight:bold;\n");
      out.write("	width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navigation {\n");
      out.write("    width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#td_previous {   \n");
      out.write("    text-align:");
      out.print(isRTL?"right":"left");
      out.write(";\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#td_next {\n");
      out.write("    text-align:");
      out.print(isRTL?"left":"right");
      out.write(";\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.root {\n");
      out.write("    font-weight:normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.visible, DIV.unopened { \n");
      out.write("	border-width:0; \n");
      out.write("	margin-");
      out.print(isRTL?"right":"left");
      out.write(":1.5em; \n");
      out.write("	font-weight:normal;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("DIV.hidden {\n");
      out.write("	display:none; \n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.visible, DIV.root {  \n");
      out.write("    margin-top:1px; \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("DIV.group { \n");
      out.write("	border-width:0; \n");
      out.write("	margin-");
      out.print(isRTL?"right":"left");
      out.write(":0; \n");
      out.write("}\n");
      out.write("\n");
      out.write("SPAN.item{\n");
      out.write("    white-space: nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("IMG {\n");
      out.write("	border:0px;\n");
      out.write("	margin:0px;\n");
      out.write("	padding:0px;\n");
      out.write("	margin-");
      out.print(isRTL?"left":"right");
      out.write(":4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("IMG.expander, IMG.h {\n");
      out.write("    margin-top:4px;\n");
      out.write("    margin-bottom:2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A {\n");
      out.write("	text-decoration:none; \n");
      out.write("	padding-");
      out.print(isRTL?"left":"right");
      out.write(":2px;\n");
      out.write("	color:WindowText;\n");
      out.write("	/* this works in ie5.5, but not in ie5.0  */\n");
      out.write("	white-space: nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A:hover{\n");
      out.write("	text-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");
      out.write("A.active{ \n");
      out.write("	color:HighlightText; \n");
      out.write("	background:Highlight;\n");
      out.write("	width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A.active:hover{\n");
      out.write("	text-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");
      out.write("A.see {\n");
      out.write("    font-style : italic;\n");
      out.write("    color : #0000FF;\n");
      out.write("}\n");
      out.write("\n");

if (requestData.isSafari()){

      out.write("\n");
      out.write("\n");
      out.write("A.nolink {\n");
      out.write("	color:#808080;\n");
      out.write("}\n");
      out.write("\n");
 
} else {

      out.write("\n");
      out.write("\n");
      out.write("A.nolink {\n");
      out.write("	color:GrayText;\n");
      out.write("}\n");
      out.write("\n");

}

      out.write("\n");
      out.write("\n");
      out.write("A.nolink {\n");
      out.write("	text-decoration:none; \n");
      out.write("	font-weight:bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A.nolink:hover {\n");
      out.write("	text-decoration:none; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".h {\n");
      out.write("	visibility:hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".showall {\n");
      out.write("    text-decoration:underline; \n");
      out.write("    color:#0066FF; \n");
      out.write("	cursor:pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (prefers-color-scheme: dark) {\n");
      out.write("	body { \n");
      out.write("		color: #f0f0f0; \n");
      out.write("		background: #3d3d3d;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	#titleText,\n");
      out.write("	#searchLabel,\n");
      out.write("	#scopeLabel,\n");
      out.write("	#scope,\n");
      out.write("	a,\n");
      out.write("	a.active\n");
      out.write("	a.nolink:link, \n");
      out.write("	a.nolink:visited {\n");
      out.write("		color:#ffffff;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	.button a:hover, .buttonMenu a:hover { \n");
      out.write("		border-top:1px solid #3d3d3d; \n");
      out.write("		border-");
      out.print(isRTL?"right":"left");
      out.write(":1px solid #3d3d3d; \n");
      out.write("		border-");
      out.print(isRTL?"left":"right");
      out.write(":1px solid #3d3d3d; \n");
      out.write("		border-bottom:1px solid #3d3d3d;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	table {\n");
      out.write("		background:#3d3d3d;\n");
      out.write("	}\n");
      out.write("	.tab {\n");
      out.write("		background:#7b7c7b\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	form {\n");
      out.write("		background:#3d3d3d;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.separator {\n");
      out.write("\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	input{\n");
      out.write("		background:#a0a0a0;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	.button a, .buttonMenu a { \n");
      out.write("		border:1px solid #3d3d3d;;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	/* darken images to add some comfort while reading in dark theme */\n");
      out.write("	img {\n");
      out.write("		opacity: .75;\n");
      out.write("		transition: opacity .5s ease-in-out;\n");
      out.write("	}\n");
      out.write("	img:hover {\n");
      out.write("		opacity: 1;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	.location, .location a {\n");
      out.write("		color:#00cc66;\n");
      out.write("	}\n");
      out.write("}");
      out.write('\n');
      out.write("\n");
      out.write("</style>\n");
 
    if (requestData.isMacMozilla()) {

      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#button {\n");
      out.write("    background:GrayText;\n");
      out.write("}\n");
      out.write("</style>\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("<base target=\"ContentViewFrame\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var loadingMessage = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("Loading", request)));
      out.write("\";\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"indexView.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"resize.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"helptree.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"helptreechildren.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"xmlajax.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"utils.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"view.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\" onload=\"onloadHandler()\" onresize = \"sizeList()\">\n");
      out.write("\n");
      out.write("<table id=\"typeinTable\">\n");
if (prefs.isIndexInstruction()) {
      out.write('\n');

    if (searchData.isScopeActive()) {

      out.write("\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<tr>\n");
      out.write("		<td colspan=\"2\">\n");
      out.print( UrlUtil.htmlEncode(searchData.getScopeActiveMessage()) );
      out.write("\n");
      out.write("<a class=\"showall\" onclick=\"showAll();\" >");
      out.print(ServletResources.getString("showAllLink", request));
      out.write("</a>\n");
      out.write("</p></td></tr>\n");

    }

      out.write("\n");
      out.write("	<tr>\n");
      out.write("		<td colspan=\"2\"><p id=\"instruction\">");
      out.print(ServletResources.getString("IndexTypeinInstructions", request));
      out.write("</p></td>\n");
      out.write("	</tr>\n");
}
      out.write("\n");
      out.write("	<tr>\n");
      out.write("		<td width=\"100%\"><input type=\"text\" id=\"typein\" aria-label=\"Find word\"></td>\n");
      out.write("	");
if (prefs.isIndexButton()) {
      out.write("\n");
      out.write("		<td><input type=\"button\" id=\"button\" value=\"");
      out.print(ServletResources.getString("IndexTypeinButton", request));
      out.write("\" onclick=\"this.blur();showIndex()\"></td>\n");
      out.write("	");
}
      out.write("\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
      out.write("<div id = \"indexList\">\n");
      out.write("\n");
      out.write("<DIV class = \"group\" id = \"wai_application\" aria-label = \"Index search results\">\n");
      out.write("    <DIV class = \"root\" aria-label = \"Search results\" id = \"tree_root\">\n");
      out.write("    </DIV>\n");
      out.write("</DIV>\n");
      out.write("</div>\n");
      out.write("<div id=\"navigation\">\n");
      out.write("    <table id=\"innerNavigation\" cellspacing=0 cellpadding=0 border=0 style=\"background:transparent;\">\n");
      out.write("		<tr>\n");
      out.write("			<td id = \"td_previous\">				\n");
      out.write("                <a role = \"link\" id = \"previous\" class = \"enabled\" onclick=\"this.blur();loadPreviousPage()\">");
      out.print(ServletResources.getString("IndexPrevious", request));
      out.write("</a> \n");
      out.write("			</td>\n");
      out.write("			<td id = \"td_next\">\n");
      out.write("				<a role = \"link\" id = \"next\" class = \"enabled\" onclick=\"this.blur();loadNextPage()\">");
      out.print(ServletResources.getString("IndexNext", request));
      out.write("</a> \n");
      out.write("			</td>\n");
      out.write("  	 </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
