package zadanieScrum;

import java.text.DecimalFormat;
import java.util.*;

public class TaskProvider {
    private Map<String, List<Task>> tasks = new LinkedHashMap<>();

    public TaskProvider(){
        tasks.put("In progress", Arrays.asList(
                new Task("Deploy to Azure", "Bob", 8),
                new Task("Handle user input", "Jonh", 4)
        ));

        tasks.put("To do",  Arrays.asList(
                new Task("Connect DB", "Jonh", 3),
                new Task("Add users", "Jessica", 2),
                new Task("Configure logging", "Jonh", 1)
        ));

        tasks.put("Done", Arrays.asList(
                new Task("Prepare dataset", "Bob", 5)
        ));
    }

    public void showTask(){
        String content;
        String user;
        int time;

        for (Map.Entry<String, List<Task>> entry : tasks.entrySet()) { //iteracja po Map
            System.out.println(entry.getKey() + "(" + entry.getValue().size() + "): ");
            for (int i = 0; i < entry.getValue().size(); i++) { //List
                content = entry.getValue().get(i).getContent();
                user = entry.getValue().get(i).getUser();
                time = entry.getValue().get(i).getEstimatedTime();
                System.out.println("* " + content + "(" + user + ", " + time + ")");

            }
        }
    }

    public void showTaskByUser(String user){
        int tasksbyUser = 0;
        for (Map.Entry<String, List<Task>> entry: tasks.entrySet()){
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).getUser().equals(user)) {
                    tasksbyUser ++;
                }
            }
        }
        System.out.println(user + " was assigned to " + tasksbyUser + " tasks in this sprint");
    }

    public void showAverangeTime() {
        int sum = 0;
        double averange = 0;
        int tasksNumber = 0;

        for (Map.Entry<String, List<Task>> entry : tasks.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i).getEstimatedTime();
            }
            tasksNumber += entry.getValue().size();
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        averange = (double) sum / tasksNumber;
        System.out.println("Mean approximate time per task is " + df.format(averange));
    }
}
