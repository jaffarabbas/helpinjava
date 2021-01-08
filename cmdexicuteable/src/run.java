class run
{
    public static void main(String[] args)
    {
        try
        {
            Runtime.getRuntime().exec(new String[] {"cmd", "/K","cd..&& cd..&& cd.. && cd.. && cd.. &&  cd Program\\xampp\\htdocs\\Library-Management-System-In-Java-\\out\\artifacts\\Library_Management_System_In_Java__jar && java --module-path J:\\Program\\Github\\JAVA-FX-JAR\\openjfx-11.0.2_windows-x64_bin-sdk\\javafx-sdk-11.0.2\\lib\\ --add-modules  javafx.fxml,javafx.controls -jar Library-Management-System-In-Java-.jar"});
        }
        catch (Exception e)
        {
            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
            e.printStackTrace();
        }
    }
}