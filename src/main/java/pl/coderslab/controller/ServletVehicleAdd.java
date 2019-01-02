package pl.coderslab.controller;

import pl.coderslab.dao.VehicleDao;
import pl.coderslab.model.Vehicle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletVehicleAdd", urlPatterns = "/vehicleadd")
public class ServletVehicleAdd extends HttpServlet {

    public static final String CAR_MODEL = "carModel";
    public static final String CAR_BRAND = "carBrand";
    public static final String YEAR_OF_PROD = "yearOfProd";
    public static final String REG_NUMBER = "regNumber";
    public static final String DATE_OF_TECH = "dateOfTech";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carModel = request.getParameter(CAR_MODEL);
        String carBrand = request.getParameter(CAR_BRAND);
        String yearOfProd = request.getParameter(YEAR_OF_PROD);
        String regNumberS = request.getParameter(REG_NUMBER);
        String dateOfTech = request.getParameter(DATE_OF_TECH);

        Integer regNumber = Integer.parseInt(regNumberS);

        Vehicle vehicle = new Vehicle(carModel, carBrand, yearOfProd, regNumber, dateOfTech);
        VehicleDao vehicleDao = new VehicleDao();

        if(vehicleDao.saveVehicle(vehicle) != null) {
            response.getWriter().append("SAVED IN DATABASE !");
        }else{
            response.getWriter().append("DOES NOT SAVED !");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
