package io.github.rm6n.interviewqs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class InterviewController {
    private static final List<String> questionList = new ArrayList<>();

    static {
        questionList.add("Tell me about yourself.");
        questionList.add("Why should we hire you?");
        questionList.add("What's your greatest strength?");
        questionList.add("What's your greatest weakness?");
        questionList.add("Can you describe a challenging situation you faced at work and how you handled it?");
        questionList.add("Where do you see yourself in 5 years?");
        questionList.add("Why did you leave your last job?");
        questionList.add("Tell me about a time you failed and what you learned from it.");
        questionList.add("How do you handle stress or pressure?");
        questionList.add("Describe a situation where you had to work with a difficult coworker.");
        questionList.add("What's your leadership style?");
        questionList.add("How do you stay updated with industry trends and developments?");
        questionList.add("What do you know about our company?");
        questionList.add("Why do you want to work here?");
        questionList.add("Can you provide an example of a time you had to adapt a change at work?");
        questionList.add("What motivates you in your career?");
        questionList.add("Describe a project where you had to meet tight deadlines. How did you manage it?");
        questionList.add("What is your preferred work style: working independently or in a team?");
        questionList.add("How do you handle constructive criticism?");
        questionList.add("Can you describe a time you had to resolve a customer's complaint or issue?");
        questionList.add("How do you handle ambiguity and uncertainty in a project?"); 
        questionList.add("Describe a situation where you had to persuade a team to adopt your idea.");
        questionList.add("How do you prioritize tasks when you have multiple deadlines?");
        questionList.add("Can you discuss a situation where you had to make a difficult situation at work?");
        questionList.add("How do you handle a team member who is not meeting their goals and expectations?");
    }

    @GetMapping("/getQuestion")
    @ResponseBody
    public Map<String, String> getQuestion() {
        int index = (int) (Math.random() * questionList.size());
        Map<String, String> response = new HashMap<>();
        response.put("question", questionList.get(index));
        return response;
    }
    @GetMapping("/")
        public String index() {
    return "index";
}

}
