public class LogLine {

    private String logLine;
    public String abrev;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    // 3. El método hace el trabajo de extraer
    public LogLevel getLogLevel() {
        
        // Como sabemos que siempre empieza por "[INF]...", 
        // substring es mucho más fácil que split.
        abrev = this.logLine.substring(1, 4);
        LogLevel loglevel = LogLevel.UNKNOWN;

        switch (abrev) {
            case "TRC": loglevel = LogLevel.TRACE;
                break;
            case "DBG": loglevel = LogLevel.DEBUG;
                break;
            case "INF": loglevel = LogLevel.INFO;
                break;
            case "WRN": loglevel = LogLevel.WARNING;
                break;
            case "ERR": loglevel = LogLevel.ERROR;
                break;
            case "FTL": loglevel = LogLevel.FATAL;
                break;
            default: loglevel = LogLevel.UNKNOWN;
                break;
        }
        return loglevel;
    }

    public String getOutputForShortLog() {
        
        abrev = this.logLine.substring(1, 4);
        String mssg = this.logLine.substring(7, logLine.length());
        int code = 0;
        
        switch (abrev) {
            case "TRC": code = 1;
                break;
            case "DBG": code = 2;
                break;
            case "INF": code = 4;
                break;
            case "WRN": code = 5;
                break;
            case "ERR": code = 6;
                break;
            case "FTL": code = 42;
                break;
            default: 
                code = 0;
                break;
        }
        return code + ":" + mssg;
    }
}
