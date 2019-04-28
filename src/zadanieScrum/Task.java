package zadanieScrum;

public class Task {
    private String content;
    private String user;
    private int estimatedTime;

    public Task(){};

    public Task(String content, String user, int estimatedTime) {
        this.content = content;
        this.user = user;
        this.estimatedTime = estimatedTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
}
