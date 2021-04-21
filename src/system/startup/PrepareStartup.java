package system.startup;

import system.cache.Cache;
import system.machine.MachineManager;

public class PrepareStartup {


    public static void startupSystem() {

        switch (MachineManager.getMachineOS().toUpperCase()) {
            case "LINUX":
                break;
            default:
                System.out.println("operating system not supported");
                return;
        }

        String installationStatus = Cache.getItem("installation");
        switch (installationStatus) {
            case "complete":
                break;
            default:
                PrepareStartup.startInstallation();
                break;
        }

    }


    public static void startInstallation() {

    }


}
