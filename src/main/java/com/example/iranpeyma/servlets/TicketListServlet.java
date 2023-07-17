package com.example.iranpeyma.servlets;

import com.example.iranpeyma.entity.Trip;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@WebServlet("/ticket-list")
public class TicketListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();

        HttpSession result = req.getSession();

        List<Trip> trips = new ArrayList<>((Collection<Trip>) result.getAttribute("trips"));

        /*resp.setContentType("text/html");
        out.println("way: " + trips.get(0).getStartCity().getCityName() + "  to  " + trips.get(0)
                .getDestinationCity().getCityName());
        out.println("<br>");
        out.println("date :"+ trips.get(0).getLocalDate());
        out.println("<table>\n" );*/

        /*HttpSession result2 = req.getSession();
        for (int i = 0; i < trips.size(); i++) {
            out.println("        <tr>\n" +
                    "          <td>\n" +
                    "            <form action=\"chose-ticket\" method=\"post\" >\n" +
                    "              <label>  " + trips.get(i).getLocalTime() +"  " +
                    trips.get(i).getUuid() +
                    "</label>\n" +
                    "              <button type=\"submit\" value=\"" + i +"\"/n");
                    result2.setAttribute(String.valueOf(i),i);
                    out.println(
                    "\">" +
                    "buy" +
                    "</button>\n" +
                    "            </form>\n" +
                    "          </td>\n" +
                    "        </tr>\n" );
        }
                    resp.sendRedirect(req.getContextPath()+"/chose-ticket");

                out.println("      </table>");*/
    }
}
