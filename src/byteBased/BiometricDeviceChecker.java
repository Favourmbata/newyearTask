package byteBased;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BiometricDeviceChecker {

    public static void main(String[] args) {
        checkForFingerprintSensor();
    }

    public static void checkForFingerprintSensor() {
        String os = System.getProperty("os.name").toLowerCase();

        try {
            Process process;
            if (os.contains("win")) {
                // Windows command to list USB devices
                process = Runtime.getRuntime().exec("wmic path Win32_PnPEntity get caption");
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                // Linux/Mac command to list USB devices
                process = Runtime.getRuntime().exec("lsusb");
            } else {
                throw new UnsupportedOperationException("Unsupported operating system");
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                // Check for fingerprint sensor-related information in the output
                if (line.toLowerCase().contains("fingerprint") || line.toLowerCase().contains("biometric")) {
                    System.out.println("Fingerprint sensor found!");
                    return;
                }
            }

            System.out.println("No fingerprint sensor detected.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}