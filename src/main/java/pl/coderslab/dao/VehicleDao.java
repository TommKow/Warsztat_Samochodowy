package pl.coderslab.dao;

import pl.coderslab.model.Customer;
import pl.coderslab.model.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleDao {


    public static final String ADD_VEHICLE = "insert into vehicles(vehicle_carModel, vehicle_carBrand, vehicle_yearOfProduction, " +
            "vehicle_regNumber, vehicle_dateOfTechReviev) values (?, ?, ?, ?, ?);";

    public VehicleDao() {
    }
    public Vehicle saveVehicle(Vehicle vehicle){

        try(Connection connection = DbUtil.getConn()){
            PreparedStatement preparedStatement =
                    connection.prepareStatement(ADD_VEHICLE);

            preparedStatement.setString(1, vehicle.getCarModel());
            preparedStatement.setString(2, vehicle.getCarBrand());
            preparedStatement.setString(3, vehicle.getYearOfProduction());
            preparedStatement.setInt(4, vehicle.getRegNumber());
            preparedStatement.setString(5, vehicle.getDateOfTechReviev());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicle;


    }
}
