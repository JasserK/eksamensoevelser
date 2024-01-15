package MotherBoard;

public class Main {
    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard();

        SataDrive drive1 = new SataDrive("SataDrive1");
        SataDrive drive2 = new SataDrive("SataDrive2");
        SataDrive drive3 = new SataDrive("SataDrive3");
        SataDrive drive4 = new SataDrive("SataDrive4");
        SataDrive drive5 = new SataDrive("SataDrive5");

        motherBoard.connectSataDrive(drive1);
        motherBoard.connectSataDrive(drive2);
        motherBoard.connectSataDrive(drive3);
        motherBoard.connectSataDrive(drive4);
        motherBoard.connectSataDrive(drive5); // This should print a message that the MotherBoard is full.

        motherBoard.listConnectedSataDrives();
    }
}
