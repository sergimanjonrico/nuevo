/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/12.0.12
 * Generated at: 2024-11-13 15:47:43 UTC
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

public final class bookmarksView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/advanced/darkTheme.css", Long.valueOf(1725338750000L));
    _jspx_dependants.put("/advanced/header.jsp", Long.valueOf(1725338750000L));
    _jspx_dependants.put("/advanced/list.css", Long.valueOf(1725338750000L));
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
 
	BookmarksData data = new BookmarksData(application,request, response);
	WebappPreferences prefs = data.getPrefs();

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
      out.print(ServletResources.getString("Bookmarks", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/*******************************************************************************\n");
      out.write(" * Copyright (c) 2000, 2004 IBM Corporation and others.\n");
      out.write(" *\n");
      out.write(" * This program and the accompanying materials \n");
      out.write(" * are made available under the terms of the Eclipse Public License 2.0\n");
      out.write(" * which accompanies this distribution, and is available at\n");
      out.write(" * https://www.eclipse.org/legal/epl-2.0/\n");
      out.write(" *\n");
      out.write(" * SPDX-License-Identifier: EPL-2.0\n");
      out.write(" * \n");
      out.write(" * Contributors:\n");
      out.write(" *     IBM Corporation - initial API and implementation\n");
      out.write(" *******************************************************************************/\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("	color:WindowText;\n");
      out.write("	font: ");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("	font-size: .875rem;\n");
      out.write("	margin-top:5px;\n");
      out.write("	margin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;\n");
      out.write("	padding:0;\n");
      out.write("	border:0;\n");
      out.write("	cursor:default;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A {\n");
      out.write("	text-decoration:none; \n");
      out.write("	color:WindowText; \n");
      out.write("	padding:0px;\n");
      out.write("	white-space: nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A:hover {\n");
      out.write("	text-decoration:underline; \n");
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
      out.write("TABLE {\n");
      out.write("	font: ");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("	font-size: .875rem;\n");
      out.write("	width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".list {\n");
      out.write("	padding:2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sectiontitle {\n");
      out.write("	background-color: ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("	font-weight:bold;\n");
      out.write("	margin-top:7px;\n");
      out.write("}\n");
      out.write("     \n");
      out.write(".active { \n");
      out.write("	background:Highlight;\n");
      out.write("	color:HighlightText;\n");
      out.write("	width:100%;\n");
      out.write("	height:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".label {\n");
      out.write("	margin-");
      out.print(isRTL?"right":"left");
      out.write(":4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu {\n");
      out.write("	position:absolute;\n");
      out.write("	display:none;\n");
      out.write("	background:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("	border:2px outset;\n");
      out.write("	padding:2px 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selectedMenuItem {\n");
      out.write("	background:Highlight;\n");
      out.write("	color:HighlightText;\n");
      out.write("	padding-left:10px;\n");
      out.write("	padding-right:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".unselectedMenuItem {\n");
      out.write("	background:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("	color:WindowText;\n");
      out.write("	padding-left:10px;\n");
      out.write("	padding-right:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".score {\n");
      out.write("	padding-");
      out.print(isRTL?"left":"right");
      out.write(":5px;\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<base target=\"ContentViewFrame\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"utils.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"list.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">		\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Removes bookmark \n");
      out.write(" */\n");
      out.write("function removeBookmark() \n");
      out.write("{\n");
      out.write("	if (!active) \n");
      out.write("		return false;\n");
      out.write("		\n");
      out.write("	var bookmark = active;\n");
      out.write("	active = null;\n");
      out.write("	\n");
      out.write("	// Note: bookmark is an anchor \"a\"\n");
      out.write("	var url = bookmark.href;\n");
      out.write("	var i = url.indexOf(\"/topic/\");\n");
      out.write("	if (i >=0 )\n");
      out.write("		url = url.substring(i+6);\n");
      out.write("	// remove any query string\n");
      out.write("	i = url.indexOf(\"?\");\n");
      out.write("	if (i >= 0)\n");
      out.write("		url = url.substring(0, i);\n");
      out.write("		\n");
      out.write("	var title = bookmark.title;\n");
      out.write("	if (title == null || title == \"\")\n");
      out.write("		title = url;\n");
      out.write("			\n");
      out.write("	window.location.replace(\"bookmarksView.jsp?operation=remove&bookmark=\"+encodeURIComponent(url)+\"&title=\"+encodeURIComponent(title));\n");
      out.write("	return true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Removes all bookmarks\n");
      out.write(" */\n");
      out.write("function removeAllBookmarks() \n");
      out.write("{\n");
      out.write("	hidePopupMenu();\n");
      out.write("	if(!confirm(\"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("confirmDeleteAllBookmarks",request)));
      out.write("\"))\n");
      out.write("		return true;\n");
      out.write("	window.location.replace(\"bookmarksView.jsp?operation=removeAll\");\n");
      out.write("	return true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * If the Del key was pressed, remove the bookmark\n");
      out.write(" */\n");
      out.write("function bookmarkKeyDownHandler(e) {\n");
      out.write("	var key;\n");
      out.write("	\n");
      out.write("	if (isIE) {\n");
      out.write("		key = window.event.keyCode;\n");
      out.write("	} else {\n");
      out.write("		key = e.keyCode;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	// Check if this is the Delete key (code 46)\n");
      out.write("	if (key != 46)\n");
      out.write("		return true;\n");
      out.write("		\n");
      out.write("	if (isIE) {\n");
      out.write("		window.event.cancelBubble = true;\n");
      out.write("	} else {\n");
      out.write("	    e.cancelBubble = true;\n");
      out.write("	}\n");
      out.write("  	\n");
      out.write("  	return removeBookmark();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function onShow() { \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\">\n");
      out.write(" \n");

if(data.getBookmarks().length == 0) {
	out.write(ServletResources.getString("addBookmark", request));
} else {

      out.write("\n");
      out.write("<table id='list'  cellspacing='0' >\n");
      out.write("\n");

	Topic[] bookmarks = data.getBookmarks();
	for (int i=0; i<bookmarks.length; i++) 
	{

      out.write("\n");
      out.write("\n");
      out.write("<tr class='list' id='r");
      out.print(i);
      out.write("'>\n");
      out.write("	<td align='");
      out.print(isRTL?"right":"left");
      out.write("' class='label' nowrap>\n");
      out.write("		<a id='a");
      out.print(i);
      out.write("' \n");
      out.write("		   href='");
      out.print(UrlUtil.htmlEncode(bookmarks[i].getHref()));
      out.write("' \n");
      out.write("		   onmouseover=\"showStatus(event);return true;\"\n");
      out.write("		   onmouseout=\"clearStatus();return true;\"\n");
      out.write("		   oncontextmenu=\"contextMenuHandler(event);return false;\"\n");
      out.write("		   onkeydown=\"bookmarkKeyDownHandler(event);\"\n");
      out.write("		   title=\"");
      out.print(UrlUtil.htmlEncode(bookmarks[i].getLabel()));
      out.write("\">\n");
      out.write("		   <img src=\"");
      out.print(prefs.getImagesDirectory());
      out.write("/topic.svg\" alt=\"\">");
      out.print(UrlUtil.htmlEncode(bookmarks[i].getLabel()));
      out.write("</a>\n");
      out.write("	</td>\n");
      out.write("</tr>\n");
      out.write("\n");

	}

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<div id=\"menu\">\n");
      out.write("	<div class=\"unselectedMenuItem\" onmouseover=\"this.className='selectedMenuItem'\" onmouseout=\"this.className='unselectedMenuItem'\" onclick=\"removeBookmark()\" ><nobr>");
      out.print(ServletResources.getString("RemoveBookmark",request));
      out.write("</nobr></div>\n");
      out.write("	<div class=\"unselectedMenuItem\" onmouseover=\"this.className='selectedMenuItem'\" onmouseout=\"this.className='unselectedMenuItem'\" onclick=\"removeAllBookmarks()\" ><nobr>");
      out.print(ServletResources.getString("RemoveAllBookmarks",request));
      out.write("</nobr></div>\n");
      out.write("</div>\n");
      out.write("\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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