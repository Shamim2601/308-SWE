package Methods;

public class Grade3 {
    int marksInt(String marks){
        double markFloat = Double.parseDouble(marks);
        int result = (int)Math.ceil(markFloat);
        return result;
    }

    String calculateGrade(String marks){
        String grade="";
        try {
            int mark = marksInt(marks);
        
            if(mark<0){
                grade = "Out of bound!";
            }else if(mark<180){
                grade = "F";
            }else if(mark<210){
                grade = "C";
            }else if(mark<240){
                grade = "B";
            }else if(mark<301){
                grade = "A";
            }else{
                grade = "Out of bound!";
            }

            return grade;
        } catch (Exception e) {
            return "Non-number input.";
        }
    }

    public static void main(String[] args) {
        Grade3 g3 = new Grade3();

        System.out.println(g3.calculateGrade("310"));
    }
}
