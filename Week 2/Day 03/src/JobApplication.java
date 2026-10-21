// Final Sorting Exercise G (Practical & Common in Interviews)Create a JobApplication class with the following fields:
// candidateName (String)
// experienceYears (int)
// score (int) — technical interview score (0-100)
// applicationDate (String) — format YYYY-MM-DD
//
//Sort the list of job applications by these rules (in priority order):Highest score first (descending)
//Most experience first (descending) — if scores are equal
//Earliest application date first (ascending) — if both score and experience are equal
//Candidate name alphabetically (ascending) — final tie-breaker

public class JobApplication {
    private String candidateName;
    private int experienceYears;
    private int score;
    private String applicationDate;

    public JobApplication(String candidateName, int experienceYears, int score, String applicationDate) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
        this.score = score;
        this.applicationDate = applicationDate;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getScore() {
        return score;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    @Override
    public String toString() {
        return candidateName + " | " + experienceYears + " | " + score + " | " + applicationDate;
    }
}
