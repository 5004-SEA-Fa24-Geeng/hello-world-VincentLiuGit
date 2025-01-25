package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc.
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */
public class Greeting {
    /** int value of localityID. */
    private int localityID;
    /** String value of localityName. */
    private String localityName;
    /** String value of asciiGreeting. */
    private String asciiGreeting;
    /** String value of unicodeGreeting. */
    private String unicodeGreeting;
    /** String value of formatStr. */
    private String formatStr;

    /**
     * This is the constructor for the Greeting class.
     * The default value of greeting is "Hello".
     * @param localityID the id of locality
     * @param localityName the name of locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * This is the constructor for the Greeting class.
     * The default value of formatStr is "%s, %%s!".
     * @param localityID the id of locality
     * @param localityName the name of locality
     * @param greeting the greeting of that locality
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * This is the constructor for the Greeting class.
     * @param localityID the id of locality
     * @param localityName the name of locality
     * @param asciiGreeting the ascii greeting of locality
     * @param unicodeGreeting the unicode greeting of locality
     * @param formatStr the format string that used to form the greeting sentence
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * get the locality ID.
     * @return the locality ID
     */
    public int getLocalityID() {
        return this.localityID;
    }
    /**
     * get the locality name.
     * @return the locality name
     */
    public String getLocalityName() {
        return this.localityName;
    }
    /**
     * get the ascii greeting of locality.
     * @return the ascii greeting of locality
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }
    /**
     * get the unicode greeting of locality.
     * @return the unicode greeting of locality
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }
    /**
     * get the formated greeting sentence using this.formatStr and this.unicodeGreeting.
     * @return the formated greeting sentence
     */
    public String getFormatStr() {
        String formatStr = String.format(this.formatStr, this.unicodeGreeting);
        return formatStr;
    }
    /**
     * get the formated greeting sentence using this.formatStr and this.unicodeGreeting.
     * @param asciiOnly if true, only ascii characters will be used
     * @return the formated greeting sentence
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            String formatStr = String.format(this.formatStr, this.asciiGreeting);
            return formatStr;
        }
        return formatStr;
    }
    /**
     * get the formated string using 5 variables in the class.
     * @return the formated string
     */
    public String toString() {
        String formatStr = "{localityID:%d, localityName:\"%s\""
                        + ", asciiGreeting:\"%s\",unicodeGreeting:\"%s\"}";
        String str = String.format(formatStr, this.localityID, 
                    this.localityName, this.asciiGreeting, this.unicodeGreeting);
        return str;
    }

}
