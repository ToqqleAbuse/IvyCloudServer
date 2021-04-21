package system.linux;

import java.io.File;

public class LinuxUser {

    String username;

    public LinuxUser(final String username) {
        this.username = username;
    }

    public File getHomeDirectory(){
        return new File("");
    }



}
