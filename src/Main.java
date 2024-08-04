import com.alicansadeler.gym.FitnessCenter;
import com.alicansadeler.gym.OldSchoolGym;
import com.alicansadeler.gym.StudentInfo;
import com.alicansadeler.gym.FatRate;
import com.alicansadeler.gym.enums.Gender;
import com.alicansadeler.gym.enums.TrainingType;

public class Main {
    public static void main(String[] args) {

        StudentInfo[] students = new StudentInfo[3];
        students[0] = new StudentInfo("Ali Can Sadeler", 30, new FatRate(100, 40, 90, 183, Gender.MALE), true, TrainingType.PPL);
        students[1] = new StudentInfo("Ali Can Sadeler", 30, new FatRate(100, 40, 90, 183, Gender.FEMALE), true, TrainingType.PPL);
        students[2] = new StudentInfo("Özden ", 29, new FatRate(70, 36, 76, 187, Gender.FEMALE), true, TrainingType.PPL);

        FitnessCenter oxygenWellness = new OldSchoolGym("Oxygen Welness", "Erzurum", "Acun Ilıcalı", students);

        System.out.println(oxygenWellness.toString());

        System.out.println("----------------------------------------------------------------------------------");
    }
}


