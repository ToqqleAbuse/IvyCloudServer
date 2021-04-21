package system.machine;

import system.linux.LinuxUser;

public class MachineManager {

    public static long getBusyCloudSpace() {
        return 0;
    }

    public static long getTotalCloudSpace() {
        return 0;
    }

    public static long getFreeCloudSpace() {
        return 0;
    }

    public static String getMachineOS() {
        return System.getProperty("os.name");
    }

    public LinuxUser[] getLinuxUsers(){
        return null;
    }

}
