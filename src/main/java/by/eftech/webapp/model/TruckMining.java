package by.eftech.webapp.model;


import java.io.Serializable;

public class TruckMining extends BaseEntity implements Serializable{

    protected String power;

    protected Integer fuelRate;

    protected String torque;

    protected String turningRadius;

    protected Integer length;

    protected Integer width;

    protected Integer height;

    protected Integer operationalWeight;

    protected Integer grossWeight;

    protected Integer maxSpeed;

    protected  Model model;

    protected  Transmission transmission;

    protected Engine engine;

    protected Suspension suspension;

    protected Brakes brakes;

    protected String application;
}
