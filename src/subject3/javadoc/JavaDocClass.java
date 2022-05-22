package subject3.javadoc;

/**
 *
 */
public class JavaDocClass {

    private String title;
    private int numberOfPage;

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return title + ": " + numberOfPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    /**
     *
     * @param numberOfPage
     */
    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public JavaDocClass(String title, int numberOfSomething) {
        this.title = title;
        this.numberOfPage = numberOfSomething;
    }

    public JavaDocClass() {
    }
}
