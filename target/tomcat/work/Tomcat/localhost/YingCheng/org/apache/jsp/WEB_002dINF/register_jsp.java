/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-09 11:48:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("    \n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/zhuye.css\"/>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/jquery-1.11.1.js\"></script>\n");
      out.write("<script>\n");
      out.write("\tvar n=0;\n");
      out.write("\tvar id;\n");
      out.write("\tfunction start(){\t\n");
      out.write("\t\tid=setInterval(function(){\n");
      out.write("\t\t\tn++;\n");
      out.write("\t\t\tfor(var i=0;i<$(\"#zhuye img\").length;i++){\n");
      out.write("\t\t\t\t$(\"#zhuye img\")[i].className=\"hide\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar index=n%$(\"#zhuye img\").length;\n");
      out.write("\t\t\t$(\"#zhuye img\")[index].className=\"\";\n");
      out.write("\t\t},3000);\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t$(function(){\n");
      out.write("\t\tstart();\n");
      out.write("\t\t$(\"#zhuye\").hover(function(){\n");
      out.write("\t\t\tclearInterval(id);\n");
      out.write("\t\t},function(){\n");
      out.write("\t\t\tstart();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\tfunction zhuceyanzheng(){\n");
      out.write("\t\tvar url=\"zhuceyanzheng.do\";\n");
      out.write("\t\tvar gg=$.trim($(\"#username\").val());\n");
      out.write("\t\tvar params = {\"username\":$(\"#username\").val()}\n");
      out.write("\t\tif(gg.length < 6 || gg.length > 20){\n");
      out.write("\t    \t $(\"#lop\").html(\"帐号长度为6至30个字符\");\n");
      out.write("\t    \t return false;\t \n");
      out.write("\t\t}\n");
      out.write("\t\t$.post(url,params,function(result){\n");
      out.write("\t\t\tif(result.data){\n");
      out.write("\t\t\t\t$(\"#lop\").html(\"OK\")\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$(\"#lop\").html(\"用户名已被占用\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\tif($(\"#lop\").html()==\"用户名已被占用\"){\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tfunction phoneTrue() {\n");
      out.write("\t    var gg = $.trim($(\"#phone\").val());\n");
      out.write("\t    if (gg==\"\") {\n");
      out.write("\t        $(\"#phones\").html(\"请输入手机号\");\n");
      out.write("\t        return false;\n");
      out.write("\t    }\n");
      out.write("\t    if(!(/^1\\d{10}$/.test(gg))){\n");
      out.write("\t    \t$(\"#phones\").html(\"手机号格式错误\");\n");
      out.write("\t        return false;\n");
      out.write("\t    }\n");
      out.write("\t    $(\"#phones\").html(\"ok\");\n");
      out.write("\t    return true;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction pwdTrue(){\n");
      out.write("    var gg = $.trim($(\"#password\").val());\n");
      out.write("    if (gg==\"\") {\n");
      out.write("    \t $(\"#passwords\").html(\"请输入密码\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("    if(gg.length < 6 || gg.length > 30){\n");
      out.write("    \t $(\"#passwords\").html(\"密码长度为6至30个字符\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("    $(\"#passwords\").html(\"ok\");\n");
      out.write("    return true;\n");
      out.write("}\n");
      out.write("\tfunction emailTrue() {\n");
      out.write("\t    var regEmail= /^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$/;\n");
      out.write("\t    var gg = $.trim($(\"#email\").val());\n");
      out.write("\t    if (gg==\"\") {\n");
      out.write("\t    \t$(\"#emails\").html(\"邮箱不能为空\");\n");
      out.write("\t        return false;\n");
      out.write("\t    }\n");
      out.write("\t    if(!(regEmail.test(gg))){\n");
      out.write("\t    \t$(\"#emails\").html(\"邮箱格式错误\");\n");
      out.write("\t        return false;\n");
      out.write("\t    }\n");
      out.write("\t    $(\"#emails\").html(\"ok\");\n");
      out.write("\t    return true;\n");
      out.write("\t}\n");
      out.write("\tfunction zhuce(){\n");
      out.write("\t\tconsole.log(zhuceyanzheng());\n");
      out.write("\t\tconsole.log(emailTrue());\n");
      out.write("\t\tconsole.log(pwdTrue());\n");
      out.write("\t\tconsole.log(phoneTrue());\n");
      out.write("\t\tif(zhuceyanzheng()&emailTrue()&pwdTrue()&phoneTrue()){\n");
      out.write("\t\t\t $(\"form:first\").trigger(\"submit\")\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\talert(\"请按提示填充\")\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$(\"#username\").on(\"blur\",zhuceyanzheng);\n");
      out.write("\t\t$(\"#phone\").on(\"blur\",phoneTrue);\n");
      out.write("\t\t$(\"#password\").on(\"blur\",pwdTrue);\n");
      out.write("\t\t$(\"#email\").on(\"blur\",emailTrue);\n");
      out.write("\t\t$(\"#zc\").on(\"click\",zhuce);\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"zhuye\" align=\"center\">\n");
      out.write("\t\t<img  src=\"images/revenge.jpg\" >\n");
      out.write("\t\t<img  src=\"images/afengda.jpg\" class=\"hide\">\n");
      out.write("\t\t<img  src=\"images/houtian.jpg\" class=\"hide\">\n");
      out.write("\t\t<img  src=\"images/longfeng.jpg\" class=\"hide\">\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"icon\">\n");
      out.write("\t\t<div id=\"icon2\">\n");
      out.write("\t\t<ul id=\"icon3\">\n");
      out.write("\t\t<li id=\"index\"><a href=\"index2.do\">首页</a></li>\n");
      out.write("\t\t\t<li>热门电影</li>\n");
      out.write("\t\t\t<li><a href=\"down.do\">电影下载</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://176.119.11.13:8080/hjw.gpxt/HJWYCXT_index.html\">影院购票</a></li>\n");
      out.write("\t\t\t<li>论坛</li>\n");
      out.write("\t\t\t<li><input type=\"text\"/><input type=\"button\" value=\"影片搜索\"/>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<form action =\"zhuce.do\" method =\"post\"style=\"font-size: 40px;color:white;text-align: center;margin:100px auto;\">\n");
      out.write("\t\t\t帐号:<input id = \"username\" name=\"account\" \"/><span id=\"lop\"></span><br/>\n");
      out.write("\t\t\t密码:<input id = \"password\"name =\"password\" type = \"password\"><span id=\"passwords\"></span><br/>\n");
      out.write("\t\t\t昵称:<input name=\"name\"/><br/>\n");
      out.write("\t\t\t邮箱:<input id = \"email\" name=\"email\"/><span id=\"emails\"></span><br/>\n");
      out.write("\t\t\t电话:<input  id = \"phone\"name =\"phone\"/><span id=\"phones\"></span><br/>\n");
      out.write("\t\t\t<input id=\"zc\" type=\"button\" value=\"注册\"/>\n");
      out.write("\t\t\t<input type=\"reset\" value=\"重置\"/>\n");
      out.write("\t\t</form>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"copyright\" >\n");
      out.write("\t\t<p>友情链接 : 达内</p>\n");
      out.write("\t\t<p>copyright:版权归JSD1703第二组所有</p>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/register.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("basePath");
    // /WEB-INF/register.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/register.jsp(4,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
