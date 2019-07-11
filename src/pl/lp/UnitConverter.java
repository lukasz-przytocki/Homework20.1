package pl.lp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class UnitConverter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");

        String kilogramy = request.getParameter("kilogramy");
        String gramy = request.getParameter("gramy");
        String miligramy = request.getParameter("miligramy");
        
        String message="<h1> Podana wartość w przeliczeniu na:</h1>";

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (((metry != "" && metry != null) && (centymetry != "" && centymetry != null))
                || ((metry != "" && metry != null) && (milimetry != "" && milimetry != null))
                || ((centymetry != "" && centymetry != null) && (milimetry != "" && milimetry != null))
                || ((kilogramy != "" && kilogramy != null) && (gramy != "" && gramy != null))
                || ((kilogramy != "" && kilogramy != null) && (miligramy != "" && miligramy != null))
                || ((gramy != "" && gramy != null) && (miligramy != "" && miligramy != null))) {
            writer.println("<h2> Należy wypełnić tylko jedno pole</h2>");
        } else {

            if (metry != "" && metry != null) {
                double doubleMetry = Double.valueOf(metry);
                double doubleCentymetry = doubleMetry * 100;
                double doubleMilimetry = doubleMetry * 1000;
                writer.println(message);
                writer.println("<h2>metry: " + doubleMetry + "<br><br>" + "centymetry: " + doubleCentymetry + "<br><br>" + "milimetry:" + doubleMilimetry + "</h2>");
            }
            if (centymetry != "" && centymetry != null) {
                double doubleCentymetry = Double.valueOf(centymetry);
                double doubleMetry = doubleCentymetry / 100;
                double doubleMilimetry = doubleCentymetry * 10;
                writer.println(message);
                writer.println("<h2>metry: " + doubleMetry + "<br><br>" + "centymetry: " + doubleCentymetry + "<br><br>" + "milimetry:" + doubleMilimetry + "</h2>");
            }

            if (milimetry != "" && milimetry != null) {
                double doubleMilimetry = Double.valueOf(milimetry);
                double doubleCentymetry = doubleMilimetry / 10;
                double doubleMetry = doubleMilimetry / 1000;
                writer.println(message);
                writer.println("<h2>metry: " + doubleMetry + "<br><br>" + "centymetry: " + doubleCentymetry + "<br><br>" + "milimetry:" + doubleMilimetry + "</h2>");
            }

            if (kilogramy != "" && kilogramy != null) {
                double doubleKilogramy = Double.valueOf(kilogramy);
                double doubleGramy = doubleKilogramy * 1000;
                double doubleMiligramy = doubleKilogramy * 1_000_000;
                writer.println(message);
                writer.println("<h2>kilogramy: " + doubleKilogramy + "<br><br>" + "gramy: " + doubleGramy + "<br><br>" + "miligramy:" + doubleMiligramy + "</h2>");
            }

            if (gramy != "" && gramy != null) {
                double doubleGramy = Double.valueOf(gramy);
                double doubleKilogramy = doubleGramy / 1000;
                double doubleMiligramy = doubleGramy * 1_000;
                writer.println(message);
                writer.println("<h2>kilogramy: " + doubleKilogramy + "<br><br>" + "gramy: " + doubleGramy + "<br><br>" + "miligramy:" + doubleMiligramy + "</h2>");
            }

            if (miligramy != "" && miligramy != null) {
                double doubleMiligramy = Double.valueOf(miligramy);
                double doubleGramy = doubleMiligramy / 1000;
                double doubleKilogramy = doubleMiligramy / 1_000_000;

                writer.println(message);
                writer.println("<h2>kilogramy: " + doubleKilogramy + "<br><br>" + "gramy: " + doubleGramy + "<br><br>" + "miligramy:" + doubleMiligramy + "</h2>");
            }

        }
    }

}
