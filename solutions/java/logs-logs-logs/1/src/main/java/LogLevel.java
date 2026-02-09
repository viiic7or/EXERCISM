public enum LogLevel {
    // TODO: define members for each log level
    TRACE("TRC"),
    DEBUG("DBG"),
    INFO("INF"),
    WARNING("WRN"),
    ERROR("ERR"),
    FATAL("FTL"),
    UNKNOWN("");

    private final String codeLogLevel;

    LogLevel(String codeLogLevel) {
        this.codeLogLevel = codeLogLevel;
    }

    public String getCodeLogLevel() {
        return this.codeLogLevel;
    }
}
