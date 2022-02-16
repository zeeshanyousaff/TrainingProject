package RestAssured;

public class userClass_POST {

     String name;
    String job;

    public userClass_POST(String name, String job)
    {
        setName(name);
        setJob(job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
