package com.carCompany.html;

import java.util.ArrayList;


public class Design {
	
	public Design(){} 
	
	public String HTMLPage(String body)
	{
		String HTML_Code ="\n";
		HTML_Code += "<html>"+"\n";
		HTML_Code += "<head>"+"\n";
		HTML_Code += "<title></title>"+"\n";
		HTML_Code += "</head>"+"\n";
		HTML_Code += "<body>"+"\n";
		HTML_Code += "  <div style=\"width: 380px;padding:15px; margin:auto;background-color:#5283F6;border-radius:20px \">"+"\n";
		HTML_Code += body+"\n";
		HTML_Code += "</div>"+"\n";
		HTML_Code += "</body>"+"\n";
		HTML_Code += "</html>"+"\n";
		return HTML_Code;
	}
	
	public String HTML_Table(String body)
	{
		String HTML_Code ="\n";
		HTML_Code += "<table>"+"\n";
		HTML_Code += body+"\n";
		HTML_Code += "</table>"+"\n";				
		return HTML_Code;
	}
	
	public String HTML_Table_Row(String body)
	{
		String HTML_Code="\n";
		HTML_Code += "<tr>"+"\n";
		HTML_Code += body+"\n";
		HTML_Code += "</tr>"+"\n";
		return HTML_Code;		
	}
	
	public String HTML_Table_Column(String body,int colspan)
	{
		String HTML_Code="\n";
		HTML_Code += "<td style=\"padding: 10px;\"  colspan=\""+colspan+"\">"+"\n";
		HTML_Code += body+"\n";
		HTML_Code += "</td>"+"\n";
		return HTML_Code;		
	}
	
	public String HTML_form(String action,String method,String body)
	{
		String HTML_Code="\n";
		HTML_Code +="<form action=\""+action+"\" method=\""+method+"\" >"+"\n";
		HTML_Code +=body+"\n";
		HTML_Code +="</form>"+"\n";		
		return HTML_Code;
	}

	public String HTML_form_input(String inputType,String name,boolean required)
	{
		String HTML_Code="\n";
		String requiredStr = "";
		if(required)
		{requiredStr = "required";}
		HTML_Code +="<input type=\""+inputType+"\" name=\""+name+"\" "+requiredStr+">"+"\n";		
		return HTML_Code;		
	}
	
	
	public String button(String value)
	{
		String HTML_Code="\n";
		HTML_Code +="<center><input type=\"submit\" value=\""+value+"\"></center>"+"\n";		
		return HTML_Code;		
	}
	

	public String HTML_Header(String username,String body)
	{
		String HTML_Code="\n";
		HTML_Code += HTML_Table_Column("<h1>Welcome "+username+"</h1>\n",1);
		HTML_Code += HTML_Table_Column(HTML_form("cookies", "get", button("Logout")),1);
		HTML_Code = HTML_Table(HTML_Code)+body;
		
		return HTML_Code;
	}

	public String checkbox(String name,String value,String checked,String txt)
	{
		String HTML_Code="\n";
		HTML_Code += "<input type=\"checkbox\" name=\""+name+"\" "+checked+" value=\""+value+"\">"+txt+"\n";
		return HTML_Code;
	}
	
	public String hidden(String name,String value)
	{
		String HTML_Code="\n";
		HTML_Code += "<input type=\"hidden\" name=\""+name+"\" value=\""+value+"\">"+"\n";
		return HTML_Code;
	}
	
	public String dropDownList(String name,ArrayList <String> selections)
	{
		String HTML_Code="\n";
		HTML_Code += "<select name=\""+name+"\">";
		for(int i=0;i<selections.size();i++)
		{
			HTML_Code += "<option value=\""+selections.get(i)+"\">"+selections.get(i)+"</option>"+"'n";
		}
		HTML_Code += "</select>";
		return HTML_Code;		
	}
	
	
	
	
}
