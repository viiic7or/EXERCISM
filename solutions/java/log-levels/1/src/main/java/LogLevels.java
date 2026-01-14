public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(": ");
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(": ");
        for (String part: parts) {
            if(part.equals("[ERROR]")){
                return "error";
            }else if(part.equals("[WARNING]")){
                return "warning";
            }else if(part.equals("[INFO]")){
                return "info";
            }
        }
        return "";
    }

    public static String reformat(String logLine) {
        String[] parts = logLine.split(": ");
            if(parts[0].equals("[ERROR]")){
                return parts[1].trim() + " (error)";
            }else if(parts[0].equals("[WARNING]")){
                return parts[1].trim() + " (warning)";
            }else if(parts[0].equals("[INFO]")){
                return parts[1].trim() + " (info)";
            }
        return "";
    }
}
