package MotherBoard;

import java.util.ArrayList;
import java.util.List;

public class MotherBoard {

    private List<SataDrive> connectedDrives;

    public MotherBoard() {
        this.connectedDrives = new ArrayList<>();
    }

    public void connectSataDrive(SataDrive sataDrive) {
        if (connectedDrives.size() < 4) {
            connectedDrives.add(sataDrive);
            System.out.println(sataDrive.getDriveName() + " connected to MotherBoard.");
        } else {
            System.out.println("MotherBoard is full. Cannot connect more SataDrives.");
        }
    }

    public void listConnectedSataDrives() {
        System.out.println("Connected SataDrives:");
        for (SataDrive drive : connectedDrives) {
            System.out.println(drive.getDriveName());
        }
    }
}
