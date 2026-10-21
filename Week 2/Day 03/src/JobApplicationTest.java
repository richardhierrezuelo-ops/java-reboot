// Final Sorting Exercise G (Practical & Common in Interviews)Create a JobApplication class with the following fields:
// candidateName (String)
// experienceYears (int)
// score (int) — technical interview score (0-100)
// applicationDate (String) — format YYYY-MM-DD
//
//Sort the list of job applications by these rules (in priority order):
// Highest score first (descending)
//Most experience first (descending) — if scores are equal
//Earliest application date first (ascending) — if both score and experience are equal
//Candidate name alphabetically (ascending) — final tie-breaker

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JobApplicationTest {
    public static void main(String[] args) {

        JobApplication a1 = new JobApplication("Rick", 5, 85, "2026-06-01");
        JobApplication a2 = new JobApplication("Portia", 3, 92, "2026-06-05");
        JobApplication a3 = new JobApplication("Mike", 5, 85, "2026-05-20");
        JobApplication a4 = new JobApplication("Anna", 5, 85, "2026-06-01");

        List<JobApplication> jobs = new ArrayList<>();
        jobs.add(a1);
        jobs.add(a2);
        jobs.add(a3);
        jobs.add(a4);

        jobs.sort(Comparator.comparing(JobApplication:: getScore, Comparator.reverseOrder())
                        .thenComparing(JobApplication:: getExperienceYears, Comparator.reverseOrder())
                        .thenComparing(JobApplication:: getApplicationDate)
                        .thenComparing(JobApplication:: getCandidateName)
                );

        for (JobApplication job : jobs) {
            System.out.println(job);
        }
    }
}
