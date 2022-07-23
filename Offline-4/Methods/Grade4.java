package Methods;

public class Grade4 {
    public int marksInt(String marks){
        double markFloat = Double.parseDouble(marks);
        int result = (int)Math.ceil(markFloat);
        return result;
    }

    public String calculateGrade(String marks){
        String grade="";
        try {
            int mark = marksInt(marks);
        
            if(mark<0){
                grade = "Out of bound!";
            }else if(mark<240){
                grade = "F";
            }else if(mark<280){
                grade = "C";
            }else if(mark<320){
                grade = "B";
            }else if(mark<401){
                grade = "A";
            }else{
                grade = "Out of bound!";
            }

            return grade;
        } catch (Exception e) {
            return "Non-number input.";
        }
    }
    
}
